namespace text2.xml;



// Class for tag Instrmt
class Instrmt {

	string Sym;
	string ID;
	string IDSrc;
	string CFI;
	string MMY;
	string Mat;
	string Strk;
	string StrkCcy;
	string Mult;
	
	
	// default constructor
	
	Instrmt ( ) {   
		this.Sym = "AOL";
		this.ID = "KW";
		this.IDSrc = "3";
		this.CFI = "OCASPS";
		this.MMY = "20031122";
		this.Mat = "2003-11-22T00:00:00";
		this.Strk = "47.50";
		this.StrkCcy = "USD";
		this.Mult = "100";
		
		
	}
	
	Instrmt ( String Sym, String ID, String IDSrc, String CFI, String MMY, String Mat, String Strk, String StrkCcy, String Mult ) {
		this.Sym = Sym;
		this.ID = ID;
		this.IDSrc = IDSrc;
		this.CFI = CFI;
		this.MMY = MMY;
		this.Mat = Mat;
		this.Strk = Strk;
		this.StrkCcy = StrkCcy;
		this.Mult = Mult;
		
	}
	
	
} 