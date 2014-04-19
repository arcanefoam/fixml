
using System.Collections.Generic;
// Class for tag Header
class Header {


  List<Sender> _Senders = new List<Sender>();
  List<Target> _Targets = new List<Target>();
  List<SendingTime> _SendingTimes = new List<SendingTime>();

  // default constructor

  public Header ( ) {   
;
  
Sender Header_Sender_0= new Sender();
CompID Header_Sender_0_CompID_0= new CompID();
Header_Sender_0.AddCompID( Header_Sender_0_CompID_0 );
  		
SubID Header_Sender_0_SubID_1= new SubID("50", "57", "116", "129");
Header_Sender_0.AddSubID( Header_Sender_0_SubID_1 );
  		
this.AddSender( Header_Sender_0 );
  		
Target Header_Target_1= new Target();
CompID Header_Target_1_CompID_0= new CompID();
Header_Target_1.AddCompID( Header_Target_1_CompID_0 );
  		
SubID Header_Target_1_SubID_1= new SubID("50", "57", "116", "129");
Header_Target_1.AddSubID( Header_Target_1_SubID_1 );
  		
this.AddTarget( Header_Target_1 );
  		
SendingTime Header_SendingTime_2= new SendingTime();
this.AddSendingTime( Header_SendingTime_2 );
  		
 
  }
    
  public Header (  ) {
  
  }
  
  public void AddSender( Sender child ) {
    this._Senders.Add( child );
  }
  
  public void AddTarget( Target child ) {
    this._Targets.Add( child );
  }
  
  public void AddSendingTime( SendingTime child ) {
    this._SendingTimes.Add( child );
  }
  

} 