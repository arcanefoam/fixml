
using System.Collections.Generic;
// Class for tag Instrument
class Instrument {


  List<Symbol> _Symbols = new List<Symbol>();
  List<SecurityType> _SecurityTypes = new List<SecurityType>();

  // default constructor

  public Instrument ( ) {   
;
  
Symbol Instrument_Symbol_0= new Symbol();
this.AddSymbol( Instrument_Symbol_0 );
  		
SecurityType Instrument_SecurityType_1= new SecurityType();
Equity Instrument_SecurityType_1_Equity_0= new Equity();
Instrument_SecurityType_1.AddEquity( Instrument_SecurityType_1_Equity_0 );
  		
this.AddSecurityType( Instrument_SecurityType_1 );
  		
 
  }
    
  public Instrument (  ) {
  
  }
  
  public void AddSymbol( Symbol child ) {
    this._Symbols.Add( child );
  }
  
  public void AddSecurityType( SecurityType child ) {
    this._SecurityTypes.Add( child );
  }
  

} 