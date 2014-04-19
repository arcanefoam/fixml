package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag LimitOrder
public class LimitOrder {


  List<Price> Prices = new ArrayList<Price>();



  public LimitOrder ( ) {   
  
;
  
Price LimitOrder_Price_0= new Price();
this.addPrice( LimitOrder_Price_0 );
  		
  }
      
  public void addPrice( Price child ) {
    this.Prices.add( child );
  }

} 