package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Header
public class Header {


  List<Sender> Senders = new ArrayList<Sender>();
  List<Target> Targets = new ArrayList<Target>();
  List<SendingTime> SendingTimes = new ArrayList<SendingTime>();



  public Header ( ) {   
  
;
  
Sender Header_Sender_0= new Sender();
CompID Header_Sender_0_CompID_0= new CompID();
Header_Sender_0.addCompID( Header_Sender_0_CompID_0 );
  		
SubID Header_Sender_0_SubID_1= new SubID("50", "57", "116", "129");
Header_Sender_0.addSubID( Header_Sender_0_SubID_1 );
  		
this.addSender( Header_Sender_0 );
  		
Target Header_Target_1= new Target();
CompID Header_Target_1_CompID_0= new CompID();
Header_Target_1.addCompID( Header_Target_1_CompID_0 );
  		
SubID Header_Target_1_SubID_1= new SubID("50", "57", "116", "129");
Header_Target_1.addSubID( Header_Target_1_SubID_1 );
  		
this.addTarget( Header_Target_1 );
  		
SendingTime Header_SendingTime_2= new SendingTime();
this.addSendingTime( Header_SendingTime_2 );
  		
  }
      
  public void addSender( Sender child ) {
    this.Senders.add( child );
  }
  public void addTarget( Target child ) {
    this.Targets.add( child );
  }
  public void addSendingTime( SendingTime child ) {
    this.SendingTimes.add( child );
  }

} 