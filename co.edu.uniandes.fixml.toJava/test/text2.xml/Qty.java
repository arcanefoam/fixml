package text2.xml;



// Class for tag Qty
public class Qty {

	String Typ;
	String Long;
	String Short;
	
	
	// default constructor
	public Qty ( String Typ, String Long, String Short ) {
		this.Typ = Typ;
		this.Long = Long;
		this.Short = Short;
		
	}
	
	
	public Qty ( ) {   
	
		this.Typ = "SOD";
		this.Long = "35";
		this.Short = "0";
		
	}
	
	
} 