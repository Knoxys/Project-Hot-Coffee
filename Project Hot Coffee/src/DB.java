import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DB {

	public void setDB() {

		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = (Connection) DriverManager.getConnection(url, user, password);

			Statement stt = con.createStatement();

			/**
			 * Create and select a database for use.
			 */
			stt.execute("CREATE DATABASE IF NOT EXISTS test");
			stt.execute("USE test");

			/**
			 * Create an example table
			 */
			stt.execute("DROP TABLE IF EXISTS people");
			stt.execute("CREATE TABLE people (" + "id BIGINT NOT NULL AUTO_INCREMENT," + "fname VARCHAR(25),"
					+ "lname VARCHAR(25)," + "PRIMARY KEY(id)" + ")");

			/**
			 * Add entries to the example table
			 */
			stt.execute("INSERT INTO people (fname, lname) VALUES"
					+ "('Joe', 'Bloggs'), ('Mary', 'Bloggs'), ('Jill', 'Hill')");

			/**
			 * Query people entries with the lname 'Bloggs'
			 */
			ResultSet res = stt.executeQuery("SELECT * FROM people WHERE lname = 'Bloggs'");

			/**
			 * Iterate over the result set from the above query
			 */
			while (res.next()) {
				System.out.println(res.getString("fname") + " " + res.getString("lname"));
			}
			System.out.println("");

			/**
			 * Same as the last query, but using a prepared statement. Prepared
			 * statements should be used when building query strings from user
			 * input as they protect against SQL injections
			 */
			PreparedStatement prep = con.prepareStatement("SELECT * FROM people WHERE lname = ?");
			prep.setString(1, "Bloggs");

			res = prep.executeQuery();
			while (res.next()) {
				System.out.println(res.getString("fname") + " " + res.getString("lname"));
			}

			/**
			 * Free all opened resources
			 */
			res.close();
			stt.close();
			prep.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
