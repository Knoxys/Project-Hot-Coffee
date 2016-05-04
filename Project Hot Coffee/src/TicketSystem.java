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
			b.getName();
			w.getStichwort();
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}
		
		// Datenbank BEISPIEL https://nodehead.com/java-how-to-connect-to-xampps-mysql-in-eclipse/
		/**
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost:3306/";
        
        /**
         * The MySQL user.
         */
        String user = "root";
        
        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";
        
        try
        {
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
            stt.execute("CREATE TABLE people (" +
                    "id BIGINT NOT NULL AUTO_INCREMENT,"
                    + "fname VARCHAR(25),"
                    + "lname VARCHAR(25),"
                    + "PRIMARY KEY(id)"
                    + ")");
            
            /**
             * Add entries to the example table
             */
            stt.execute("INSERT INTO people (fname, lname) VALUES" + 
                    "('Joe', 'Bloggs'), ('Mary', 'Bloggs'), ('Jill', 'Hill')");
            
            /**
             * Query people entries with the lname 'Bloggs'
             */
            ResultSet res = stt.executeQuery("SELECT * FROM people WHERE lname = 'Bloggs'");
            
            /**
             * Iterate over the result set from the above query
             */
            while (res.next())
            {
                System.out.println(res.getString("fname") + " " + res.getString("lname"));
            }
            System.out.println("");
            
            /**
             * Same as the last query, but using a prepared statement. 
             * Prepared statements should be used when building query strings
             * from user input as they protect against SQL injections
             */
            PreparedStatement prep = con.prepareStatement("SELECT * FROM people WHERE lname = ?");
            prep.setString(1, "Bloggs");
            
            res = prep.executeQuery();
            while (res.next())
            {
                System.out.println(res.getString("fname") + " " + res.getString("lname"));
            }
            
            /**
             * Free all opened resources
             */
            res.close();
            stt.close();
            prep.close();
            con.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
		}
		//BEISPIEL ENDE
	}


