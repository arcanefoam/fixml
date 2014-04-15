
using System.Collections.Generic;
// Class for tag PosRpt
class PosRpt {

	string _RptID;
	string _Rslt;
	string _BizDt;
	string _Acct;
	string _AcctTyp;
	string _SetPx;
	string _SetPxTyp;
	string _PriSetPx;
	string _ReqTyp;
	string _Ccy;
	
	List<Hdr> _Hdrs = new List<Hdr>();
	List<Pty> _Ptys = new List<Pty>();
	List<Qty> _Qtys = new List<Qty>();
	List<Amt> _Amts = new List<Amt>();
	List<Instrmt> _Instrmts = new List<Instrmt>();
	
	// default constructor
	
	public PosRpt ( ) {   
		this._RptID = "541386431";
		this._Rslt = "0";
		this._BizDt = "2003-03-10T00:00:00";
		this._Acct = "1";
		this._AcctTyp = "1";
		this._SetPx = "0.00";
		this._SetPxTyp = "1";
		this._PriSetPx = "0.00";
		this._ReqTyp = "0";
		this._Ccy = "USD";
		
		Hdr PosRpt1_Hdr1= new Hdr("2001-12-17T09:30:47-05:00", "N", "N", "1002");
		Sndr PosRpt1_Hdr1_Sndr1= new Sndr("String", "String", "String");
		PosRpt1_Hdr1.AddSndr( PosRpt1_Hdr1_Sndr1 );
		
		Tgt PosRpt1_Hdr1_Tgt1= new Tgt("String", "String", "String");
		PosRpt1_Hdr1.AddTgt( PosRpt1_Hdr1_Tgt1 );
		
		OnBhlfOf PosRpt1_Hdr1_OnBhlfOf1= new OnBhlfOf("String", "String", "String");
		PosRpt1_Hdr1.AddOnBhlfOf( PosRpt1_Hdr1_OnBhlfOf1 );
		
		DlvrTo PosRpt1_Hdr1_DlvrTo1= new DlvrTo("String", "String", "String");
		PosRpt1_Hdr1.AddDlvrTo( PosRpt1_Hdr1_DlvrTo1 );
		
		this.AddHdr( PosRpt1_Hdr1 );
		
		Pty PosRpt1_Pty1= new Pty("OCC", "21");
		this.AddPty( PosRpt1_Pty1 );
		
		Pty PosRpt1_Pty2= new Pty("99999", "4");
		this.AddPty( PosRpt1_Pty2 );
		
		Pty PosRpt1_Pty3= new Pty("C", "38");
		Sub PosRpt1_Pty3_Sub1= new Sub("ZZZ", "2");
		PosRpt1_Pty3.AddSub( PosRpt1_Pty3_Sub1 );
		
		this.AddPty( PosRpt1_Pty3 );
		
		Qty PosRpt1_Qty1= new Qty("SOD", "35", "0");
		this.AddQty( PosRpt1_Qty1 );
		
		Qty PosRpt1_Qty2= new Qty("FIN", "20", "10");
		this.AddQty( PosRpt1_Qty2 );
		
		Qty PosRpt1_Qty3= new Qty("IAS", "10", "null");
		this.AddQty( PosRpt1_Qty3 );
		
		Amt PosRpt1_Amt1= new Amt("FMTM", "0.00");
		this.AddAmt( PosRpt1_Amt1 );
		
		Instrmt PosRpt1_Instrmt1= new Instrmt("AOL", "KW", "3", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
		this.AddInstrmt( PosRpt1_Instrmt1 );
		
		
	}
	
	public PosRpt ( string RptID, string Rslt, string BizDt, string Acct, string AcctTyp, string SetPx, string SetPxTyp, string PriSetPx, string ReqTyp, string Ccy ) {
		this._RptID = RptID;
		this._Rslt = Rslt;
		this._BizDt = BizDt;
		this._Acct = Acct;
		this._AcctTyp = AcctTyp;
		this._SetPx = SetPx;
		this._SetPxTyp = SetPxTyp;
		this._PriSetPx = PriSetPx;
		this._ReqTyp = ReqTyp;
		this._Ccy = Ccy;
		
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