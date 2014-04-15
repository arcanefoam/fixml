namespace text1.xml;

using System.Collections.Generic;

// Class for tag Order
class Order {

	string ClOrdID;
	string Side;
	string TransactTm;
	string OrdTyp;
	string Px;
	string Acct;
	
	List<Hdr> Hdrs = new List<Hdr>();
	List<Instrmt> Instrmts = new List<Instrmt>();
	List<OrdQty> OrdQtys = new List<OrdQty>();
	
	// default constructor
	
	Order ( ) {   
		this.ClOrdID = "123456";
		this.Side = "2";
		this.TransactTm = "2001-09-11T09:30:47-05:00";
		this.OrdTyp = "2";
		this.Px = "93.25";
		this.Acct = "26522154";
		
		Hdr Order1_Hdr1= new Hdr("2001-09-11T09:30:47-05:00", "N", "N", "521");
		Sndr Order1_Hdr1_Sndr1= new Sndr("AFUNDMGR");
		Order1_Hdr1.addSndr( Order1_Hdr1_Sndr1 );
		
		Tgt Order1_Hdr1_Tgt1= new Tgt("ABROKER");
		Order1_Hdr1.addTgt( Order1_Hdr1_Tgt1 );
		
		this.addHdr( Order1_Hdr1 );
		
		Instrmt Order1_Instrmt1= new Instrmt("IBM", "459200101", "1");
		this.addInstrmt( Order1_Instrmt1 );
		
		OrdQty Order1_OrderQty1= new OrdQty("1000");
		this.addOrdQty( Order1_OrderQty1 );
		
		
	}
	
	Order ( String ClOrdID, String Side, String TransactTm, String OrdTyp, String Px, String Acct ) {
		this.ClOrdID = ClOrdID;
		this.Side = Side;
		this.TransactTm = TransactTm;
		this.OrdTyp = OrdTyp;
		this.Px = Px;
		this.Acct = Acct;
		
	}
	
	AddHdr( Hdr child ) {
		this.Hdrs.Add( child );
	}
	
	AddInstrmt( Instrmt child ) {
		this.Instrmts.Add( child );
	}
	
	AddOrdQty( OrdQty child ) {
		this.OrdQtys.Add( child );
	}
	
	
} 