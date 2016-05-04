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
			stt.execute("CREATE DATABASE IF NOT EXISTS TICKETSYSTEM");
			stt.execute("USE TICKETSYSTEM");

			/**
			 * Create an example table
			 */
			stt.execute("DROP TABLE IF EXISTS TICKET");
			stt.execute("CREATE TABLE TICKET (" + "id BIGINT NOT NULL AUTO_INCREMENT," + "NAME VARCHAR(25),"
					+ "STICHWORT VARCHAR(25)," + "ZEIT VARCHAR(25)," + "PRIMARY KEY(id)" + ")");

			/**
			 * Add entries to the example table
			 */
			stt.execute("INSERT INTO TICKET (NAME, STICHWORT, ZEIT) VALUES"
					+ "('Joe', 'Blackscreen', '22.06.2016'), ('Mary', 'Nullpointer', '22.05.2014'), ('Jill', 'Neues Ticket', '07.08.2013')");

			/**
			 * Query TICKET entries with the Name 'Bloggs'
			 */
			ResultSet res = stt.executeQuery("SELECT * FROM TICKET WHERE STICHWORT = 'Nullpointer'");

			/**
			 * Iterate over the result set from the above query
			 */
			while (res.next()) {
				System.out.println(res.getString("NAME") + " " + res.getString("STICHWORT"));
			}
			System.out.println("");

			/**
			 * Same as the last query, but using a prepared statement. Prepared
			 * statements should be used when building query strings from user
			 * input as they protect against SQL injections
			 */
			PreparedStatement prep = con.prepareStatement("SELECT * FROM TICKET WHERE NAME = ?");
			prep.setString(1, "Joe");

			res = prep.executeQuery();
			while (res.next()) {
				System.out.println(res.getString("NAME") + " " + res.getString("NAME"));
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
