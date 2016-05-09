public class TicketSystem {

	public static void main(String[] args) {

		try {

			Benutzer 			b = new Benutzer();
			Wahl 	 			w = new Wahl();
			DBschreiben 		dbschreiben = new DBschreiben();
			Zeit 	 			z = new Zeit();
			DBlesen 			dblesen = new DBlesen();
			// Dokument d = new Dokument();

			b.setName();
			w.setStichwort();
			z.setZeitStempel();
			dbschreiben.setDB();
			dblesen.getDB();
			// d.setDokument();

		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}

	}
}
