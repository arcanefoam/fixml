
using System.Collections.Generic;
// Class for tag Target
class Target {


  List<CompID> _CompIDs = new List<CompID>();
  List<SubID> _SubIDs = new List<SubID>();

  // default constructor

  public Target ( ) {   
;
  
CompID Target_CompID_0= new CompID();
this.AddCompID( Target_CompID_0 );
  		
SubID Target_SubID_1= new SubID("50", "57", "116", "129");
this.AddSubID( Target_SubID_1 );
  		
 
  }
    
  public Target (  ) {
  
  }
  
  public void AddCompID( CompID child ) {
    this._CompIDs.Add( child );
  }
  
  public void AddSubID( SubID child ) {
    this._SubIDs.Add( child );
  }
  

} 