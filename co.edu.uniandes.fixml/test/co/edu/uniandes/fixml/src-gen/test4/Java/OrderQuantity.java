package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag OrderQuantity
public class OrderQuantity {


  List<OrderQty> OrderQtys = new ArrayList<OrderQty>();



  public OrderQuantity ( ) {   
  
;
  
OrderQty OrderQuantity_OrderQty_0= new OrderQty();
this.addOrderQty( OrderQuantity_OrderQty_0 );
  		
  }
      
  public void addOrderQty( OrderQty child ) {
    this.OrderQtys.add( child );
  }

} 