import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class TicketSystem {

	// Beispiel für die Methode zu Eingabe Des Namen und zur ausführung des
	// Namen
	// Desweiteren muss static hinter Scanner, weil Public main Void
	// https://www.youtube.com/watch?v=5QzyHxv-XxI

//	public static void getTicket(){
//		Ticket Fehler1 = new Ticket();
//		String ticketname = scan.nextLine();
//		
//		long yourmilliseconds = System.currentTimeMillis();
//		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
//		Date resultdate = new Date(yourmilliseconds);
//		System.out.println(sdf.format(resultdate));
//		
//		/*Fehler1.setNewStichwort(ticketname, zeit);
//		*System.out.println(zeit);
//		*System.out.println(ticketname);
//		*/
//	}
	
	

	public static void main(String[] args) {
		try {
			Benutzer b = new Benutzer();
			b.getName();
			b.getStichwort();
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}

	}

}
