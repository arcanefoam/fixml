

// Class for tag Qty
class Qty {

	string _Long;
	string _Short;
	string _Typ;
	
	
	// default constructor
	
	public Qty ( ) {   
		this._Long = "35";
		this._Short = "0";
		this._Typ = "SOD";
		
		
	}
	
	public Qty ( string Long, string Short, string Typ ) {
		this._Long = Long;
		this._Short = Short;
		this._Typ = Typ;
		
	}
	
	
} 