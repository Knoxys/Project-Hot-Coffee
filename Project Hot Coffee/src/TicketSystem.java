	import java.util.Scanner;
	
	public class TicketSystem {
	
		// 1) get name
		// 2) select movie
		// 3) select seat
		// 4) print out
		
		
		 // Beispiel für die Methode zu Eingabe Des Namen und zur ausführung des Namen
		 // Desweiteren muss static hinter Scanner, weil Public main Void
		 // https://www.youtube.com/watch?v=5QzyHxv-XxI
		 
		
		
		
		
		static Scanner scan = new Scanner(System.in);
		static String name;
			// Die Stichwörter von dem der Anwender wählen kann!
		static String[] stichwort = {"1) Blackscreen","2) Exception","3) Nullpointer","4) Anders Problem bzw. Neues Ticket eröffnen"};
		static int nummer;
		
		
		
		public static void getName(){
			System.out.println("Bitte gib dein Name ein");
			name=scan.nextLine();
			System.out.println("Hallo "+name);
			getStichwort();
			}
		
		
		
		public static void getStichwort(){
			System.out.println("Bitte wähl ein Stichwort");
			for (int i=0;i<stichwort.length;i++){
				System.out.println(stichwort[i]);
			}
			int nummer=scan.nextInt();
			
			System.out.println("Du hast gewähl "+stichwort[nummer-1].substring(3,stichwort[nummer-1].length()));
			}
		
		
		
		public static void main(String [] args) {
			getName();
			}
		
		
		
			}
