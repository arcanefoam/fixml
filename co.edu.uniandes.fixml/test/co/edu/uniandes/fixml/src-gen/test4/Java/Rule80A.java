package object;



// Class for tag Rule80A
public class Rule80A {

  String Value;
  String FIXTag;
  String DataType;


  // default constructor
  public Rule80A ( String Value, String FIXTag, String DataType ) {
    this.Value = Value;
    this.FIXTag = FIXTag;
    this.DataType = DataType;
  
  }


  public Rule80A ( ) {   
  
this.Value = "A";
this.FIXTag = "47";
this.DataType = "char";
  
  }
      

} 