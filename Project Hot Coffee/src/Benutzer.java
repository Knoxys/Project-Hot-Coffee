
import java.util.Scanner;

public class Benutzer {
	private Scanner sc = new Scanner(System.in);
	private String word;

	public Benutzer() {

	}

	public void getName() {
		System.out.println("Bitte gib dein Name ein");
		// BEISPIEL für nur Buchstaben

		while (!sc.hasNext("[A-Za-z]+")) {
			System.out.println("Bitte Buchstaben eingeben");
			sc.next();
		}

		word = sc.next();
		System.out.println("Danke schön! " + word);
		// BEISPIL ENDE

	}

}
