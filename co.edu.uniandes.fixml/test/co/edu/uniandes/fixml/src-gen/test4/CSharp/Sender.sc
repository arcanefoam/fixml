
using System.Collections.Generic;
// Class for tag Sender
class Sender {


  List<CompID> _CompIDs = new List<CompID>();
  List<SubID> _SubIDs = new List<SubID>();

  // default constructor

  public Sender ( ) {   
;
  
CompID Sender_CompID_0= new CompID();
this.AddCompID( Sender_CompID_0 );
  		
SubID Sender_SubID_1= new SubID("50", "57", "116", "129");
this.AddSubID( Sender_SubID_1 );
  		
 
  }
    
  public Sender (  ) {
  
  }
  
  public void AddCompID( CompID child ) {
    this._CompIDs.Add( child );
  }
  
  public void AddSubID( SubID child ) {
    this._SubIDs.Add( child );
  }
  

} 