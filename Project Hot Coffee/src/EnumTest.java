
public class EnumTest {
	//http://www.torsten-horn.de/techdocs/java-enums.htm
	public static void main( String[] args )
	   {
	      for( Stichwort s : Stichwort.values() )
	         System.out.println( s );
	   }
	}

	enum Stichwort            // Enum-Typ
	{
	   Blackscreen, Nullpointer, Exception, NeuesTicket;  // Enumerationskonstanten
	}
	
