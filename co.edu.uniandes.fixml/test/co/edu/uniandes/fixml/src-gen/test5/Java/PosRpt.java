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
  		
Pty PosRpt_Pty_7= new Pty("21");
this.addPty( PosRpt_Pty_7 );
  		
Pty PosRpt_Pty_8= new Pty("4");
this.addPty( PosRpt_Pty_8 );
  		
Pty PosRpt_Pty_9= new Pty("38");
Sub PosRpt_Pty_9_Sub_0= new Sub();
PosRpt_Pty_9.addSub( PosRpt_Pty_9_Sub_0 );
  		
this.addPty( PosRpt_Pty_9 );
  		
Qty PosRpt_Qty_10= new Qty("35", "0");
this.addQty( PosRpt_Qty_10 );
  		
Qty PosRpt_Qty_11= new Qty("20", "10");
this.addQty( PosRpt_Qty_11 );
  		
Qty PosRpt_Qty_12= new Qty("10", null);
this.addQty( PosRpt_Qty_12 );
  		
Pty PosRpt_Pty_13= new Pty("21");
this.addPty( PosRpt_Pty_13 );
  		
Pty PosRpt_Pty_14= new Pty("4");
this.addPty( PosRpt_Pty_14 );
  		
Pty PosRpt_Pty_15= new Pty("38");
Sub PosRpt_Pty_15_Sub_0= new Sub();
PosRpt_Pty_15.addSub( PosRpt_Pty_15_Sub_0 );
  		
this.addPty( PosRpt_Pty_15 );
  		
Qty PosRpt_Qty_16= new Qty("35", "0");
this.addQty( PosRpt_Qty_16 );
  		
Qty PosRpt_Qty_17= new Qty("20", "10");
this.addQty( PosRpt_Qty_17 );
  		
Qty PosRpt_Qty_18= new Qty("10", null);
this.addQty( PosRpt_Qty_18 );
  		
Pty PosRpt_Pty_19= new Pty("21");
this.addPty( PosRpt_Pty_19 );
  		
Pty PosRpt_Pty_20= new Pty("4");
this.addPty( PosRpt_Pty_20 );
  		
Pty PosRpt_Pty_21= new Pty("38");
Sub PosRpt_Pty_21_Sub_0= new Sub();
PosRpt_Pty_21.addSub( PosRpt_Pty_21_Sub_0 );
  		
this.addPty( PosRpt_Pty_21 );
  		
Qty PosRpt_Qty_22= new Qty("35", "0");
this.addQty( PosRpt_Qty_22 );
  		
Qty PosRpt_Qty_23= new Qty("20", "10");
this.addQty( PosRpt_Qty_23 );
  		
Qty PosRpt_Qty_24= new Qty("10", null);
this.addQty( PosRpt_Qty_24 );
  		
Pty PosRpt_Pty_25= new Pty("21");
this.addPty( PosRpt_Pty_25 );
  		
Pty PosRpt_Pty_26= new Pty("4");
this.addPty( PosRpt_Pty_26 );
  		
Pty PosRpt_Pty_27= new Pty("38");
Sub PosRpt_Pty_27_Sub_0= new Sub();
PosRpt_Pty_27.addSub( PosRpt_Pty_27_Sub_0 );
  		
this.addPty( PosRpt_Pty_27 );
  		
Qty PosRpt_Qty_28= new Qty("35", "0");
this.addQty( PosRpt_Qty_28 );
  		
Qty PosRpt_Qty_29= new Qty("20", "10");
this.addQty( PosRpt_Qty_29 );
  		
Qty PosRpt_Qty_30= new Qty("10", null);
this.addQty( PosRpt_Qty_30 );
  		
Pty PosRpt_Pty_31= new Pty("21");
this.addPty( PosRpt_Pty_31 );
  		
Pty PosRpt_Pty_32= new Pty("4");
this.addPty( PosRpt_Pty_32 );
  		
Pty PosRpt_Pty_33= new Pty("38");
Sub PosRpt_Pty_33_Sub_0= new Sub();
PosRpt_Pty_33.addSub( PosRpt_Pty_33_Sub_0 );
  		
this.addPty( PosRpt_Pty_33 );
  		
Qty PosRpt_Qty_34= new Qty("35", "0");
this.addQty( PosRpt_Qty_34 );
  		
Qty PosRpt_Qty_35= new Qty("20", "10");
this.addQty( PosRpt_Qty_35 );
  		
Qty PosRpt_Qty_36= new Qty("10", null);
this.addQty( PosRpt_Qty_36 );
  		
Pty PosRpt_Pty_37= new Pty("21");
this.addPty( PosRpt_Pty_37 );
  		
Pty PosRpt_Pty_38= new Pty("4");
this.addPty( PosRpt_Pty_38 );
  		
Pty PosRpt_Pty_39= new Pty("38");
Sub PosRpt_Pty_39_Sub_0= new Sub();
PosRpt_Pty_39.addSub( PosRpt_Pty_39_Sub_0 );
  		
this.addPty( PosRpt_Pty_39 );
  		
Qty PosRpt_Qty_40= new Qty("35", "0");
this.addQty( PosRpt_Qty_40 );
  		
Qty PosRpt_Qty_41= new Qty("20", "10");
this.addQty( PosRpt_Qty_41 );
  		
Qty PosRpt_Qty_42= new Qty("10", null);
this.addQty( PosRpt_Qty_42 );
  		
Pty PosRpt_Pty_43= new Pty("21");
this.addPty( PosRpt_Pty_43 );
  		
Pty PosRpt_Pty_44= new Pty("4");
this.addPty( PosRpt_Pty_44 );
  		
Pty PosRpt_Pty_45= new Pty("38");
Sub PosRpt_Pty_45_Sub_0= new Sub();
PosRpt_Pty_45.addSub( PosRpt_Pty_45_Sub_0 );
  		
this.addPty( PosRpt_Pty_45 );
  		
Qty PosRpt_Qty_46= new Qty("35", "0");
this.addQty( PosRpt_Qty_46 );
  		
Qty PosRpt_Qty_47= new Qty("20", "10");
this.addQty( PosRpt_Qty_47 );
  		
Qty PosRpt_Qty_48= new Qty("10", null);
this.addQty( PosRpt_Qty_48 );
  		
Pty PosRpt_Pty_49= new Pty("21");
this.addPty( PosRpt_Pty_49 );
  		
Pty PosRpt_Pty_50= new Pty("4");
this.addPty( PosRpt_Pty_50 );
  		
Pty PosRpt_Pty_51= new Pty("38");
Sub PosRpt_Pty_51_Sub_0= new Sub();
PosRpt_Pty_51.addSub( PosRpt_Pty_51_Sub_0 );
  		
this.addPty( PosRpt_Pty_51 );
  		
Qty PosRpt_Qty_52= new Qty("35", "0");
this.addQty( PosRpt_Qty_52 );
  		
Qty PosRpt_Qty_53= new Qty("20", "10");
this.addQty( PosRpt_Qty_53 );
  		
Qty PosRpt_Qty_54= new Qty("10", null);
this.addQty( PosRpt_Qty_54 );
  		
Pty PosRpt_Pty_55= new Pty("21");
this.addPty( PosRpt_Pty_55 );
  		
Pty PosRpt_Pty_56= new Pty("4");
this.addPty( PosRpt_Pty_56 );
  		
Pty PosRpt_Pty_57= new Pty("38");
Sub PosRpt_Pty_57_Sub_0= new Sub();
PosRpt_Pty_57.addSub( PosRpt_Pty_57_Sub_0 );
  		
this.addPty( PosRpt_Pty_57 );
  		
Qty PosRpt_Qty_58= new Qty("35", "0");
this.addQty( PosRpt_Qty_58 );
  		
Qty PosRpt_Qty_59= new Qty("20", "10");
this.addQty( PosRpt_Qty_59 );
  		
Qty PosRpt_Qty_60= new Qty("10", null);
this.addQty( PosRpt_Qty_60 );
  		
Pty PosRpt_Pty_61= new Pty("21");
this.addPty( PosRpt_Pty_61 );
  		
Pty PosRpt_Pty_62= new Pty("4");
this.addPty( PosRpt_Pty_62 );
  		
Pty PosRpt_Pty_63= new Pty("38");
Sub PosRpt_Pty_63_Sub_0= new Sub();
PosRpt_Pty_63.addSub( PosRpt_Pty_63_Sub_0 );
  		
this.addPty( PosRpt_Pty_63 );
  		
Qty PosRpt_Qty_64= new Qty("35", "0");
this.addQty( PosRpt_Qty_64 );
  		
Qty PosRpt_Qty_65= new Qty("20", "10");
this.addQty( PosRpt_Qty_65 );
  		
Qty PosRpt_Qty_66= new Qty("10", null);
this.addQty( PosRpt_Qty_66 );
  		
Pty PosRpt_Pty_67= new Pty("21");
this.addPty( PosRpt_Pty_67 );
  		
Pty PosRpt_Pty_68= new Pty("4");
this.addPty( PosRpt_Pty_68 );
  		
Pty PosRpt_Pty_69= new Pty("38");
Sub PosRpt_Pty_69_Sub_0= new Sub();
PosRpt_Pty_69.addSub( PosRpt_Pty_69_Sub_0 );
  		
this.addPty( PosRpt_Pty_69 );
  		
Qty PosRpt_Qty_70= new Qty("35", "0");
this.addQty( PosRpt_Qty_70 );
  		
Qty PosRpt_Qty_71= new Qty("20", "10");
this.addQty( PosRpt_Qty_71 );
  		
Qty PosRpt_Qty_72= new Qty("10", null);
this.addQty( PosRpt_Qty_72 );
  		
Pty PosRpt_Pty_73= new Pty("21");
this.addPty( PosRpt_Pty_73 );
  		
Pty PosRpt_Pty_74= new Pty("4");
this.addPty( PosRpt_Pty_74 );
  		
Pty PosRpt_Pty_75= new Pty("38");
Sub PosRpt_Pty_75_Sub_0= new Sub();
PosRpt_Pty_75.addSub( PosRpt_Pty_75_Sub_0 );
  		
this.addPty( PosRpt_Pty_75 );
  		
Qty PosRpt_Qty_76= new Qty("35", "0");
this.addQty( PosRpt_Qty_76 );
  		
Qty PosRpt_Qty_77= new Qty("20", "10");
this.addQty( PosRpt_Qty_77 );
  		
Qty PosRpt_Qty_78= new Qty("10", null);
this.addQty( PosRpt_Qty_78 );
  		
Pty PosRpt_Pty_79= new Pty("21");
this.addPty( PosRpt_Pty_79 );
  		
Pty PosRpt_Pty_80= new Pty("4");
this.addPty( PosRpt_Pty_80 );
  		
Pty PosRpt_Pty_81= new Pty("38");
Sub PosRpt_Pty_81_Sub_0= new Sub();
PosRpt_Pty_81.addSub( PosRpt_Pty_81_Sub_0 );
  		
this.addPty( PosRpt_Pty_81 );
  		
Qty PosRpt_Qty_82= new Qty("35", "0");
this.addQty( PosRpt_Qty_82 );
  		
Qty PosRpt_Qty_83= new Qty("20", "10");
this.addQty( PosRpt_Qty_83 );
  		
Qty PosRpt_Qty_84= new Qty("10", null);
this.addQty( PosRpt_Qty_84 );
  		
Pty PosRpt_Pty_85= new Pty("21");
this.addPty( PosRpt_Pty_85 );
  		
Pty PosRpt_Pty_86= new Pty("4");
this.addPty( PosRpt_Pty_86 );
  		
Pty PosRpt_Pty_87= new Pty("38");
Sub PosRpt_Pty_87_Sub_0= new Sub();
PosRpt_Pty_87.addSub( PosRpt_Pty_87_Sub_0 );
  		
this.addPty( PosRpt_Pty_87 );
  		
Qty PosRpt_Qty_88= new Qty("35", "0");
this.addQty( PosRpt_Qty_88 );
  		
Qty PosRpt_Qty_89= new Qty("20", "10");
this.addQty( PosRpt_Qty_89 );
  		
Qty PosRpt_Qty_90= new Qty("10", null);
this.addQty( PosRpt_Qty_90 );
  		
Pty PosRpt_Pty_91= new Pty("21");
this.addPty( PosRpt_Pty_91 );
  		
Pty PosRpt_Pty_92= new Pty("4");
this.addPty( PosRpt_Pty_92 );
  		
Pty PosRpt_Pty_93= new Pty("38");
Sub PosRpt_Pty_93_Sub_0= new Sub();
PosRpt_Pty_93.addSub( PosRpt_Pty_93_Sub_0 );
  		
this.addPty( PosRpt_Pty_93 );
  		
Qty PosRpt_Qty_94= new Qty("35", "0");
this.addQty( PosRpt_Qty_94 );
  		
Qty PosRpt_Qty_95= new Qty("20", "10");
this.addQty( PosRpt_Qty_95 );
  		
Qty PosRpt_Qty_96= new Qty("10", null);
this.addQty( PosRpt_Qty_96 );
  		
Pty PosRpt_Pty_97= new Pty("21");
this.addPty( PosRpt_Pty_97 );
  		
Pty PosRpt_Pty_98= new Pty("4");
this.addPty( PosRpt_Pty_98 );
  		
Pty PosRpt_Pty_99= new Pty("38");
Sub PosRpt_Pty_99_Sub_0= new Sub();
PosRpt_Pty_99.addSub( PosRpt_Pty_99_Sub_0 );
  		
this.addPty( PosRpt_Pty_99 );
  		
Qty PosRpt_Qty_100= new Qty("35", "0");
this.addQty( PosRpt_Qty_100 );
  		
Qty PosRpt_Qty_101= new Qty("20", "10");
this.addQty( PosRpt_Qty_101 );
  		
Qty PosRpt_Qty_102= new Qty("10", null);
this.addQty( PosRpt_Qty_102 );
  		
Pty PosRpt_Pty_103= new Pty("21");
this.addPty( PosRpt_Pty_103 );
  		
Pty PosRpt_Pty_104= new Pty("4");
this.addPty( PosRpt_Pty_104 );
  		
Pty PosRpt_Pty_105= new Pty("38");
Sub PosRpt_Pty_105_Sub_0= new Sub();
PosRpt_Pty_105.addSub( PosRpt_Pty_105_Sub_0 );
  		
this.addPty( PosRpt_Pty_105 );
  		
Qty PosRpt_Qty_106= new Qty("35", "0");
this.addQty( PosRpt_Qty_106 );
  		
Qty PosRpt_Qty_107= new Qty("20", "10");
this.addQty( PosRpt_Qty_107 );
  		
Qty PosRpt_Qty_108= new Qty("10", null);
this.addQty( PosRpt_Qty_108 );
  		
Pty PosRpt_Pty_109= new Pty("21");
this.addPty( PosRpt_Pty_109 );
  		
Pty PosRpt_Pty_110= new Pty("4");
this.addPty( PosRpt_Pty_110 );
  		
Pty PosRpt_Pty_111= new Pty("38");
Sub PosRpt_Pty_111_Sub_0= new Sub();
PosRpt_Pty_111.addSub( PosRpt_Pty_111_Sub_0 );
  		
this.addPty( PosRpt_Pty_111 );
  		
Qty PosRpt_Qty_112= new Qty("35", "0");
this.addQty( PosRpt_Qty_112 );
  		
Qty PosRpt_Qty_113= new Qty("20", "10");
this.addQty( PosRpt_Qty_113 );
  		
Qty PosRpt_Qty_114= new Qty("10", null);
this.addQty( PosRpt_Qty_114 );
  		
Pty PosRpt_Pty_115= new Pty("21");
this.addPty( PosRpt_Pty_115 );
  		
Pty PosRpt_Pty_116= new Pty("4");
this.addPty( PosRpt_Pty_116 );
  		
Pty PosRpt_Pty_117= new Pty("38");
Sub PosRpt_Pty_117_Sub_0= new Sub();
PosRpt_Pty_117.addSub( PosRpt_Pty_117_Sub_0 );
  		
this.addPty( PosRpt_Pty_117 );
  		
Qty PosRpt_Qty_118= new Qty("35", "0");
this.addQty( PosRpt_Qty_118 );
  		
Qty PosRpt_Qty_119= new Qty("20", "10");
this.addQty( PosRpt_Qty_119 );
  		
Qty PosRpt_Qty_120= new Qty("10", null);
this.addQty( PosRpt_Qty_120 );
  		
Pty PosRpt_Pty_121= new Pty("21");
this.addPty( PosRpt_Pty_121 );
  		
Pty PosRpt_Pty_122= new Pty("4");
this.addPty( PosRpt_Pty_122 );
  		
Pty PosRpt_Pty_123= new Pty("38");
Sub PosRpt_Pty_123_Sub_0= new Sub();
PosRpt_Pty_123.addSub( PosRpt_Pty_123_Sub_0 );
  		
this.addPty( PosRpt_Pty_123 );
  		
Qty PosRpt_Qty_124= new Qty("35", "0");
this.addQty( PosRpt_Qty_124 );
  		
Qty PosRpt_Qty_125= new Qty("20", "10");
this.addQty( PosRpt_Qty_125 );
  		
Qty PosRpt_Qty_126= new Qty("10", null);
this.addQty( PosRpt_Qty_126 );
  		
Amt PosRpt_Amt_127= new Amt("FMTM", "0.00");
this.addAmt( PosRpt_Amt_127 );
  		
Instrmt PosRpt_Instrmt_128= new Instrmt("AOL", "KW", "J", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
this.addInstrmt( PosRpt_Instrmt_128 );
  		
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