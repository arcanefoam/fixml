package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag PosRpt
public class PosRpt {

  String RptID;
  String Rslt;
  String BizDt;
  String Acct;
  String AcctTyp;
  String SetPx;
  String SetPxTyp;
  String PriSetPx;
  String ReqTyp;
  String Ccy;

  List<Hdr> Hdrs = new ArrayList<Hdr>();
  List<Pty> Ptys = new ArrayList<Pty>();
  List<Qty> Qtys = new ArrayList<Qty>();
  List<Amt> Amts = new ArrayList<Amt>();
  List<Instrmt> Instrmts = new ArrayList<Instrmt>();

  // default constructor
  public PosRpt ( String RptID, String Rslt, String BizDt, String Acct, String AcctTyp, String SetPx, String SetPxTyp, String PriSetPx, String ReqTyp, String Ccy ) {
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


  public PosRpt ( ) {   
  
this.RptID = "541386431";
this.Rslt = "0";
this.BizDt = "2003-09-10T00:00:00";
this.Acct = "1";
this.AcctTyp = "1";
this.SetPx = "0.00";
this.SetPxTyp = "1";
this.PriSetPx = "0.00";
this.ReqTyp = "0";
this.Ccy = "USD";
  
Hdr PosRpt_Hdr_0= new Hdr("2001-12-17T09:30:47-05:00", "N", "N", "1002");
Sndr PosRpt_Hdr_0_Sndr_0= new Sndr();
PosRpt_Hdr_0.addSndr( PosRpt_Hdr_0_Sndr_0 );
  		
Tgt PosRpt_Hdr_0_Tgt_1= new Tgt();
PosRpt_Hdr_0.addTgt( PosRpt_Hdr_0_Tgt_1 );
  		
OnBhlfOf PosRpt_Hdr_0_OnBhlfOf_2= new OnBhlfOf();
PosRpt_Hdr_0.addOnBhlfOf( PosRpt_Hdr_0_OnBhlfOf_2 );
  		
DlvrTo PosRpt_Hdr_0_DlvrTo_3= new DlvrTo("String", "String");
PosRpt_Hdr_0.addDlvrTo( PosRpt_Hdr_0_DlvrTo_3 );
  		
this.addHdr( PosRpt_Hdr_0 );
  		
Pty PosRpt_Pty_1= new Pty("21");
this.addPty( PosRpt_Pty_1 );
  		
Pty PosRpt_Pty_2= new Pty("4");
this.addPty( PosRpt_Pty_2 );
  		
Pty PosRpt_Pty_3= new Pty("38");
Sub PosRpt_Pty_3_Sub_0= new Sub();
PosRpt_Pty_3.addSub( PosRpt_Pty_3_Sub_0 );
  		
this.addPty( PosRpt_Pty_3 );
  		
Qty PosRpt_Qty_4= new Qty("35", "0");
this.addQty( PosRpt_Qty_4 );
  		
Qty PosRpt_Qty_5= new Qty("20", "10");
this.addQty( PosRpt_Qty_5 );
  		
Qty PosRpt_Qty_6= new Qty("10", null);
this.addQty( PosRpt_Qty_6 );
  		
Amt PosRpt_Amt_7= new Amt("FMTM", "0.00");
this.addAmt( PosRpt_Amt_7 );
  		
Instrmt PosRpt_Instrmt_8= new Instrmt("AOL", "KW", "J", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
this.addInstrmt( PosRpt_Instrmt_8 );
  		
  }
      
  public void addHdr( Hdr child ) {
    this.Hdrs.add( child );
  }
  public void addPty( Pty child ) {
    this.Ptys.add( child );
  }
  public void addQty( Qty child ) {
    this.Qtys.add( child );
  }
  public void addAmt( Amt child ) {
    this.Amts.add( child );
  }
  public void addInstrmt( Instrmt child ) {
    this.Instrmts.add( child );
  }

} 