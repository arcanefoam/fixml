package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag OrderType
public class OrderType {


  List<LimitOrder> LimitOrders = new ArrayList<LimitOrder>();



  public OrderType ( ) {   
  
;
  
LimitOrder OrderType_LimitOrder_0= new LimitOrder();
Price OrderType_LimitOrder_0_Price_0= new Price();
OrderType_LimitOrder_0.addPrice( OrderType_LimitOrder_0_Price_0 );
  		
this.addLimitOrder( OrderType_LimitOrder_0 );
  		
  }
      
  public void addLimitOrder( LimitOrder child ) {
    this.LimitOrders.add( child );
  }

} 