package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Instrument
public class Instrument {


  List<Symbol> Symbols = new ArrayList<Symbol>();
  List<SecurityType> SecurityTypes = new ArrayList<SecurityType>();



  public Instrument ( ) {   
  
;
  
Symbol Instrument_Symbol_0= new Symbol();
this.addSymbol( Instrument_Symbol_0 );
  		
SecurityType Instrument_SecurityType_1= new SecurityType();
Equity Instrument_SecurityType_1_Equity_0= new Equity();
Instrument_SecurityType_1.addEquity( Instrument_SecurityType_1_Equity_0 );
  		
this.addSecurityType( Instrument_SecurityType_1 );
  		
  }
      
  public void addSymbol( Symbol child ) {
    this.Symbols.add( child );
  }
  public void addSecurityType( SecurityType child ) {
    this.SecurityTypes.add( child );
  }

} 