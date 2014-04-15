

// Class for tag Qty
class Qty {

	string _Typ;
	string _Long;
	string _Short;
	
	
	// default constructor
	
	public Qty ( ) {   
		this._Typ = "SOD";
		this._Long = "35";
		this._Short = "0";
		
		
	}
	
	public Qty ( string Typ, string Long, string Short ) {
		this._Typ = Typ;
		this._Long = Long;
		this._Short = Short;
		
	}
	
	
} 