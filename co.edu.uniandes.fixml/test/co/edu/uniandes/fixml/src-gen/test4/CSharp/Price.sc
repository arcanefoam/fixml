

// Class for tag Price
class Price {

  string _Min;
  string _Max;


  // default constructor

  public Price ( ) {   
this._Min = "0";
this._Max = "99999999.9999";
  
 
  }
    
  public Price ( string Min, string Max ) {
    this._Min = Min;
    this._Max = Max;
  
  }
  

} 