package object;



// Class for tag Price
public class Price {

  String Min;
  String Max;


  // default constructor
  public Price ( String Min, String Max ) {
    this.Min = Min;
    this.Max = Max;
  
  }


  public Price ( ) {   
  
this.Min = "0";
this.Max = "99999999.9999";
  
  }
      

} 