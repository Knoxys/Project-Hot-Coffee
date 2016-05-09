public class TicketSystem {

	public static void main(String[] args) {

		try {

			Benutzer 		b 	= new Benutzer();
			Wahl 	 		w 	= new Wahl();
			Zeit 	 		z 	= new Zeit();
			DBschreiben 	dbs = new DBschreiben();
			DBlesen 		dbl = new DBlesen();
			

			b.setName();
			w.setStichwort();
			z.setZeitStempel();
			dbs.setDB();
			dbl.getDB();
			

		}

		catch (Exception e) {
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
		}

	}
}
