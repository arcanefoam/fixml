
using System.Collections.Generic;
// Class for tag Instrument
class Instrument {


  List<Symbol> _Symbols = new List<Symbol>();
  List<IDSource> _IDSources = new List<IDSource>();
  List<SecurityID> _SecurityIDs = new List<SecurityID>();

  // default constructor

  public Instrument ( ) {   
;
  
Symbol Instrument_Symbol_0= new Symbol();
this.AddSymbol( Instrument_Symbol_0 );
  		
IDSource Instrument_IDSource_1= new IDSource();
this.AddIDSource( Instrument_IDSource_1 );
  		
SecurityID Instrument_SecurityID_2= new SecurityID();
this.AddSecurityID( Instrument_SecurityID_2 );
  		
 
  }
    
  public Instrument (  ) {
  
  }
  
  public void AddSymbol( Symbol child ) {
    this._Symbols.Add( child );
  }
  
  public void AddIDSource( IDSource child ) {
    this._IDSources.Add( child );
  }
  
  public void AddSecurityID( SecurityID child ) {
    this._SecurityIDs.Add( child );
  }
  

} 