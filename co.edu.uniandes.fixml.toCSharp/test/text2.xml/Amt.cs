namespace text2.xml;



// Class for tag Amt
class Amt {

	string Typ;
	string Amt;
	
	
	// default constructor
	
	Amt ( ) {   
		this.Typ = "FMTM";
		this.Amt = "0.00";
		
		
	}
	
	Amt ( String Typ, String Amt ) {
		this.Typ = Typ;
		this.Amt = Amt;
		
	}
	
	
} 