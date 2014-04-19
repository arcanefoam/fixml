
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
this._BizDt = "2003-09-10T00:00:00";
this._Acct = "1";
this._AcctTyp = "1";
this._SetPx = "0.00";
this._SetPxTyp = "1";
this._PriSetPx = "0.00";
this._ReqTyp = "0";
this._Ccy = "USD";
  
Hdr PosRpt_Hdr_0= new Hdr("2001-12-17T09:30:47-05:00", "N", "N", "1002");
Sndr PosRpt_Hdr_0_Sndr_0= new Sndr();
PosRpt_Hdr_0.AddSndr( PosRpt_Hdr_0_Sndr_0 );
  		
Tgt PosRpt_Hdr_0_Tgt_1= new Tgt();
PosRpt_Hdr_0.AddTgt( PosRpt_Hdr_0_Tgt_1 );
  		
OnBhlfOf PosRpt_Hdr_0_OnBhlfOf_2= new OnBhlfOf();
PosRpt_Hdr_0.AddOnBhlfOf( PosRpt_Hdr_0_OnBhlfOf_2 );
  		
DlvrTo PosRpt_Hdr_0_DlvrTo_3= new DlvrTo("String", "String");
PosRpt_Hdr_0.AddDlvrTo( PosRpt_Hdr_0_DlvrTo_3 );
  		
this.AddHdr( PosRpt_Hdr_0 );
  		
Pty PosRpt_Pty_1= new Pty("21");
this.AddPty( PosRpt_Pty_1 );
  		
Pty PosRpt_Pty_2= new Pty("4");
this.AddPty( PosRpt_Pty_2 );
  		
Pty PosRpt_Pty_3= new Pty("38");
Sub PosRpt_Pty_3_Sub_0= new Sub();
PosRpt_Pty_3.AddSub( PosRpt_Pty_3_Sub_0 );
  		
this.AddPty( PosRpt_Pty_3 );
  		
Qty PosRpt_Qty_4= new Qty("35", "0");
this.AddQty( PosRpt_Qty_4 );
  		
Qty PosRpt_Qty_5= new Qty("20", "10");
this.AddQty( PosRpt_Qty_5 );
  		
Qty PosRpt_Qty_6= new Qty("10", null);
this.AddQty( PosRpt_Qty_6 );
  		
Amt PosRpt_Amt_7= new Amt("FMTM", "0.00");
this.AddAmt( PosRpt_Amt_7 );
  		
Instrmt PosRpt_Instrmt_8= new Instrmt("AOL", "KW", "J", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
this.AddInstrmt( PosRpt_Instrmt_8 );
  		
 
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