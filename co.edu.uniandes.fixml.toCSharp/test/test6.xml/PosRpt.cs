
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
		
		Hdr PosRpt_Hdr= new Hdr("N", "N", "1002", "2001-12-17T09:30:47-05:00");
		Sndr PosRpt_Hdr_Sndr= new Sndr("String", "String", "String");
		PosRpt_Hdr.AddSndr( PosRpt_Hdr_Sndr );
		
		Tgt PosRpt_Hdr_Tgt= new Tgt("String", "String", "String");
		PosRpt_Hdr.AddTgt( PosRpt_Hdr_Tgt );
		
		OnBhlfOf PosRpt_Hdr_OnBhlfOf= new OnBhlfOf("String", "String", "String");
		PosRpt_Hdr.AddOnBhlfOf( PosRpt_Hdr_OnBhlfOf );
		
		DlvrTo PosRpt_Hdr_DlvrTo= new DlvrTo("String", "String", "String");
		PosRpt_Hdr.AddDlvrTo( PosRpt_Hdr_DlvrTo );
		
		this.AddHdr( PosRpt_Hdr );
		
		Pty PosRpt_Pty= new Pty("OCC", "21");
		this.AddPty( PosRpt_Pty );
		
		Pty PosRpt_Pty= new Pty("99999", "4");
		this.AddPty( PosRpt_Pty );
		
		Pty PosRpt_Pty= new Pty("C", "38");
		Sub PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		PosRpt_Pty.AddSub( PosRpt_Pty_Sub );
		
		this.AddPty( PosRpt_Pty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("35", "0", "SOD");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("20", "10", "FIN");
		this.AddQty( PosRpt_Qty );
		
		Qty PosRpt_Qty= new Qty("10", null, "IAS");
		this.AddQty( PosRpt_Qty );
		
		Amt PosRpt_Amt= new Amt("0.00", "FMTM");
		this.AddAmt( PosRpt_Amt );
		
		Instrmt PosRpt_Instrmt= new Instrmt("OCASPS", "KW", "J", "20031122", "2003-11-22T00:00:00", "100", "47.50", "USD", "AOL");
		this.AddInstrmt( PosRpt_Instrmt );
		
		
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