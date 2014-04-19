package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Order
public class Order {

  String ClOrdID;
  String Side;
  String TransactTm;
  String OrdTyp;
  String Px;
  String Acct;

  List<Hdr> Hdrs = new ArrayList<Hdr>();
  List<Instrmt> Instrmts = new ArrayList<Instrmt>();
  List<OrdQty> OrdQtys = new ArrayList<OrdQty>();

  // default constructor
  public Order ( String ClOrdID, String Side, String TransactTm, String OrdTyp, String Px, String Acct ) {
    this.ClOrdID = ClOrdID;
    this.Side = Side;
    this.TransactTm = TransactTm;
    this.OrdTyp = OrdTyp;
    this.Px = Px;
    this.Acct = Acct;
  
  }


  public Order ( ) {   
  
this.ClOrdID = "123456";
this.Side = "2";
this.TransactTm = "2001-09-11T09:30:47-05:00";
this.OrdTyp = "2";
this.Px = "93.25";
this.Acct = "26522154";
  
Hdr Order_Hdr_0= new Hdr("2001-09-11T09:30:47-05:00", "N", "N", "521");
Sndr Order_Hdr_0_Sndr_0= new Sndr();
Order_Hdr_0.addSndr( Order_Hdr_0_Sndr_0 );
  		
Tgt Order_Hdr_0_Tgt_1= new Tgt();
Order_Hdr_0.addTgt( Order_Hdr_0_Tgt_1 );
  		
this.addHdr( Order_Hdr_0 );
  		
Instrmt Order_Instrmt_1= new Instrmt("IBM", "459200101", "1");
this.addInstrmt( Order_Instrmt_1 );
  		
OrdQty Order_OrdQty_2= new OrdQty("1000");
this.addOrdQty( Order_OrdQty_2 );
  		
  }
      
  public void addHdr( Hdr child ) {
    this.Hdrs.add( child );
  }
  public void addInstrmt( Instrmt child ) {
    this.Instrmts.add( child );
  }
  public void addOrdQty( OrdQty child ) {
    this.OrdQtys.add( child );
  }

} 