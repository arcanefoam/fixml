package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag SecurityType
public class SecurityType {


  List<Equity> Equitys = new ArrayList<Equity>();



  public SecurityType ( ) {   
  
;
  
Equity SecurityType_Equity_0= new Equity();
this.addEquity( SecurityType_Equity_0 );
  		
  }
      
  public void addEquity( Equity child ) {
    this.Equitys.add( child );
  }

} 