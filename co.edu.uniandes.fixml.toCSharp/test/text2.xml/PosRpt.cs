namespace text2.xml;

using System.Collections.Generic;

// Class for tag PosRpt
class PosRpt {

	string RptID;
	string Rslt;
	string BizDt;
	string Acct;
	string AcctTyp;
	string SetPx;
	string SetPxTyp;
	string PriSetPx;
	string ReqTyp;
	string Ccy;
	
	List<Hdr> Hdrs = new List<Hdr>();
	List<Pty> Ptys = new List<Pty>();
	List<Qty> Qtys = new List<Qty>();
	List<Amt> Amts = new List<Amt>();
	List<Instrmt> Instrmts = new List<Instrmt>();
	
	// default constructor
	
	PosRpt ( ) {   
		this.RptID = "541386431";
		this.Rslt = "0";
		this.BizDt = "2003-03-10T00:00:00";
		this.Acct = "1";
		this.AcctTyp = "1";
		this.SetPx = "0.00";
		this.SetPxTyp = "1";
		this.PriSetPx = "0.00";
		this.ReqTyp = "0";
		this.Ccy = "USD";
		
		Hdr PosRpt1_Hdr1= new Hdr("2001-12-17T09:30:47-05:00", "N", "N", "1002");
		Sndr PosRpt1_Hdr1_Sndr1= new Sndr("String", "String", "String");
		PosRpt1_Hdr1.addSndr( PosRpt1_Hdr1_Sndr1 );
		
		Tgt PosRpt1_Hdr1_Tgt1= new Tgt("String", "String", "String");
		PosRpt1_Hdr1.addTgt( PosRpt1_Hdr1_Tgt1 );
		
		OnBhlfOf PosRpt1_Hdr1_OnBhlfOf1= new OnBhlfOf("String", "String", "String");
		PosRpt1_Hdr1.addOnBhlfOf( PosRpt1_Hdr1_OnBhlfOf1 );
		
		DlvrTo PosRpt1_Hdr1_DlvrTo1= new DlvrTo("String", "String", "String");
		PosRpt1_Hdr1.addDlvrTo( PosRpt1_Hdr1_DlvrTo1 );
		
		this.addHdr( PosRpt1_Hdr1 );
		
		Pty PosRpt1_Pty1= new Pty("OCC", "21");
		this.addPty( PosRpt1_Pty1 );
		
		Pty PosRpt1_Pty2= new Pty("99999", "4");
		this.addPty( PosRpt1_Pty2 );
		
		Pty PosRpt1_Pty3= new Pty("C", "38");
		Sub PosRpt1_Pty3_Sub1= new Sub("ZZZ", "2");
		PosRpt1_Pty3.addSub( PosRpt1_Pty3_Sub1 );
		
		this.addPty( PosRpt1_Pty3 );
		
		Qty PosRpt1_Qty1= new Qty("SOD", "35", "0");
		this.addQty( PosRpt1_Qty1 );
		
		Qty PosRpt1_Qty2= new Qty("FIN", "20", "10");
		this.addQty( PosRpt1_Qty2 );
		
		Qty PosRpt1_Qty3= new Qty("IAS", "10", "null");
		this.addQty( PosRpt1_Qty3 );
		
		Amt PosRpt1_Amt1= new Amt("FMTM", "0.00");
		this.addAmt( PosRpt1_Amt1 );
		
		Instrmt PosRpt1_Instrmt1= new Instrmt("AOL", "KW", "3", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
		this.addInstrmt( PosRpt1_Instrmt1 );
		
		
	}
	
	PosRpt ( String RptID, String Rslt, String BizDt, String Acct, String AcctTyp, String SetPx, String SetPxTyp, String PriSetPx, String ReqTyp, String Ccy ) {
		this.RptID = RptID;
		this.Rslt = Rslt;
		this.BizDt = BizDt;
		this.Acct = Acct;
		this.AcctTyp = AcctTyp;
		this.SetPx = SetPx;
		this.SetPxTyp = SetPxTyp;
		this.PriSetPx = PriSetPx;
		this.ReqTyp = ReqTyp;
		this.Ccy = Ccy;
		
	}
	
	AddHdr( Hdr child ) {
		this.Hdrs.Add( child );
	}
	
	AddPty( Pty child ) {
		this.Ptys.Add( child );
	}
	
	AddQty( Qty child ) {
		this.Qtys.Add( child );
	}
	
	AddAmt( Amt child ) {
		this.Amts.Add( child );
	}
	
	AddInstrmt( Instrmt child ) {
		this.Instrmts.Add( child );
	}
	
	
} 