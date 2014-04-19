

// Class for tag Rule80A
class Rule80A {

  string _Value;
  string _FIXTag;
  string _DataType;


  // default constructor

  public Rule80A ( ) {   
this._Value = "A";
this._FIXTag = "47";
this._DataType = "char";
  
 
  }
    
  public Rule80A ( string Value, string FIXTag, string DataType ) {
    this._Value = Value;
    this._FIXTag = FIXTag;
    this._DataType = DataType;
  
  }
  

} 