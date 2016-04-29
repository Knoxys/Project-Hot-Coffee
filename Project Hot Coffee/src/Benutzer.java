import java.util.InputMismatchException;
import java.util.Scanner;

public class Benutzer {
	private Scanner scan = new Scanner(System.in);
	private String name;
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
	
}
