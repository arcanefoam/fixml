package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Target
public class Target {


  List<CompID> CompIDs = new ArrayList<CompID>();
  List<SubID> SubIDs = new ArrayList<SubID>();



  public Target ( ) {   
  
;
  
CompID Target_CompID_0= new CompID();
this.addCompID( Target_CompID_0 );
  		
SubID Target_SubID_1= new SubID("50", "57", "116", "129");
this.addSubID( Target_SubID_1 );
  		
  }
      
  public void addCompID( CompID child ) {
    this.CompIDs.add( child );
  }
  public void addSubID( SubID child ) {
    this.SubIDs.add( child );
  }

} 