public class TicketSystem {

	public static void main(String[] args) {

		try {

			Benutzer b = new Benutzer();
			Wahl 	 w = new Wahl();
			DBschreiben 		db = new DBschreiben();
			Zeit 	 z = new Zeit();
			// Dokument d = new Dokument();

			b.setName();
			w.setStichwort();
			z.setZeitStempel();
			db.setDB();
			// d.setDokument();

		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}

	}
}
