import java.util.InputMismatchException;
import java.util.Scanner;

public class Benutzer {
	private Scanner scan = new Scanner(System.in);
	private String name;
	private int nummer;
	private String[] stichwort = { "1) Blackscreen", "2) Exception", "3) Nullpointer", "4) Neues Ticket eröffnen" };
	public Benutzer() {

	}

	public void getName() {
		System.out.println("Bitte gib dein Name ein");
		// BEISPIEL für nur Buchstaben
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter letters:");
		while (!sc.hasNext("[A-Za-z]+")) {
			System.out.println("Nope, that's not it!");
			sc.next();
		}
		String word = sc.next();
		System.out.println("Thank you! Got " + word);
		// BEISPIL ENDE
		
			try {
				name = scan.nextLine();
				// Ausbau fähig;
				// http://www.tutorialspoint.com/java/util/scanner_hasnext_string.htm

				
				System.out.println("Hallo " + name);
				
			}

			catch (InputMismatchException e) {
				System.out.println("Ich Brauch Buchstaben");
			}

		

	}
	
	public void getStichwort() {
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
				//getTicket();
			}

			catch (InputMismatchException e) {
				System.out.println("Ich Brauche eine Zahl");
				scan.next();
				
			}

		}

	}
}
