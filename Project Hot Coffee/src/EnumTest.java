
public class EnumTest {
	// http://www.torsten-horn.de/techdocs/java-enums.htm
	public static void main(String[] args) {
		for (auswahl s : auswahl.values())
			System.out.println(s);
	}
}

enum auswahl { // Enum-Typ {
	Blackscreen, Nullpointer, Exception, NeuesTicket; // Enumerationskonstanten
}
