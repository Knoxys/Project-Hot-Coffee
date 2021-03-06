import java.util.InputMismatchException;
import java.util.Scanner;

public class Wahl {

	private Scanner scan = new Scanner(System.in);
	private String[] stichwort = { "1) Blackscreen", "2) Exception", "3) Nullpointer", "4) Neues Ticket eröffnen" };

	public void setStichwort() {
		System.out.println("Bitte wähl ein Stichwort");
		// http://stackoverflow.com/questions/35471870/infinite-loop-while-catching-an-exception
		boolean done = false;
		while (!done) {
			try {
				for (int i = 0; i < stichwort.length; i++) {
					System.out.println(stichwort[i]);
				}

				int nummer = scan.nextInt();

				while (nummer == 1 || nummer == 2 || nummer == 3 || nummer == 4) {
					done = true;
					System.out.println(
							"Du hast gewähl " + stichwort[nummer - 1].substring(3, stichwort[nummer - 1].length()));
					break;
				}

			}

			catch (InputMismatchException e) {
				System.out.println("Ich Brauche eine Zahl zwischen 1-4");
				scan.next();

			}

		}

	}
}
