

// Class for tag Instrmt
class Instrmt {

	string _CFI;
	string _ID;
	string _IDSrc;
	string _MMY;
	string _Mat;
	string _Mult;
	string _Strk;
	string _StrkCcy;
	string _Sym;
	
	
	// default constructor
	
	public Instrmt ( ) {   
		this._CFI = "OCASPS";
		this._ID = "KW";
		this._IDSrc = "J";
		this._MMY = "20031122";
		this._Mat = "2003-11-22T00:00:00";
		this._Mult = "100";
		this._Strk = "47.50";
		this._StrkCcy = "USD";
		this._Sym = "AOL";
		
		
	}
	
	public Instrmt ( string CFI, string ID, string IDSrc, string MMY, string Mat, string Mult, string Strk, string StrkCcy, string Sym ) {
		this._CFI = CFI;
		this._ID = ID;
		this._IDSrc = IDSrc;
		this._MMY = MMY;
		this._Mat = Mat;
		this._Mult = Mult;
		this._Strk = Strk;
		this._StrkCcy = StrkCcy;
		this._Sym = Sym;
		
	}
	
	
} 