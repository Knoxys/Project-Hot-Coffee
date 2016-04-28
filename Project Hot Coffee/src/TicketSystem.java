import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class TicketSystem {

	// Beispiel für die Methode zu Eingabe Des Namen und zur ausführung des
	// Namen
	// Desweiteren muss static hinter Scanner, weil Public main Void
	// https://www.youtube.com/watch?v=5QzyHxv-XxI

	static Scanner scan = new Scanner(System.in);
	static String name;
	static int nummer;
	static String[] stichwort = { "1) Blackscreen", "2) Exception", "3) Nullpointer", "4) Neues Ticket eröffnen" };

	public static void getName() {
		System.out.println("Bitte gib dein Name ein");
		boolean done = false;
		while (!done){
			try {
				name = scan.nextLine();
				//Ausbau fähig; http://www.tutorialspoint.com/java/util/scanner_hasnext_string.htm
				scan.next(name);
				done = true;
				System.out.println("Hallo " + name);
				getStichwort();
			}
			
			catch (InputMismatchException e){
				System.out.println("Ich Brauch Buchstaben");
			}
			
		}
		
	}

	public static void getStichwort() {
		System.out.println("Bitte wähl ein Stichwort");
		// http://stackoverflow.com/questions/35471870/infinite-loop-while-catching-an-exception
		boolean done = false;
		while (!done) {
			try {
				for (int i = 0; i < stichwort.length; i++) {
					System.out.println(stichwort[i]);
				}

				int nummer = scan.nextInt();
				done = true;
				System.out.println(
						"Du hast gewähl " + stichwort[nummer - 1].substring(3, stichwort[nummer - 1].length()));
				// Hier sollte es weiter gehen!
				getTicket();
			}

			catch (InputMismatchException e) {
				System.out.println("Ich Brauche eine Zahl");
				scan.next();
				
			}

		}

	}
	
	public static void getTicket(){
		Ticket Fehler1 = new Ticket();
		name = scan.nextLine();
		int Zeit = (int) System.currentTimeMillis();
		Fehler1.setNewStichwort(name, Zeit);
		return;
	}

	public static void main(String[] args) {
		try {
			getName();
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}

	}

}
