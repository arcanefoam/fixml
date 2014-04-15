

// Class for tag Instrmt
class Instrmt {

	string _Sym;
	string _ID;
	string _IDSrc;
	
	
	// default constructor
	
	public Instrmt ( ) {   
		this._Sym = "IBM";
		this._ID = "459200101";
		this._IDSrc = "1";
		
		
	}
	
	public Instrmt ( string Sym, string ID, string IDSrc ) {
		this._Sym = Sym;
		this._ID = ID;
		this._IDSrc = IDSrc;
		
	}
	
	
} 