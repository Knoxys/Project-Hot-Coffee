import java.io.Console;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;

public class Passwort {

	public void passwordExample() {
		
		 //1. Methode
		Console console = System.console();
		if (console == null) {
			System.out.println("Couldn't get Console instance");
			System.exit(0);
		}

		console.printf("Testing password%n");
		char passwordArray[] = console.readPassword("Enter your secret password: ");
		console.printf("Password entered was: %s%n", new String(passwordArray));
		
		 
		
	
	}
}
