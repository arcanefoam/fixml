

// Class for tag SubID
class SubID {

  string _SenderFIXTag;
  string _TargetFIXTag;
  string _OnBehalfOfFIXTag;
  string _DeliverToFIXTag;


  // default constructor

  public SubID ( ) {   
this._SenderFIXTag = "50";
this._TargetFIXTag = "57";
this._OnBehalfOfFIXTag = "116";
this._DeliverToFIXTag = "129";
  
 
  }
    
  public SubID ( string SenderFIXTag, string TargetFIXTag, string OnBehalfOfFIXTag, string DeliverToFIXTag ) {
    this._SenderFIXTag = SenderFIXTag;
    this._TargetFIXTag = TargetFIXTag;
    this._OnBehalfOfFIXTag = OnBehalfOfFIXTag;
    this._DeliverToFIXTag = DeliverToFIXTag;
  
  }
  

} 