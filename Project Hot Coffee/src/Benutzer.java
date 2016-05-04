
import java.util.Scanner;

public class Benutzer {
	private Scanner sc = new Scanner(System.in);
	private String name;

	public Benutzer() {

	}

	public void getBenutzer(String benutzername, String password) {

	}

	public void getName() {
		System.out.println("Bitte gib dein Name ein");
		// BEISPIEL für nur Buchstaben

		while (!sc.hasNext("[A-Za-z]+")) {
			System.out.println("Bitte Buchstaben eingeben");
			sc.next();
		}

		name = sc.next();
		System.out.println("Danke schön! " + name);
		// BEISPIL ENDE

	}

}
