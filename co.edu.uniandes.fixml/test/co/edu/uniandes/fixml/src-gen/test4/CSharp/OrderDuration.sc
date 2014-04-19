
using System.Collections.Generic;
// Class for tag OrderDuration
class OrderDuration {


  List<TimeInForce> _TimeInForces = new List<TimeInForce>();

  // default constructor

  public OrderDuration ( ) {   
;
  
TimeInForce OrderDuration_TimeInForce_0= new TimeInForce();
this.AddTimeInForce( OrderDuration_TimeInForce_0 );
  		
 
  }
    
  public OrderDuration (  ) {
  
  }
  
  public void AddTimeInForce( TimeInForce child ) {
    this._TimeInForces.Add( child );
  }
  

} 