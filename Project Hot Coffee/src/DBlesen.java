import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBlesen {

	public void getDB() {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";

		// BEISPIEL
		// Benutzer b = new Benutzer();
		// b.getName(name);
		// Beispiel ENDE

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = (Connection) DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();
			stt.execute("USE TICKETSYSTEM");
			/**
			 * Sql Ansatz.
			 */
			ResultSet res = stt.executeQuery("SELECT * FROM TICKET WHERE STICHWORT = 'Nullpointer'");

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
				System.out.println(res.getString("NAME") + " " + res.getString("STICHWORT"));
			}

			// BEISPIEL
			ResultSet set = stt.executeQuery("SELECT * FROM TICKET WHERE STICHWORT = 'Blackscreen'");

			while (set.next()) {
				System.out.println(set.getString("NAME") + " " + set.getString("ZEIT"));
			}
			System.out.println("");
			// prep.executeQuery();
			// System.out.println(res.getString("Zeit"));
			// BEISPIEL ENDE
			res.close();
			stt.close();
			prep.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
