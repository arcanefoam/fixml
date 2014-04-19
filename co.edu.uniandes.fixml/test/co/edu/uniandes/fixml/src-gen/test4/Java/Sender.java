package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Sender
public class Sender {


  List<CompID> CompIDs = new ArrayList<CompID>();
  List<SubID> SubIDs = new ArrayList<SubID>();



  public Sender ( ) {   
  
;
  
CompID Sender_CompID_0= new CompID();
this.addCompID( Sender_CompID_0 );
  		
SubID Sender_SubID_1= new SubID("50", "57", "116", "129");
this.addSubID( Sender_SubID_1 );
  		
  }
      
  public void addCompID( CompID child ) {
    this.CompIDs.add( child );
  }
  public void addSubID( SubID child ) {
    this.SubIDs.add( child );
  }

} 