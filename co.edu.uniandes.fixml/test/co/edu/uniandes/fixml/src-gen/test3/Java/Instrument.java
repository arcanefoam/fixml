package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Instrument
public class Instrument {


  List<Symbol> Symbols = new ArrayList<Symbol>();
  List<IDSource> IDSources = new ArrayList<IDSource>();
  List<SecurityID> SecurityIDs = new ArrayList<SecurityID>();



  public Instrument ( ) {   
  
;
  
Symbol Instrument_Symbol_0= new Symbol();
this.addSymbol( Instrument_Symbol_0 );
  		
IDSource Instrument_IDSource_1= new IDSource();
this.addIDSource( Instrument_IDSource_1 );
  		
SecurityID Instrument_SecurityID_2= new SecurityID();
this.addSecurityID( Instrument_SecurityID_2 );
  		
  }
      
  public void addSymbol( Symbol child ) {
    this.Symbols.add( child );
  }
  public void addIDSource( IDSource child ) {
    this.IDSources.add( child );
  }
  public void addSecurityID( SecurityID child ) {
    this.SecurityIDs.add( child );
  }

} 