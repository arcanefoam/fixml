
using System.Collections.Generic;
// Class for tag SecurityType
class SecurityType {


  List<Equity> _Equitys = new List<Equity>();

  // default constructor

  public SecurityType ( ) {   
;
  
Equity SecurityType_Equity_0= new Equity();
this.AddEquity( SecurityType_Equity_0 );
  		
 
  }
    
  public SecurityType (  ) {
  
  }
  
  public void AddEquity( Equity child ) {
    this._Equitys.Add( child );
  }
  

} 