namespace text1.xml;



// Class for tag Instrmt
class Instrmt {

	string Sym;
	string ID;
	string IDSrc;
	
	
	// default constructor
	
	Instrmt ( ) {   
		this.Sym = "IBM";
		this.ID = "459200101";
		this.IDSrc = "1";
		
		
	}
	
	Instrmt ( String Sym, String ID, String IDSrc ) {
		this.Sym = Sym;
		this.ID = ID;
		this.IDSrc = IDSrc;
		
	}
	
	
} 