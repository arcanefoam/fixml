
using System.Collections.Generic;
// Class for tag OrderType
class OrderType {


  List<LimitOrder> _LimitOrders = new List<LimitOrder>();

  // default constructor

  public OrderType ( ) {   
;
  
LimitOrder OrderType_LimitOrder_0= new LimitOrder();
Price OrderType_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
OrderType_LimitOrder_0.AddPrice( OrderType_LimitOrder_0_Price_0 );
  		
this.AddLimitOrder( OrderType_LimitOrder_0 );
  		
 
  }
    
  public OrderType (  ) {
  
  }
  
  public void AddLimitOrder( LimitOrder child ) {
    this._LimitOrders.Add( child );
  }
  

} 