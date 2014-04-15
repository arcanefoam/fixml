

// Class for tag Instrmt
class Instrmt {

	string _Sym;
	string _ID;
	string _IDSrc;
	string _CFI;
	string _MMY;
	string _Mat;
	string _Strk;
	string _StrkCcy;
	string _Mult;
	
	
	// default constructor
	
	public Instrmt ( ) {   
		this._Sym = "AOL";
		this._ID = "KW";
		this._IDSrc = "3";
		this._CFI = "OCASPS";
		this._MMY = "20031122";
		this._Mat = "2003-11-22T00:00:00";
		this._Strk = "47.50";
		this._StrkCcy = "USD";
		this._Mult = "100";
		
		
	}
	
	public Instrmt ( string Sym, string ID, string IDSrc, string CFI, string MMY, string Mat, string Strk, string StrkCcy, string Mult ) {
		this._Sym = Sym;
		this._ID = ID;
		this._IDSrc = IDSrc;
		this._CFI = CFI;
		this._MMY = MMY;
		this._Mat = Mat;
		this._Strk = Strk;
		this._StrkCcy = StrkCcy;
		this._Mult = Mult;
		
	}
	
	
} 