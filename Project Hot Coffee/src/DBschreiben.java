import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

/**
 * https://nodehead.com/java-how-to-connect-to-xampps-mysql-in-eclipse/
 * @author Knoxys
 *
 */

public class DBschreiben {

	public void setDB() {
		
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		
		//BEISPIEL
		//Benutzer b = new Benutzer();
		//b.getName(name);
		//Beispiel ENDE
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = (Connection) DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();

			/**
			 * Erstelle und benutze eine Datenbank.
			 */
			stt.execute("CREATE DATABASE IF NOT EXISTS TICKETSYSTEM");
			stt.execute("USE TICKETSYSTEM");

			/**
			 * Erstelle eine Tabelle.
			 */
			stt.execute("DROP TABLE IF EXISTS TICKET");
			stt.execute("CREATE TABLE TICKET " 
					+"(" 
					+ "id BIGINT NOT NULL AUTO_INCREMENT," 
					+ "NAME VARCHAR(25),"
					+ "STICHWORT VARCHAR(25)," 
					+ "ZEIT VARCHAR(25)," 
					+ "PRIMARY KEY(id)" 
					+ ")");

			/**
			 * Füge einträge in die Tabelle !!!! An dieser Stelle muss ich
			 * ansetzen !!!!!!
			 */
			stt.execute("INSERT INTO TICKET (NAME, STICHWORT, ZEIT) VALUES"
					+ "('Joe', 'Blackscreen', '22.06.2016'), "
					+ "('Mary', 'Nullpointer', '22.05.2014'), "
					+ "('Jill', 'Neues Ticket', '07.08.2013')");
			
			stt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}