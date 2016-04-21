import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

	
	public class TicketSystem{
	
		 // Beispiel für die Methode zu Eingabe Des Namen und zur ausführung des Namen
		 // Desweiteren muss static hinter Scanner, weil Public main Void
		 // https://www.youtube.com/watch?v=5QzyHxv-XxI

		static Scanner scan = new Scanner(System.in);
		static String name;
		static int nummer;
		static String[] stichwort = {"1) Blackscreen","2) Exception","3) Nullpointer","4) Neues Ticket eröffnen"};
		
		public static void getName(){
			System.out.println("Bitte gib dein Name ein");
			name=scan.nextLine();
			System.out.println("Hallo "+name);
			getStichwort();
			}

		public static void getStichwort(){
			System.out.println("Bitte wähl ein Stichwort");
			//http://stackoverflow.com/questions/35471870/infinite-loop-while-catching-an-exception
			boolean done = false;
			while(!done){
			     	try{
			    	for (int i=0;i<stichwort.length;i++){
			    	System.out.println(stichwort[i]);
			    	}
			    	
			 		int nummer=scan.nextInt(); 
			 		System.out.println("Du hast gewähl "+stichwort[nummer-1].substring(3,stichwort[nummer-1].length()));
			 		done=true;
			 		}
			     	
			     	catch(InputMismatchException e){
			    	System.out.println("Ich Brauch eine Zahl");
			    	//break;
			     	}
			     	
			     	}
			
			}	
		
		

		public static void main(String [] args) {
			try{
			getName();	
			}
			
			catch (Exception e){
			System.out.println("Das kannst du nicht tun");
			System.out.println(e);
			}
			
		}
		
	}
