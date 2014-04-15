
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
		
		Hdr Order1_Hdr1= new Hdr("2001-09-11T09:30:47-05:00", "N", "N", "521");
		Sndr Order1_Hdr1_Sndr1= new Sndr("AFUNDMGR");
		Order1_Hdr1.AddSndr( Order1_Hdr1_Sndr1 );
		
		Tgt Order1_Hdr1_Tgt1= new Tgt("ABROKER");
		Order1_Hdr1.AddTgt( Order1_Hdr1_Tgt1 );
		
		this.AddHdr( Order1_Hdr1 );
		
		Instrmt Order1_Instrmt1= new Instrmt("IBM", "459200101", "1");
		this.AddInstrmt( Order1_Instrmt1 );
		
		OrdQty Order1_OrderQty1= new OrdQty("1000");
		this.AddOrdQty( Order1_OrderQty1 );
		
		
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