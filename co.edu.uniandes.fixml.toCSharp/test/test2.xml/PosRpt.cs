
using System.Collections.Generic;
// Class for tag PosRpt
class PosRpt {

	string _Acct;
	string _AcctTyp;
	string _BizDt;
	string _Ccy;
	string _PriSetPx;
	string _ReqTyp;
	string _RptID;
	string _Rslt;
	string _SetPx;
	string _SetPxTyp;
	
	List<Hdr> _Hdrs = new List<Hdr>();
	List<Pty> _Ptys = new List<Pty>();
	List<Qty> _Qtys = new List<Qty>();
	List<Amt> _Amts = new List<Amt>();
	List<Instrmt> _Instrmts = new List<Instrmt>();
	
	// default constructor
	
	public PosRpt ( ) {   
		this._Acct = "1";
		this._AcctTyp = "1";
		this._BizDt = "2003-09-10T00:00:00";
		this._Ccy = "USD";
		this._PriSetPx = "0.00";
		this._ReqTyp = "0";
		this._RptID = "541386431";
		this._Rslt = "0";
		this._SetPx = "0.00";
		this._SetPxTyp = "1";
		
		Hdr PosRpt_Hdr_0= new Hdr("N", "N", "1002", "2001-12-17T09:30:47-05:00");
		Sndr PosRpt_Hdr_0_Sndr_0= new Sndr("String", "String", "String");
		PosRpt_Hdr_0.AddSndr( PosRpt_Hdr_0_Sndr_0 );
		
		Tgt PosRpt_Hdr_0_Tgt_1= new Tgt("String", "String", "String");
		PosRpt_Hdr_0.AddTgt( PosRpt_Hdr_0_Tgt_1 );
		
		OnBhlfOf PosRpt_Hdr_0_OnBhlfOf_2= new OnBhlfOf("String", "String", "String");
		PosRpt_Hdr_0.AddOnBhlfOf( PosRpt_Hdr_0_OnBhlfOf_2 );
		
		DlvrTo PosRpt_Hdr_0_DlvrTo_3= new DlvrTo("String", "String", "String");
		PosRpt_Hdr_0.AddDlvrTo( PosRpt_Hdr_0_DlvrTo_3 );
		
		this.AddHdr( PosRpt_Hdr_0 );
		
		Pty PosRpt_Pty_1= new Pty("OCC", "21");
		this.AddPty( PosRpt_Pty_1 );
		
		Pty PosRpt_Pty_2= new Pty("99999", "4");
		this.AddPty( PosRpt_Pty_2 );
		
		Pty PosRpt_Pty_3= new Pty("C", "38");
		Sub PosRpt_Pty_3_Sub_0= new Sub("ZZZ", "2");
		PosRpt_Pty_3.AddSub( PosRpt_Pty_3_Sub_0 );
		
		this.AddPty( PosRpt_Pty_3 );
		
		Qty PosRpt_Qty_4= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty_4 );
		
		Qty PosRpt_Qty_5= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty_5 );
		
		Qty PosRpt_Qty_6= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty_6 );
		
		Amt PosRpt_Amt_7= new Amt("0.00", "FMTM");
		this.AddAmt( PosRpt_Amt_7 );
		
		Instrmt PosRpt_Instrmt_8= new Instrmt("OCASPS", "KW", "J", "20031122", "2003-11-22T00:00:00", "100", "47.50", "USD", "AOL");
		this.AddInstrmt( PosRpt_Instrmt_8 );
		
		
	}
	
	public PosRpt ( string Acct, string AcctTyp, string BizDt, string Ccy, string PriSetPx, string ReqTyp, string RptID, string Rslt, string SetPx, string SetPxTyp ) {
		this._Acct = Acct;
		this._AcctTyp = AcctTyp;
		this._BizDt = BizDt;
		this._Ccy = Ccy;
		this._PriSetPx = PriSetPx;
		this._ReqTyp = ReqTyp;
		this._RptID = RptID;
		this._Rslt = Rslt;
		this._SetPx = SetPx;
		this._SetPxTyp = SetPxTyp;
		
	}
	
	public void AddHdr( Hdr child ) {
		this._Hdrs.Add( child );
	}
	
	public void AddPty( Pty child ) {
		this._Ptys.Add( child );
	}
	
	public void AddQty( Qty child ) {
		this._Qtys.Add( child );
	}
	
	public void AddAmt( Amt child ) {
		this._Amts.Add( child );
	}
	
	public void AddInstrmt( Instrmt child ) {
		this._Instrmts.Add( child );
	}
	
	
} 