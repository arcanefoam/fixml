package object;



// Class for tag SubID
public class SubID {

  String SenderFIXTag;
  String TargetFIXTag;
  String OnBehalfOfFIXTag;
  String DeliverToFIXTag;


  // default constructor
  public SubID ( String SenderFIXTag, String TargetFIXTag, String OnBehalfOfFIXTag, String DeliverToFIXTag ) {
    this.SenderFIXTag = SenderFIXTag;
    this.TargetFIXTag = TargetFIXTag;
    this.OnBehalfOfFIXTag = OnBehalfOfFIXTag;
    this.DeliverToFIXTag = DeliverToFIXTag;
  
  }


  public SubID ( ) {   
  
this.SenderFIXTag = "50";
this.TargetFIXTag = "57";
this.OnBehalfOfFIXTag = "116";
this.DeliverToFIXTag = "129";
  
  }
      

} 