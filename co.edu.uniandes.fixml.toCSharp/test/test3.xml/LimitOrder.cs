
using System.Collections.Generic;
// Class for tag LimitOrder
class LimitOrder {

	string _Value;
	
	List<Price> _Prices = new List<Price>();
	
	// default constructor
	
	public LimitOrder ( ) {   
		this._Value = "2";
		
		Price LimitOrder_Price= new Price();
		this.AddPrice( LimitOrder_Price );
		
		
	}
	
	public LimitOrder ( string Value ) {
		this._Value = Value;
		
	}
	
	public void AddPrice( Price child ) {
		this._Prices.Add( child );
	}
	
	
} 