//1. Methode
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

//2. Methode
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Dokument {
	public static void main(String args[]) throws IOException {

		//1. METHODE
		File file = new File("Hello1.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		writer.write("This\n is\n an\n example\n");
		writer.flush();
		writer.close();

		// Creates a FileReader Object
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		fr.read(a); // reads the content to the array
		for (char c : a)
			System.out.print(c); // prints the characters one by one
		fr.close();
		//1. METHODE ENDE
		
		//2.Methode
		

			try {
				mybean mb = new mybean("first value", "second value");

				// write object to file
				FileOutputStream fos = new FileOutputStream("mybean.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(mb);
				oos.close();

				// read object from file
				FileInputStream fis = new FileInputStream("mybean.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				mybean result = (mybean) ois.readObject();
				ois.close();

				//http://avajava.com/tutorials/lessons/how-do-i-write-an-object-to-a-file-and-read-it-back.html
				System.out.println("One:" + result.getOne() + ", Two:" + result.getTwo());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}


