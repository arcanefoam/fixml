namespace text2.xml;



// Class for tag Qty
class Qty {

	string Typ;
	string Long;
	string Short;
	
	
	// default constructor
	
	Qty ( ) {   
		this.Typ = "SOD";
		this.Long = "35";
		this.Short = "0";
		
		
	}
	
	Qty ( String Typ, String Long, String Short ) {
		this.Typ = Typ;
		this.Long = Long;
		this.Short = Short;
		
	}
	
	
} 