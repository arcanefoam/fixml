

// Class for tag Amt
class Amt {

	string _Typ;
	string _Amt;
	
	
	// default constructor
	
	public Amt ( ) {   
		this._Typ = "FMTM";
		this._Amt = "0.00";
		
		
	}
	
	public Amt ( string Typ, string Amt ) {
		this._Typ = Typ;
		this._Amt = Amt;
		
	}
	
	
} 