
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
  		
Qty PosRpt_Qty_7= new Qty("35", "0");
this.AddQty( PosRpt_Qty_7 );
  		
Qty PosRpt_Qty_8= new Qty("20", "10");
this.AddQty( PosRpt_Qty_8 );
  		
Qty PosRpt_Qty_9= new Qty("10", null);
this.AddQty( PosRpt_Qty_9 );
  		
Qty PosRpt_Qty_10= new Qty("35", "0");
this.AddQty( PosRpt_Qty_10 );
  		
Qty PosRpt_Qty_11= new Qty("20", "10");
this.AddQty( PosRpt_Qty_11 );
  		
Qty PosRpt_Qty_12= new Qty("10", null);
this.AddQty( PosRpt_Qty_12 );
  		
Qty PosRpt_Qty_13= new Qty("35", "0");
this.AddQty( PosRpt_Qty_13 );
  		
Qty PosRpt_Qty_14= new Qty("20", "10");
this.AddQty( PosRpt_Qty_14 );
  		
Qty PosRpt_Qty_15= new Qty("10", null);
this.AddQty( PosRpt_Qty_15 );
  		
Qty PosRpt_Qty_16= new Qty("35", "0");
this.AddQty( PosRpt_Qty_16 );
  		
Qty PosRpt_Qty_17= new Qty("20", "10");
this.AddQty( PosRpt_Qty_17 );
  		
Qty PosRpt_Qty_18= new Qty("10", null);
this.AddQty( PosRpt_Qty_18 );
  		
Qty PosRpt_Qty_19= new Qty("35", "0");
this.AddQty( PosRpt_Qty_19 );
  		
Qty PosRpt_Qty_20= new Qty("20", "10");
this.AddQty( PosRpt_Qty_20 );
  		
Qty PosRpt_Qty_21= new Qty("10", null);
this.AddQty( PosRpt_Qty_21 );
  		
Qty PosRpt_Qty_22= new Qty("35", "0");
this.AddQty( PosRpt_Qty_22 );
  		
Qty PosRpt_Qty_23= new Qty("20", "10");
this.AddQty( PosRpt_Qty_23 );
  		
Qty PosRpt_Qty_24= new Qty("10", null);
this.AddQty( PosRpt_Qty_24 );
  		
Qty PosRpt_Qty_25= new Qty("35", "0");
this.AddQty( PosRpt_Qty_25 );
  		
Qty PosRpt_Qty_26= new Qty("20", "10");
this.AddQty( PosRpt_Qty_26 );
  		
Qty PosRpt_Qty_27= new Qty("10", null);
this.AddQty( PosRpt_Qty_27 );
  		
Qty PosRpt_Qty_28= new Qty("35", "0");
this.AddQty( PosRpt_Qty_28 );
  		
Qty PosRpt_Qty_29= new Qty("20", "10");
this.AddQty( PosRpt_Qty_29 );
  		
Qty PosRpt_Qty_30= new Qty("10", null);
this.AddQty( PosRpt_Qty_30 );
  		
Qty PosRpt_Qty_31= new Qty("35", "0");
this.AddQty( PosRpt_Qty_31 );
  		
Qty PosRpt_Qty_32= new Qty("20", "10");
this.AddQty( PosRpt_Qty_32 );
  		
Qty PosRpt_Qty_33= new Qty("10", null);
this.AddQty( PosRpt_Qty_33 );
  		
Qty PosRpt_Qty_34= new Qty("35", "0");
this.AddQty( PosRpt_Qty_34 );
  		
Qty PosRpt_Qty_35= new Qty("20", "10");
this.AddQty( PosRpt_Qty_35 );
  		
Qty PosRpt_Qty_36= new Qty("10", null);
this.AddQty( PosRpt_Qty_36 );
  		
Qty PosRpt_Qty_37= new Qty("35", "0");
this.AddQty( PosRpt_Qty_37 );
  		
Qty PosRpt_Qty_38= new Qty("20", "10");
this.AddQty( PosRpt_Qty_38 );
  		
Qty PosRpt_Qty_39= new Qty("10", null);
this.AddQty( PosRpt_Qty_39 );
  		
Qty PosRpt_Qty_40= new Qty("35", "0");
this.AddQty( PosRpt_Qty_40 );
  		
Qty PosRpt_Qty_41= new Qty("20", "10");
this.AddQty( PosRpt_Qty_41 );
  		
Qty PosRpt_Qty_42= new Qty("10", null);
this.AddQty( PosRpt_Qty_42 );
  		
Qty PosRpt_Qty_43= new Qty("35", "0");
this.AddQty( PosRpt_Qty_43 );
  		
Qty PosRpt_Qty_44= new Qty("20", "10");
this.AddQty( PosRpt_Qty_44 );
  		
Qty PosRpt_Qty_45= new Qty("10", null);
this.AddQty( PosRpt_Qty_45 );
  		
Qty PosRpt_Qty_46= new Qty("35", "0");
this.AddQty( PosRpt_Qty_46 );
  		
Qty PosRpt_Qty_47= new Qty("20", "10");
this.AddQty( PosRpt_Qty_47 );
  		
Qty PosRpt_Qty_48= new Qty("10", null);
this.AddQty( PosRpt_Qty_48 );
  		
Qty PosRpt_Qty_49= new Qty("35", "0");
this.AddQty( PosRpt_Qty_49 );
  		
Qty PosRpt_Qty_50= new Qty("20", "10");
this.AddQty( PosRpt_Qty_50 );
  		
Qty PosRpt_Qty_51= new Qty("10", null);
this.AddQty( PosRpt_Qty_51 );
  		
Qty PosRpt_Qty_52= new Qty("35", "0");
this.AddQty( PosRpt_Qty_52 );
  		
Qty PosRpt_Qty_53= new Qty("20", "10");
this.AddQty( PosRpt_Qty_53 );
  		
Qty PosRpt_Qty_54= new Qty("10", null);
this.AddQty( PosRpt_Qty_54 );
  		
Qty PosRpt_Qty_55= new Qty("35", "0");
this.AddQty( PosRpt_Qty_55 );
  		
Qty PosRpt_Qty_56= new Qty("20", "10");
this.AddQty( PosRpt_Qty_56 );
  		
Qty PosRpt_Qty_57= new Qty("10", null);
this.AddQty( PosRpt_Qty_57 );
  		
Qty PosRpt_Qty_58= new Qty("35", "0");
this.AddQty( PosRpt_Qty_58 );
  		
Qty PosRpt_Qty_59= new Qty("20", "10");
this.AddQty( PosRpt_Qty_59 );
  		
Qty PosRpt_Qty_60= new Qty("10", null);
this.AddQty( PosRpt_Qty_60 );
  		
Qty PosRpt_Qty_61= new Qty("35", "0");
this.AddQty( PosRpt_Qty_61 );
  		
Qty PosRpt_Qty_62= new Qty("20", "10");
this.AddQty( PosRpt_Qty_62 );
  		
Qty PosRpt_Qty_63= new Qty("10", null);
this.AddQty( PosRpt_Qty_63 );
  		
Qty PosRpt_Qty_64= new Qty("35", "0");
this.AddQty( PosRpt_Qty_64 );
  		
Qty PosRpt_Qty_65= new Qty("20", "10");
this.AddQty( PosRpt_Qty_65 );
  		
Qty PosRpt_Qty_66= new Qty("10", null);
this.AddQty( PosRpt_Qty_66 );
  		
Qty PosRpt_Qty_67= new Qty("35", "0");
this.AddQty( PosRpt_Qty_67 );
  		
Qty PosRpt_Qty_68= new Qty("20", "10");
this.AddQty( PosRpt_Qty_68 );
  		
Qty PosRpt_Qty_69= new Qty("10", null);
this.AddQty( PosRpt_Qty_69 );
  		
Qty PosRpt_Qty_70= new Qty("35", "0");
this.AddQty( PosRpt_Qty_70 );
  		
Qty PosRpt_Qty_71= new Qty("20", "10");
this.AddQty( PosRpt_Qty_71 );
  		
Qty PosRpt_Qty_72= new Qty("10", null);
this.AddQty( PosRpt_Qty_72 );
  		
Qty PosRpt_Qty_73= new Qty("35", "0");
this.AddQty( PosRpt_Qty_73 );
  		
Qty PosRpt_Qty_74= new Qty("20", "10");
this.AddQty( PosRpt_Qty_74 );
  		
Qty PosRpt_Qty_75= new Qty("10", null);
this.AddQty( PosRpt_Qty_75 );
  		
Qty PosRpt_Qty_76= new Qty("35", "0");
this.AddQty( PosRpt_Qty_76 );
  		
Qty PosRpt_Qty_77= new Qty("20", "10");
this.AddQty( PosRpt_Qty_77 );
  		
Qty PosRpt_Qty_78= new Qty("10", null);
this.AddQty( PosRpt_Qty_78 );
  		
Qty PosRpt_Qty_79= new Qty("35", "0");
this.AddQty( PosRpt_Qty_79 );
  		
Qty PosRpt_Qty_80= new Qty("20", "10");
this.AddQty( PosRpt_Qty_80 );
  		
Qty PosRpt_Qty_81= new Qty("10", null);
this.AddQty( PosRpt_Qty_81 );
  		
Qty PosRpt_Qty_82= new Qty("35", "0");
this.AddQty( PosRpt_Qty_82 );
  		
Qty PosRpt_Qty_83= new Qty("20", "10");
this.AddQty( PosRpt_Qty_83 );
  		
Qty PosRpt_Qty_84= new Qty("10", null);
this.AddQty( PosRpt_Qty_84 );
  		
Qty PosRpt_Qty_85= new Qty("35", "0");
this.AddQty( PosRpt_Qty_85 );
  		
Qty PosRpt_Qty_86= new Qty("20", "10");
this.AddQty( PosRpt_Qty_86 );
  		
Qty PosRpt_Qty_87= new Qty("10", null);
this.AddQty( PosRpt_Qty_87 );
  		
Qty PosRpt_Qty_88= new Qty("35", "0");
this.AddQty( PosRpt_Qty_88 );
  		
Qty PosRpt_Qty_89= new Qty("20", "10");
this.AddQty( PosRpt_Qty_89 );
  		
Qty PosRpt_Qty_90= new Qty("10", null);
this.AddQty( PosRpt_Qty_90 );
  		
Qty PosRpt_Qty_91= new Qty("35", "0");
this.AddQty( PosRpt_Qty_91 );
  		
Qty PosRpt_Qty_92= new Qty("20", "10");
this.AddQty( PosRpt_Qty_92 );
  		
Qty PosRpt_Qty_93= new Qty("10", null);
this.AddQty( PosRpt_Qty_93 );
  		
Qty PosRpt_Qty_94= new Qty("35", "0");
this.AddQty( PosRpt_Qty_94 );
  		
Qty PosRpt_Qty_95= new Qty("20", "10");
this.AddQty( PosRpt_Qty_95 );
  		
Qty PosRpt_Qty_96= new Qty("10", null);
this.AddQty( PosRpt_Qty_96 );
  		
Qty PosRpt_Qty_97= new Qty("35", "0");
this.AddQty( PosRpt_Qty_97 );
  		
Qty PosRpt_Qty_98= new Qty("20", "10");
this.AddQty( PosRpt_Qty_98 );
  		
Qty PosRpt_Qty_99= new Qty("10", null);
this.AddQty( PosRpt_Qty_99 );
  		
Qty PosRpt_Qty_100= new Qty("35", "0");
this.AddQty( PosRpt_Qty_100 );
  		
Qty PosRpt_Qty_101= new Qty("20", "10");
this.AddQty( PosRpt_Qty_101 );
  		
Qty PosRpt_Qty_102= new Qty("10", null);
this.AddQty( PosRpt_Qty_102 );
  		
Qty PosRpt_Qty_103= new Qty("35", "0");
this.AddQty( PosRpt_Qty_103 );
  		
Qty PosRpt_Qty_104= new Qty("20", "10");
this.AddQty( PosRpt_Qty_104 );
  		
Qty PosRpt_Qty_105= new Qty("10", null);
this.AddQty( PosRpt_Qty_105 );
  		
Qty PosRpt_Qty_106= new Qty("35", "0");
this.AddQty( PosRpt_Qty_106 );
  		
Qty PosRpt_Qty_107= new Qty("20", "10");
this.AddQty( PosRpt_Qty_107 );
  		
Qty PosRpt_Qty_108= new Qty("10", null);
this.AddQty( PosRpt_Qty_108 );
  		
Qty PosRpt_Qty_109= new Qty("35", "0");
this.AddQty( PosRpt_Qty_109 );
  		
Qty PosRpt_Qty_110= new Qty("20", "10");
this.AddQty( PosRpt_Qty_110 );
  		
Qty PosRpt_Qty_111= new Qty("10", null);
this.AddQty( PosRpt_Qty_111 );
  		
Qty PosRpt_Qty_112= new Qty("35", "0");
this.AddQty( PosRpt_Qty_112 );
  		
Qty PosRpt_Qty_113= new Qty("20", "10");
this.AddQty( PosRpt_Qty_113 );
  		
Qty PosRpt_Qty_114= new Qty("10", null);
this.AddQty( PosRpt_Qty_114 );
  		
Qty PosRpt_Qty_115= new Qty("35", "0");
this.AddQty( PosRpt_Qty_115 );
  		
Qty PosRpt_Qty_116= new Qty("20", "10");
this.AddQty( PosRpt_Qty_116 );
  		
Qty PosRpt_Qty_117= new Qty("10", null);
this.AddQty( PosRpt_Qty_117 );
  		
Qty PosRpt_Qty_118= new Qty("35", "0");
this.AddQty( PosRpt_Qty_118 );
  		
Qty PosRpt_Qty_119= new Qty("20", "10");
this.AddQty( PosRpt_Qty_119 );
  		
Qty PosRpt_Qty_120= new Qty("10", null);
this.AddQty( PosRpt_Qty_120 );
  		
Qty PosRpt_Qty_121= new Qty("35", "0");
this.AddQty( PosRpt_Qty_121 );
  		
Qty PosRpt_Qty_122= new Qty("20", "10");
this.AddQty( PosRpt_Qty_122 );
  		
Qty PosRpt_Qty_123= new Qty("10", null);
this.AddQty( PosRpt_Qty_123 );
  		
Qty PosRpt_Qty_124= new Qty("35", "0");
this.AddQty( PosRpt_Qty_124 );
  		
Qty PosRpt_Qty_125= new Qty("20", "10");
this.AddQty( PosRpt_Qty_125 );
  		
Qty PosRpt_Qty_126= new Qty("10", null);
this.AddQty( PosRpt_Qty_126 );
  		
Qty PosRpt_Qty_127= new Qty("35", "0");
this.AddQty( PosRpt_Qty_127 );
  		
Qty PosRpt_Qty_128= new Qty("20", "10");
this.AddQty( PosRpt_Qty_128 );
  		
Qty PosRpt_Qty_129= new Qty("10", null);
this.AddQty( PosRpt_Qty_129 );
  		
Qty PosRpt_Qty_130= new Qty("35", "0");
this.AddQty( PosRpt_Qty_130 );
  		
Qty PosRpt_Qty_131= new Qty("20", "10");
this.AddQty( PosRpt_Qty_131 );
  		
Qty PosRpt_Qty_132= new Qty("10", null);
this.AddQty( PosRpt_Qty_132 );
  		
Qty PosRpt_Qty_133= new Qty("35", "0");
this.AddQty( PosRpt_Qty_133 );
  		
Qty PosRpt_Qty_134= new Qty("20", "10");
this.AddQty( PosRpt_Qty_134 );
  		
Qty PosRpt_Qty_135= new Qty("10", null);
this.AddQty( PosRpt_Qty_135 );
  		
Qty PosRpt_Qty_136= new Qty("35", "0");
this.AddQty( PosRpt_Qty_136 );
  		
Qty PosRpt_Qty_137= new Qty("20", "10");
this.AddQty( PosRpt_Qty_137 );
  		
Qty PosRpt_Qty_138= new Qty("10", null);
this.AddQty( PosRpt_Qty_138 );
  		
Qty PosRpt_Qty_139= new Qty("35", "0");
this.AddQty( PosRpt_Qty_139 );
  		
Qty PosRpt_Qty_140= new Qty("20", "10");
this.AddQty( PosRpt_Qty_140 );
  		
Qty PosRpt_Qty_141= new Qty("10", null);
this.AddQty( PosRpt_Qty_141 );
  		
Qty PosRpt_Qty_142= new Qty("35", "0");
this.AddQty( PosRpt_Qty_142 );
  		
Qty PosRpt_Qty_143= new Qty("20", "10");
this.AddQty( PosRpt_Qty_143 );
  		
Qty PosRpt_Qty_144= new Qty("10", null);
this.AddQty( PosRpt_Qty_144 );
  		
Qty PosRpt_Qty_145= new Qty("35", "0");
this.AddQty( PosRpt_Qty_145 );
  		
Qty PosRpt_Qty_146= new Qty("20", "10");
this.AddQty( PosRpt_Qty_146 );
  		
Qty PosRpt_Qty_147= new Qty("10", null);
this.AddQty( PosRpt_Qty_147 );
  		
Qty PosRpt_Qty_148= new Qty("35", "0");
this.AddQty( PosRpt_Qty_148 );
  		
Qty PosRpt_Qty_149= new Qty("20", "10");
this.AddQty( PosRpt_Qty_149 );
  		
Qty PosRpt_Qty_150= new Qty("10", null);
this.AddQty( PosRpt_Qty_150 );
  		
Qty PosRpt_Qty_151= new Qty("35", "0");
this.AddQty( PosRpt_Qty_151 );
  		
Qty PosRpt_Qty_152= new Qty("20", "10");
this.AddQty( PosRpt_Qty_152 );
  		
Qty PosRpt_Qty_153= new Qty("10", null);
this.AddQty( PosRpt_Qty_153 );
  		
Qty PosRpt_Qty_154= new Qty("35", "0");
this.AddQty( PosRpt_Qty_154 );
  		
Qty PosRpt_Qty_155= new Qty("20", "10");
this.AddQty( PosRpt_Qty_155 );
  		
Qty PosRpt_Qty_156= new Qty("10", null);
this.AddQty( PosRpt_Qty_156 );
  		
Qty PosRpt_Qty_157= new Qty("35", "0");
this.AddQty( PosRpt_Qty_157 );
  		
Qty PosRpt_Qty_158= new Qty("20", "10");
this.AddQty( PosRpt_Qty_158 );
  		
Qty PosRpt_Qty_159= new Qty("10", null);
this.AddQty( PosRpt_Qty_159 );
  		
Qty PosRpt_Qty_160= new Qty("35", "0");
this.AddQty( PosRpt_Qty_160 );
  		
Qty PosRpt_Qty_161= new Qty("20", "10");
this.AddQty( PosRpt_Qty_161 );
  		
Qty PosRpt_Qty_162= new Qty("10", null);
this.AddQty( PosRpt_Qty_162 );
  		
Qty PosRpt_Qty_163= new Qty("35", "0");
this.AddQty( PosRpt_Qty_163 );
  		
Qty PosRpt_Qty_164= new Qty("20", "10");
this.AddQty( PosRpt_Qty_164 );
  		
Qty PosRpt_Qty_165= new Qty("10", null);
this.AddQty( PosRpt_Qty_165 );
  		
Qty PosRpt_Qty_166= new Qty("35", "0");
this.AddQty( PosRpt_Qty_166 );
  		
Qty PosRpt_Qty_167= new Qty("20", "10");
this.AddQty( PosRpt_Qty_167 );
  		
Qty PosRpt_Qty_168= new Qty("10", null);
this.AddQty( PosRpt_Qty_168 );
  		
Qty PosRpt_Qty_169= new Qty("35", "0");
this.AddQty( PosRpt_Qty_169 );
  		
Qty PosRpt_Qty_170= new Qty("20", "10");
this.AddQty( PosRpt_Qty_170 );
  		
Qty PosRpt_Qty_171= new Qty("10", null);
this.AddQty( PosRpt_Qty_171 );
  		
Qty PosRpt_Qty_172= new Qty("35", "0");
this.AddQty( PosRpt_Qty_172 );
  		
Qty PosRpt_Qty_173= new Qty("20", "10");
this.AddQty( PosRpt_Qty_173 );
  		
Qty PosRpt_Qty_174= new Qty("10", null);
this.AddQty( PosRpt_Qty_174 );
  		
Qty PosRpt_Qty_175= new Qty("35", "0");
this.AddQty( PosRpt_Qty_175 );
  		
Qty PosRpt_Qty_176= new Qty("20", "10");
this.AddQty( PosRpt_Qty_176 );
  		
Qty PosRpt_Qty_177= new Qty("10", null);
this.AddQty( PosRpt_Qty_177 );
  		
Qty PosRpt_Qty_178= new Qty("35", "0");
this.AddQty( PosRpt_Qty_178 );
  		
Qty PosRpt_Qty_179= new Qty("20", "10");
this.AddQty( PosRpt_Qty_179 );
  		
Qty PosRpt_Qty_180= new Qty("10", null);
this.AddQty( PosRpt_Qty_180 );
  		
Qty PosRpt_Qty_181= new Qty("35", "0");
this.AddQty( PosRpt_Qty_181 );
  		
Qty PosRpt_Qty_182= new Qty("20", "10");
this.AddQty( PosRpt_Qty_182 );
  		
Qty PosRpt_Qty_183= new Qty("10", null);
this.AddQty( PosRpt_Qty_183 );
  		
Qty PosRpt_Qty_184= new Qty("35", "0");
this.AddQty( PosRpt_Qty_184 );
  		
Qty PosRpt_Qty_185= new Qty("20", "10");
this.AddQty( PosRpt_Qty_185 );
  		
Qty PosRpt_Qty_186= new Qty("10", null);
this.AddQty( PosRpt_Qty_186 );
  		
Qty PosRpt_Qty_187= new Qty("35", "0");
this.AddQty( PosRpt_Qty_187 );
  		
Qty PosRpt_Qty_188= new Qty("20", "10");
this.AddQty( PosRpt_Qty_188 );
  		
Qty PosRpt_Qty_189= new Qty("10", null);
this.AddQty( PosRpt_Qty_189 );
  		
Qty PosRpt_Qty_190= new Qty("35", "0");
this.AddQty( PosRpt_Qty_190 );
  		
Qty PosRpt_Qty_191= new Qty("20", "10");
this.AddQty( PosRpt_Qty_191 );
  		
Qty PosRpt_Qty_192= new Qty("10", null);
this.AddQty( PosRpt_Qty_192 );
  		
Qty PosRpt_Qty_193= new Qty("35", "0");
this.AddQty( PosRpt_Qty_193 );
  		
Qty PosRpt_Qty_194= new Qty("20", "10");
this.AddQty( PosRpt_Qty_194 );
  		
Qty PosRpt_Qty_195= new Qty("10", null);
this.AddQty( PosRpt_Qty_195 );
  		
Qty PosRpt_Qty_196= new Qty("35", "0");
this.AddQty( PosRpt_Qty_196 );
  		
Qty PosRpt_Qty_197= new Qty("20", "10");
this.AddQty( PosRpt_Qty_197 );
  		
Qty PosRpt_Qty_198= new Qty("10", null);
this.AddQty( PosRpt_Qty_198 );
  		
Qty PosRpt_Qty_199= new Qty("35", "0");
this.AddQty( PosRpt_Qty_199 );
  		
Qty PosRpt_Qty_200= new Qty("20", "10");
this.AddQty( PosRpt_Qty_200 );
  		
Qty PosRpt_Qty_201= new Qty("10", null);
this.AddQty( PosRpt_Qty_201 );
  		
Qty PosRpt_Qty_202= new Qty("35", "0");
this.AddQty( PosRpt_Qty_202 );
  		
Qty PosRpt_Qty_203= new Qty("20", "10");
this.AddQty( PosRpt_Qty_203 );
  		
Qty PosRpt_Qty_204= new Qty("10", null);
this.AddQty( PosRpt_Qty_204 );
  		
Qty PosRpt_Qty_205= new Qty("35", "0");
this.AddQty( PosRpt_Qty_205 );
  		
Qty PosRpt_Qty_206= new Qty("20", "10");
this.AddQty( PosRpt_Qty_206 );
  		
Qty PosRpt_Qty_207= new Qty("10", null);
this.AddQty( PosRpt_Qty_207 );
  		
Qty PosRpt_Qty_208= new Qty("35", "0");
this.AddQty( PosRpt_Qty_208 );
  		
Qty PosRpt_Qty_209= new Qty("20", "10");
this.AddQty( PosRpt_Qty_209 );
  		
Qty PosRpt_Qty_210= new Qty("10", null);
this.AddQty( PosRpt_Qty_210 );
  		
Qty PosRpt_Qty_211= new Qty("35", "0");
this.AddQty( PosRpt_Qty_211 );
  		
Qty PosRpt_Qty_212= new Qty("20", "10");
this.AddQty( PosRpt_Qty_212 );
  		
Qty PosRpt_Qty_213= new Qty("10", null);
this.AddQty( PosRpt_Qty_213 );
  		
Qty PosRpt_Qty_214= new Qty("35", "0");
this.AddQty( PosRpt_Qty_214 );
  		
Qty PosRpt_Qty_215= new Qty("20", "10");
this.AddQty( PosRpt_Qty_215 );
  		
Qty PosRpt_Qty_216= new Qty("10", null);
this.AddQty( PosRpt_Qty_216 );
  		
Qty PosRpt_Qty_217= new Qty("35", "0");
this.AddQty( PosRpt_Qty_217 );
  		
Qty PosRpt_Qty_218= new Qty("20", "10");
this.AddQty( PosRpt_Qty_218 );
  		
Qty PosRpt_Qty_219= new Qty("10", null);
this.AddQty( PosRpt_Qty_219 );
  		
Qty PosRpt_Qty_220= new Qty("35", "0");
this.AddQty( PosRpt_Qty_220 );
  		
Qty PosRpt_Qty_221= new Qty("20", "10");
this.AddQty( PosRpt_Qty_221 );
  		
Qty PosRpt_Qty_222= new Qty("10", null);
this.AddQty( PosRpt_Qty_222 );
  		
Qty PosRpt_Qty_223= new Qty("35", "0");
this.AddQty( PosRpt_Qty_223 );
  		
Qty PosRpt_Qty_224= new Qty("20", "10");
this.AddQty( PosRpt_Qty_224 );
  		
Qty PosRpt_Qty_225= new Qty("10", null);
this.AddQty( PosRpt_Qty_225 );
  		
Qty PosRpt_Qty_226= new Qty("35", "0");
this.AddQty( PosRpt_Qty_226 );
  		
Qty PosRpt_Qty_227= new Qty("20", "10");
this.AddQty( PosRpt_Qty_227 );
  		
Qty PosRpt_Qty_228= new Qty("10", null);
this.AddQty( PosRpt_Qty_228 );
  		
Qty PosRpt_Qty_229= new Qty("35", "0");
this.AddQty( PosRpt_Qty_229 );
  		
Qty PosRpt_Qty_230= new Qty("20", "10");
this.AddQty( PosRpt_Qty_230 );
  		
Qty PosRpt_Qty_231= new Qty("10", null);
this.AddQty( PosRpt_Qty_231 );
  		
Qty PosRpt_Qty_232= new Qty("35", "0");
this.AddQty( PosRpt_Qty_232 );
  		
Qty PosRpt_Qty_233= new Qty("20", "10");
this.AddQty( PosRpt_Qty_233 );
  		
Qty PosRpt_Qty_234= new Qty("10", null);
this.AddQty( PosRpt_Qty_234 );
  		
Qty PosRpt_Qty_235= new Qty("35", "0");
this.AddQty( PosRpt_Qty_235 );
  		
Qty PosRpt_Qty_236= new Qty("20", "10");
this.AddQty( PosRpt_Qty_236 );
  		
Qty PosRpt_Qty_237= new Qty("10", null);
this.AddQty( PosRpt_Qty_237 );
  		
Qty PosRpt_Qty_238= new Qty("35", "0");
this.AddQty( PosRpt_Qty_238 );
  		
Qty PosRpt_Qty_239= new Qty("20", "10");
this.AddQty( PosRpt_Qty_239 );
  		
Qty PosRpt_Qty_240= new Qty("10", null);
this.AddQty( PosRpt_Qty_240 );
  		
Qty PosRpt_Qty_241= new Qty("35", "0");
this.AddQty( PosRpt_Qty_241 );
  		
Qty PosRpt_Qty_242= new Qty("20", "10");
this.AddQty( PosRpt_Qty_242 );
  		
Qty PosRpt_Qty_243= new Qty("10", null);
this.AddQty( PosRpt_Qty_243 );
  		
Qty PosRpt_Qty_244= new Qty("35", "0");
this.AddQty( PosRpt_Qty_244 );
  		
Qty PosRpt_Qty_245= new Qty("20", "10");
this.AddQty( PosRpt_Qty_245 );
  		
Qty PosRpt_Qty_246= new Qty("10", null);
this.AddQty( PosRpt_Qty_246 );
  		
Qty PosRpt_Qty_247= new Qty("35", "0");
this.AddQty( PosRpt_Qty_247 );
  		
Qty PosRpt_Qty_248= new Qty("20", "10");
this.AddQty( PosRpt_Qty_248 );
  		
Qty PosRpt_Qty_249= new Qty("10", null);
this.AddQty( PosRpt_Qty_249 );
  		
Qty PosRpt_Qty_250= new Qty("35", "0");
this.AddQty( PosRpt_Qty_250 );
  		
Qty PosRpt_Qty_251= new Qty("20", "10");
this.AddQty( PosRpt_Qty_251 );
  		
Qty PosRpt_Qty_252= new Qty("10", null);
this.AddQty( PosRpt_Qty_252 );
  		
Qty PosRpt_Qty_253= new Qty("35", "0");
this.AddQty( PosRpt_Qty_253 );
  		
Qty PosRpt_Qty_254= new Qty("20", "10");
this.AddQty( PosRpt_Qty_254 );
  		
Qty PosRpt_Qty_255= new Qty("10", null);
this.AddQty( PosRpt_Qty_255 );
  		
Qty PosRpt_Qty_256= new Qty("35", "0");
this.AddQty( PosRpt_Qty_256 );
  		
Qty PosRpt_Qty_257= new Qty("20", "10");
this.AddQty( PosRpt_Qty_257 );
  		
Qty PosRpt_Qty_258= new Qty("10", null);
this.AddQty( PosRpt_Qty_258 );
  		
Qty PosRpt_Qty_259= new Qty("35", "0");
this.AddQty( PosRpt_Qty_259 );
  		
Qty PosRpt_Qty_260= new Qty("20", "10");
this.AddQty( PosRpt_Qty_260 );
  		
Qty PosRpt_Qty_261= new Qty("10", null);
this.AddQty( PosRpt_Qty_261 );
  		
Qty PosRpt_Qty_262= new Qty("35", "0");
this.AddQty( PosRpt_Qty_262 );
  		
Qty PosRpt_Qty_263= new Qty("20", "10");
this.AddQty( PosRpt_Qty_263 );
  		
Qty PosRpt_Qty_264= new Qty("10", null);
this.AddQty( PosRpt_Qty_264 );
  		
Qty PosRpt_Qty_265= new Qty("35", "0");
this.AddQty( PosRpt_Qty_265 );
  		
Qty PosRpt_Qty_266= new Qty("20", "10");
this.AddQty( PosRpt_Qty_266 );
  		
Qty PosRpt_Qty_267= new Qty("10", null);
this.AddQty( PosRpt_Qty_267 );
  		
Qty PosRpt_Qty_268= new Qty("35", "0");
this.AddQty( PosRpt_Qty_268 );
  		
Qty PosRpt_Qty_269= new Qty("20", "10");
this.AddQty( PosRpt_Qty_269 );
  		
Qty PosRpt_Qty_270= new Qty("10", null);
this.AddQty( PosRpt_Qty_270 );
  		
Qty PosRpt_Qty_271= new Qty("35", "0");
this.AddQty( PosRpt_Qty_271 );
  		
Qty PosRpt_Qty_272= new Qty("20", "10");
this.AddQty( PosRpt_Qty_272 );
  		
Qty PosRpt_Qty_273= new Qty("10", null);
this.AddQty( PosRpt_Qty_273 );
  		
Qty PosRpt_Qty_274= new Qty("35", "0");
this.AddQty( PosRpt_Qty_274 );
  		
Qty PosRpt_Qty_275= new Qty("20", "10");
this.AddQty( PosRpt_Qty_275 );
  		
Qty PosRpt_Qty_276= new Qty("10", null);
this.AddQty( PosRpt_Qty_276 );
  		
Qty PosRpt_Qty_277= new Qty("35", "0");
this.AddQty( PosRpt_Qty_277 );
  		
Qty PosRpt_Qty_278= new Qty("20", "10");
this.AddQty( PosRpt_Qty_278 );
  		
Qty PosRpt_Qty_279= new Qty("10", null);
this.AddQty( PosRpt_Qty_279 );
  		
Qty PosRpt_Qty_280= new Qty("35", "0");
this.AddQty( PosRpt_Qty_280 );
  		
Qty PosRpt_Qty_281= new Qty("20", "10");
this.AddQty( PosRpt_Qty_281 );
  		
Qty PosRpt_Qty_282= new Qty("10", null);
this.AddQty( PosRpt_Qty_282 );
  		
Qty PosRpt_Qty_283= new Qty("35", "0");
this.AddQty( PosRpt_Qty_283 );
  		
Qty PosRpt_Qty_284= new Qty("20", "10");
this.AddQty( PosRpt_Qty_284 );
  		
Qty PosRpt_Qty_285= new Qty("10", null);
this.AddQty( PosRpt_Qty_285 );
  		
Qty PosRpt_Qty_286= new Qty("35", "0");
this.AddQty( PosRpt_Qty_286 );
  		
Qty PosRpt_Qty_287= new Qty("20", "10");
this.AddQty( PosRpt_Qty_287 );
  		
Qty PosRpt_Qty_288= new Qty("10", null);
this.AddQty( PosRpt_Qty_288 );
  		
Qty PosRpt_Qty_289= new Qty("35", "0");
this.AddQty( PosRpt_Qty_289 );
  		
Qty PosRpt_Qty_290= new Qty("20", "10");
this.AddQty( PosRpt_Qty_290 );
  		
Qty PosRpt_Qty_291= new Qty("10", null);
this.AddQty( PosRpt_Qty_291 );
  		
Qty PosRpt_Qty_292= new Qty("35", "0");
this.AddQty( PosRpt_Qty_292 );
  		
Qty PosRpt_Qty_293= new Qty("20", "10");
this.AddQty( PosRpt_Qty_293 );
  		
Qty PosRpt_Qty_294= new Qty("10", null);
this.AddQty( PosRpt_Qty_294 );
  		
Qty PosRpt_Qty_295= new Qty("35", "0");
this.AddQty( PosRpt_Qty_295 );
  		
Qty PosRpt_Qty_296= new Qty("20", "10");
this.AddQty( PosRpt_Qty_296 );
  		
Qty PosRpt_Qty_297= new Qty("10", null);
this.AddQty( PosRpt_Qty_297 );
  		
Qty PosRpt_Qty_298= new Qty("35", "0");
this.AddQty( PosRpt_Qty_298 );
  		
Qty PosRpt_Qty_299= new Qty("20", "10");
this.AddQty( PosRpt_Qty_299 );
  		
Qty PosRpt_Qty_300= new Qty("10", null);
this.AddQty( PosRpt_Qty_300 );
  		
Qty PosRpt_Qty_301= new Qty("35", "0");
this.AddQty( PosRpt_Qty_301 );
  		
Qty PosRpt_Qty_302= new Qty("20", "10");
this.AddQty( PosRpt_Qty_302 );
  		
Qty PosRpt_Qty_303= new Qty("10", null);
this.AddQty( PosRpt_Qty_303 );
  		
Qty PosRpt_Qty_304= new Qty("35", "0");
this.AddQty( PosRpt_Qty_304 );
  		
Qty PosRpt_Qty_305= new Qty("20", "10");
this.AddQty( PosRpt_Qty_305 );
  		
Qty PosRpt_Qty_306= new Qty("10", null);
this.AddQty( PosRpt_Qty_306 );
  		
Qty PosRpt_Qty_307= new Qty("35", "0");
this.AddQty( PosRpt_Qty_307 );
  		
Qty PosRpt_Qty_308= new Qty("20", "10");
this.AddQty( PosRpt_Qty_308 );
  		
Qty PosRpt_Qty_309= new Qty("10", null);
this.AddQty( PosRpt_Qty_309 );
  		
Qty PosRpt_Qty_310= new Qty("35", "0");
this.AddQty( PosRpt_Qty_310 );
  		
Qty PosRpt_Qty_311= new Qty("20", "10");
this.AddQty( PosRpt_Qty_311 );
  		
Qty PosRpt_Qty_312= new Qty("10", null);
this.AddQty( PosRpt_Qty_312 );
  		
Qty PosRpt_Qty_313= new Qty("35", "0");
this.AddQty( PosRpt_Qty_313 );
  		
Qty PosRpt_Qty_314= new Qty("20", "10");
this.AddQty( PosRpt_Qty_314 );
  		
Qty PosRpt_Qty_315= new Qty("10", null);
this.AddQty( PosRpt_Qty_315 );
  		
Qty PosRpt_Qty_316= new Qty("35", "0");
this.AddQty( PosRpt_Qty_316 );
  		
Qty PosRpt_Qty_317= new Qty("20", "10");
this.AddQty( PosRpt_Qty_317 );
  		
Qty PosRpt_Qty_318= new Qty("10", null);
this.AddQty( PosRpt_Qty_318 );
  		
Qty PosRpt_Qty_319= new Qty("35", "0");
this.AddQty( PosRpt_Qty_319 );
  		
Qty PosRpt_Qty_320= new Qty("20", "10");
this.AddQty( PosRpt_Qty_320 );
  		
Qty PosRpt_Qty_321= new Qty("10", null);
this.AddQty( PosRpt_Qty_321 );
  		
Qty PosRpt_Qty_322= new Qty("35", "0");
this.AddQty( PosRpt_Qty_322 );
  		
Qty PosRpt_Qty_323= new Qty("20", "10");
this.AddQty( PosRpt_Qty_323 );
  		
Qty PosRpt_Qty_324= new Qty("10", null);
this.AddQty( PosRpt_Qty_324 );
  		
Qty PosRpt_Qty_325= new Qty("35", "0");
this.AddQty( PosRpt_Qty_325 );
  		
Qty PosRpt_Qty_326= new Qty("20", "10");
this.AddQty( PosRpt_Qty_326 );
  		
Qty PosRpt_Qty_327= new Qty("10", null);
this.AddQty( PosRpt_Qty_327 );
  		
Qty PosRpt_Qty_328= new Qty("35", "0");
this.AddQty( PosRpt_Qty_328 );
  		
Qty PosRpt_Qty_329= new Qty("20", "10");
this.AddQty( PosRpt_Qty_329 );
  		
Qty PosRpt_Qty_330= new Qty("10", null);
this.AddQty( PosRpt_Qty_330 );
  		
Qty PosRpt_Qty_331= new Qty("35", "0");
this.AddQty( PosRpt_Qty_331 );
  		
Qty PosRpt_Qty_332= new Qty("20", "10");
this.AddQty( PosRpt_Qty_332 );
  		
Qty PosRpt_Qty_333= new Qty("10", null);
this.AddQty( PosRpt_Qty_333 );
  		
Qty PosRpt_Qty_334= new Qty("35", "0");
this.AddQty( PosRpt_Qty_334 );
  		
Qty PosRpt_Qty_335= new Qty("20", "10");
this.AddQty( PosRpt_Qty_335 );
  		
Qty PosRpt_Qty_336= new Qty("10", null);
this.AddQty( PosRpt_Qty_336 );
  		
Qty PosRpt_Qty_337= new Qty("35", "0");
this.AddQty( PosRpt_Qty_337 );
  		
Qty PosRpt_Qty_338= new Qty("20", "10");
this.AddQty( PosRpt_Qty_338 );
  		
Qty PosRpt_Qty_339= new Qty("10", null);
this.AddQty( PosRpt_Qty_339 );
  		
Qty PosRpt_Qty_340= new Qty("35", "0");
this.AddQty( PosRpt_Qty_340 );
  		
Qty PosRpt_Qty_341= new Qty("20", "10");
this.AddQty( PosRpt_Qty_341 );
  		
Qty PosRpt_Qty_342= new Qty("10", null);
this.AddQty( PosRpt_Qty_342 );
  		
Qty PosRpt_Qty_343= new Qty("35", "0");
this.AddQty( PosRpt_Qty_343 );
  		
Qty PosRpt_Qty_344= new Qty("20", "10");
this.AddQty( PosRpt_Qty_344 );
  		
Qty PosRpt_Qty_345= new Qty("10", null);
this.AddQty( PosRpt_Qty_345 );
  		
Amt PosRpt_Amt_346= new Amt("FMTM", "0.00");
this.AddAmt( PosRpt_Amt_346 );
  		
Instrmt PosRpt_Instrmt_347= new Instrmt("AOL", "KW", "J", "OCASPS", "20031122", "2003-11-22T00:00:00", "47.50", "USD", "100");
this.AddInstrmt( PosRpt_Instrmt_347 );
  		
 
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