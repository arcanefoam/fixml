namespace text2.xml;



// Class for tag Sndr
class Sndr {

	string ID;
	string Sub;
	string Loc;
	
	
	// default constructor
	
	Sndr ( ) {   
		this.ID = "String";
		this.Sub = "String";
		this.Loc = "String";
		
		
	}
	
	Sndr ( String ID, String Sub, String Loc ) {
		this.ID = ID;
		this.Sub = Sub;
		this.Loc = Loc;
		
	}
	
	
} 