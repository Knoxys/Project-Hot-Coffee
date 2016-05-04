//Für das Datenbank BEISPIEL
/**
 * Imports all entries from the java.sql library. 
 * Improve on this by only importing needed classes. 
 * E.g.:
 * import java.sql.Connection
 * import java.sql.Statement
 * ...
 */
import java.sql.*;
import com.mysql.jdbc.Connection;

public class TicketSystem {

	public static void main(String[] args) {
		
		try {
			// 1. METHODE Passwort BEIPSIEL
			new Passwort().passwordExample();
			//BEISPIEL ENDE
			
			Benutzer b = new Benutzer();
			Wahl w = new Wahl();
			DB d = new DB();
			b.getName();
			w.getStichwort();
			d.setDB();
			
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}
		
		
	}
}


