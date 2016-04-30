public class TicketSystem {

	public static void main(String[] args) {
		try {
			Benutzer b = new Benutzer();
			Wahl f = new Wahl();
			b.getName();
			f.getStichwort();
		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}
		// Datenbank speichern
	}

}
