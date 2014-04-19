package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag OrderDuration
public class OrderDuration {


  List<TimeInForce> TimeInForces = new ArrayList<TimeInForce>();



  public OrderDuration ( ) {   
  
;
  
TimeInForce OrderDuration_TimeInForce_0= new TimeInForce();
this.addTimeInForce( OrderDuration_TimeInForce_0 );
  		
  }
      
  public void addTimeInForce( TimeInForce child ) {
    this.TimeInForces.add( child );
  }

} 