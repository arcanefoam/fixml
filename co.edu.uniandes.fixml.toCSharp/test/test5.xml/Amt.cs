

// Class for tag Amt
class Amt {

	string _Amt;
	string _Typ;
	
	
	// default constructor
	
	public Amt ( ) {   
		this._Amt = "0.00";
		this._Typ = "FMTM";
		
		
	}
	
	public Amt ( string Amt, string Typ ) {
		this._Amt = Amt;
		this._Typ = Typ;
		
	}
	
	
} 