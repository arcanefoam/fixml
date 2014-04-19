
using System.Collections.Generic;
// Class for tag OrderQuantity
class OrderQuantity {


  List<OrderQty> _OrderQtys = new List<OrderQty>();

  // default constructor

  public OrderQuantity ( ) {   
;
  
OrderQty OrderQuantity_OrderQty_0= new OrderQty();
this.AddOrderQty( OrderQuantity_OrderQty_0 );
  		
 
  }
    
  public OrderQuantity (  ) {
  
  }
  
  public void AddOrderQty( OrderQty child ) {
    this._OrderQtys.Add( child );
  }
  

} 