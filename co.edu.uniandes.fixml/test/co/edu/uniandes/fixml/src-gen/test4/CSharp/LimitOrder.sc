
using System.Collections.Generic;
// Class for tag LimitOrder
class LimitOrder {


  List<Price> _Prices = new List<Price>();

  // default constructor

  public LimitOrder ( ) {   
;
  
Price LimitOrder_Price_0= new Price("0", "99999999.9999");
this.AddPrice( LimitOrder_Price_0 );
  		
 
  }
    
  public LimitOrder (  ) {
  
  }
  
  public void AddPrice( Price child ) {
    this._Prices.Add( child );
  }
  

} 