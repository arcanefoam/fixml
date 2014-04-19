
using System.Collections.Generic;
// Class for tag Order
class Order {

  string _ClOrdID;
  string _Side;
  string _TransactTm;
  string _OrdTyp;
  string _Px;
  string _Acct;

  List<Hdr> _Hdrs = new List<Hdr>();
  List<Instrmt> _Instrmts = new List<Instrmt>();
  List<OrdQty> _OrdQtys = new List<OrdQty>();

  // default constructor

  public Order ( ) {   
this._ClOrdID = "123456";
this._Side = "2";
this._TransactTm = "2001-09-11T09:30:47-05:00";
this._OrdTyp = "2";
this._Px = "93.25";
this._Acct = "26522154";
  
Hdr Order_Hdr_0= new Hdr("2001-09-11T09:30:47-05:00", "N", "N", "521");
Sndr Order_Hdr_0_Sndr_0= new Sndr();
Order_Hdr_0.AddSndr( Order_Hdr_0_Sndr_0 );
  		
Tgt Order_Hdr_0_Tgt_1= new Tgt();
Order_Hdr_0.AddTgt( Order_Hdr_0_Tgt_1 );
  		
this.AddHdr( Order_Hdr_0 );
  		
Instrmt Order_Instrmt_1= new Instrmt("IBM", "459200101", "1");
this.AddInstrmt( Order_Instrmt_1 );
  		
OrdQty Order_OrdQty_2= new OrdQty("1000");
this.AddOrdQty( Order_OrdQty_2 );
  		
 
  }
    
  public Order ( string ClOrdID, string Side, string TransactTm, string OrdTyp, string Px, string Acct ) {
    this._ClOrdID = ClOrdID;
    this._Side = Side;
    this._TransactTm = TransactTm;
    this._OrdTyp = OrdTyp;
    this._Px = Px;
    this._Acct = Acct;
  
  }
  
  public void AddHdr( Hdr child ) {
    this._Hdrs.Add( child );
  }
  
  public void AddInstrmt( Instrmt child ) {
    this._Instrmts.Add( child );
  }
  
  public void AddOrdQty( OrdQty child ) {
    this._OrdQtys.Add( child );
  }
  

} 