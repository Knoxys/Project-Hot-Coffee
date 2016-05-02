public class TicketSystem {

	public static void main(String[] args) {
		try {
			Benutzer b = new Benutzer();
			Wahl w = new Wahl();
			b.getName();
			w.getStichwort();
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}
		// Datenbank speichern
	}

}
