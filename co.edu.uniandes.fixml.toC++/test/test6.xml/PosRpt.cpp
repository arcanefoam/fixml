#include <iostream> 
 #include "Hdr.cpp" 
 #include "Pty.cpp" 
 #include "Qty.cpp" 
 #include "Amt.cpp" 
 #include "Instrmt.cpp" 

using namespace std;

class PosRpt {

	private:
  	string Acct_;
  	string AcctTyp_;
  	string BizDt_;
  	string Ccy_;
  	string PriSetPx_;
  	string ReqTyp_;
  	string RptID_;
  	string Rslt_;
  	string SetPx_;
  	string SetPxTyp_;
	Hdr* Hdr_1;
	Pty* Pty_1;	Pty* Pty_2;	Pty* Pty_3;
	Qty* Qty_1;	Qty* Qty_2;	Qty* Qty_3;	Qty* Qty_4;	Qty* Qty_5;	Qty* Qty_6;	Qty* Qty_7;	Qty* Qty_8;	Qty* Qty_9;	Qty* Qty_10;	Qty* Qty_11;	Qty* Qty_12;	Qty* Qty_13;	Qty* Qty_14;	Qty* Qty_15;	Qty* Qty_16;	Qty* Qty_17;	Qty* Qty_18;	Qty* Qty_19;	Qty* Qty_20;	Qty* Qty_21;	Qty* Qty_22;	Qty* Qty_23;	Qty* Qty_24;	Qty* Qty_25;	Qty* Qty_26;	Qty* Qty_27;	Qty* Qty_28;	Qty* Qty_29;	Qty* Qty_30;	Qty* Qty_31;	Qty* Qty_32;	Qty* Qty_33;	Qty* Qty_34;	Qty* Qty_35;	Qty* Qty_36;	Qty* Qty_37;	Qty* Qty_38;	Qty* Qty_39;	Qty* Qty_40;	Qty* Qty_41;	Qty* Qty_42;	Qty* Qty_43;	Qty* Qty_44;	Qty* Qty_45;	Qty* Qty_46;	Qty* Qty_47;	Qty* Qty_48;	Qty* Qty_49;	Qty* Qty_50;	Qty* Qty_51;	Qty* Qty_52;	Qty* Qty_53;	Qty* Qty_54;	Qty* Qty_55;	Qty* Qty_56;	Qty* Qty_57;	Qty* Qty_58;	Qty* Qty_59;	Qty* Qty_60;	Qty* Qty_61;	Qty* Qty_62;	Qty* Qty_63;	Qty* Qty_64;	Qty* Qty_65;	Qty* Qty_66;	Qty* Qty_67;	Qty* Qty_68;	Qty* Qty_69;	Qty* Qty_70;	Qty* Qty_71;	Qty* Qty_72;	Qty* Qty_73;	Qty* Qty_74;	Qty* Qty_75;	Qty* Qty_76;	Qty* Qty_77;	Qty* Qty_78;	Qty* Qty_79;	Qty* Qty_80;	Qty* Qty_81;	Qty* Qty_82;	Qty* Qty_83;	Qty* Qty_84;	Qty* Qty_85;	Qty* Qty_86;	Qty* Qty_87;	Qty* Qty_88;	Qty* Qty_89;	Qty* Qty_90;	Qty* Qty_91;	Qty* Qty_92;	Qty* Qty_93;	Qty* Qty_94;	Qty* Qty_95;	Qty* Qty_96;	Qty* Qty_97;	Qty* Qty_98;	Qty* Qty_99;	Qty* Qty_100;	Qty* Qty_101;	Qty* Qty_102;	Qty* Qty_103;	Qty* Qty_104;	Qty* Qty_105;	Qty* Qty_106;	Qty* Qty_107;	Qty* Qty_108;	Qty* Qty_109;	Qty* Qty_110;	Qty* Qty_111;	Qty* Qty_112;	Qty* Qty_113;	Qty* Qty_114;	Qty* Qty_115;	Qty* Qty_116;	Qty* Qty_117;	Qty* Qty_118;	Qty* Qty_119;	Qty* Qty_120;	Qty* Qty_121;	Qty* Qty_122;	Qty* Qty_123;	Qty* Qty_124;	Qty* Qty_125;	Qty* Qty_126;	Qty* Qty_127;	Qty* Qty_128;	Qty* Qty_129;	Qty* Qty_130;	Qty* Qty_131;	Qty* Qty_132;	Qty* Qty_133;	Qty* Qty_134;	Qty* Qty_135;	Qty* Qty_136;	Qty* Qty_137;	Qty* Qty_138;	Qty* Qty_139;	Qty* Qty_140;	Qty* Qty_141;	Qty* Qty_142;	Qty* Qty_143;	Qty* Qty_144;	Qty* Qty_145;	Qty* Qty_146;	Qty* Qty_147;	Qty* Qty_148;	Qty* Qty_149;	Qty* Qty_150;	Qty* Qty_151;	Qty* Qty_152;	Qty* Qty_153;	Qty* Qty_154;	Qty* Qty_155;	Qty* Qty_156;	Qty* Qty_157;	Qty* Qty_158;	Qty* Qty_159;	Qty* Qty_160;	Qty* Qty_161;	Qty* Qty_162;	Qty* Qty_163;	Qty* Qty_164;	Qty* Qty_165;	Qty* Qty_166;	Qty* Qty_167;	Qty* Qty_168;	Qty* Qty_169;	Qty* Qty_170;	Qty* Qty_171;	Qty* Qty_172;	Qty* Qty_173;	Qty* Qty_174;	Qty* Qty_175;	Qty* Qty_176;	Qty* Qty_177;	Qty* Qty_178;	Qty* Qty_179;	Qty* Qty_180;	Qty* Qty_181;	Qty* Qty_182;	Qty* Qty_183;	Qty* Qty_184;	Qty* Qty_185;	Qty* Qty_186;	Qty* Qty_187;	Qty* Qty_188;	Qty* Qty_189;	Qty* Qty_190;	Qty* Qty_191;	Qty* Qty_192;	Qty* Qty_193;	Qty* Qty_194;	Qty* Qty_195;	Qty* Qty_196;	Qty* Qty_197;	Qty* Qty_198;	Qty* Qty_199;	Qty* Qty_200;	Qty* Qty_201;	Qty* Qty_202;	Qty* Qty_203;	Qty* Qty_204;	Qty* Qty_205;	Qty* Qty_206;	Qty* Qty_207;	Qty* Qty_208;	Qty* Qty_209;	Qty* Qty_210;	Qty* Qty_211;	Qty* Qty_212;	Qty* Qty_213;	Qty* Qty_214;	Qty* Qty_215;	Qty* Qty_216;	Qty* Qty_217;	Qty* Qty_218;	Qty* Qty_219;	Qty* Qty_220;	Qty* Qty_221;	Qty* Qty_222;	Qty* Qty_223;	Qty* Qty_224;	Qty* Qty_225;	Qty* Qty_226;	Qty* Qty_227;	Qty* Qty_228;	Qty* Qty_229;	Qty* Qty_230;	Qty* Qty_231;	Qty* Qty_232;	Qty* Qty_233;	Qty* Qty_234;	Qty* Qty_235;	Qty* Qty_236;	Qty* Qty_237;	Qty* Qty_238;	Qty* Qty_239;	Qty* Qty_240;	Qty* Qty_241;	Qty* Qty_242;	Qty* Qty_243;	Qty* Qty_244;	Qty* Qty_245;	Qty* Qty_246;	Qty* Qty_247;	Qty* Qty_248;	Qty* Qty_249;	Qty* Qty_250;	Qty* Qty_251;	Qty* Qty_252;	Qty* Qty_253;	Qty* Qty_254;	Qty* Qty_255;	Qty* Qty_256;	Qty* Qty_257;	Qty* Qty_258;	Qty* Qty_259;	Qty* Qty_260;	Qty* Qty_261;	Qty* Qty_262;	Qty* Qty_263;	Qty* Qty_264;	Qty* Qty_265;	Qty* Qty_266;	Qty* Qty_267;	Qty* Qty_268;	Qty* Qty_269;	Qty* Qty_270;	Qty* Qty_271;	Qty* Qty_272;	Qty* Qty_273;	Qty* Qty_274;	Qty* Qty_275;	Qty* Qty_276;	Qty* Qty_277;	Qty* Qty_278;	Qty* Qty_279;	Qty* Qty_280;	Qty* Qty_281;	Qty* Qty_282;	Qty* Qty_283;	Qty* Qty_284;	Qty* Qty_285;	Qty* Qty_286;	Qty* Qty_287;	Qty* Qty_288;	Qty* Qty_289;	Qty* Qty_290;	Qty* Qty_291;	Qty* Qty_292;	Qty* Qty_293;	Qty* Qty_294;	Qty* Qty_295;	Qty* Qty_296;	Qty* Qty_297;	Qty* Qty_298;	Qty* Qty_299;	Qty* Qty_300;	Qty* Qty_301;	Qty* Qty_302;	Qty* Qty_303;	Qty* Qty_304;	Qty* Qty_305;	Qty* Qty_306;	Qty* Qty_307;	Qty* Qty_308;	Qty* Qty_309;	Qty* Qty_310;	Qty* Qty_311;	Qty* Qty_312;	Qty* Qty_313;	Qty* Qty_314;	Qty* Qty_315;	Qty* Qty_316;	Qty* Qty_317;	Qty* Qty_318;	Qty* Qty_319;	Qty* Qty_320;	Qty* Qty_321;	Qty* Qty_322;	Qty* Qty_323;	Qty* Qty_324;	Qty* Qty_325;	Qty* Qty_326;	Qty* Qty_327;	Qty* Qty_328;	Qty* Qty_329;	Qty* Qty_330;	Qty* Qty_331;	Qty* Qty_332;	Qty* Qty_333;	Qty* Qty_334;	Qty* Qty_335;	Qty* Qty_336;	Qty* Qty_337;	Qty* Qty_338;	Qty* Qty_339;	Qty* Qty_340;	Qty* Qty_341;	Qty* Qty_342;
	Amt* Amt_1;
	Instrmt* Instrmt_1;
 	
 	public: 

  	// default constructor
	PosRpt () {
		Acct_ = "1";
		AcctTyp_ = "1";
		BizDt_ = "2003-09-10T00:00:00";
		Ccy_ = "USD";
		PriSetPx_ = "0.00";
		ReqTyp_ = "0";
		RptID_ = "541386431";
		Rslt_ = "0";
		SetPx_ = "0.00";
		SetPxTyp_ = "1";


		Hdr_1= new Hdr("N","N","1002","2001-12-17T09:30:47-05:00"
				, new Sndr("String","String","String")
				, new Tgt("String","String","String")
				, new OnBhlfOf("String","String","String")
				, new DlvrTo("String","String","String"));

		Pty_1= new Pty("OCC","21"
				, new Sub("ZZZ","2"));

		Pty_2= new Pty("99999","4"
				, new Sub("ZZZ","2"));

		Pty_3= new Pty("C","38"
				, new Sub("ZZZ","2"));

		Qty_1= new Qty("35","0","SOD");

		Qty_2= new Qty("20","10","FIN");

		Qty_3= new Qty("10",NULL,"IAS");

		Qty_4= new Qty("35","0","SOD");

		Qty_5= new Qty("20","10","FIN");

		Qty_6= new Qty("10",NULL,"IAS");

		Qty_7= new Qty("35","0","SOD");

		Qty_8= new Qty("20","10","FIN");

		Qty_9= new Qty("10",NULL,"IAS");

		Qty_10= new Qty("35","0","SOD");

		Qty_11= new Qty("20","10","FIN");

		Qty_12= new Qty("10",NULL,"IAS");

		Qty_13= new Qty("35","0","SOD");

		Qty_14= new Qty("20","10","FIN");

		Qty_15= new Qty("10",NULL,"IAS");

		Qty_16= new Qty("35","0","SOD");

		Qty_17= new Qty("20","10","FIN");

		Qty_18= new Qty("10",NULL,"IAS");

		Qty_19= new Qty("35","0","SOD");

		Qty_20= new Qty("20","10","FIN");

		Qty_21= new Qty("10",NULL,"IAS");

		Qty_22= new Qty("35","0","SOD");

		Qty_23= new Qty("20","10","FIN");

		Qty_24= new Qty("10",NULL,"IAS");

		Qty_25= new Qty("35","0","SOD");

		Qty_26= new Qty("20","10","FIN");

		Qty_27= new Qty("10",NULL,"IAS");

		Qty_28= new Qty("35","0","SOD");

		Qty_29= new Qty("20","10","FIN");

		Qty_30= new Qty("10",NULL,"IAS");

		Qty_31= new Qty("35","0","SOD");

		Qty_32= new Qty("20","10","FIN");

		Qty_33= new Qty("10",NULL,"IAS");

		Qty_34= new Qty("35","0","SOD");

		Qty_35= new Qty("20","10","FIN");

		Qty_36= new Qty("10",NULL,"IAS");

		Qty_37= new Qty("35","0","SOD");

		Qty_38= new Qty("20","10","FIN");

		Qty_39= new Qty("10",NULL,"IAS");

		Qty_40= new Qty("35","0","SOD");

		Qty_41= new Qty("20","10","FIN");

		Qty_42= new Qty("10",NULL,"IAS");

		Qty_43= new Qty("35","0","SOD");

		Qty_44= new Qty("20","10","FIN");

		Qty_45= new Qty("10",NULL,"IAS");

		Qty_46= new Qty("35","0","SOD");

		Qty_47= new Qty("20","10","FIN");

		Qty_48= new Qty("10",NULL,"IAS");

		Qty_49= new Qty("35","0","SOD");

		Qty_50= new Qty("20","10","FIN");

		Qty_51= new Qty("10",NULL,"IAS");

		Qty_52= new Qty("35","0","SOD");

		Qty_53= new Qty("20","10","FIN");

		Qty_54= new Qty("10",NULL,"IAS");

		Qty_55= new Qty("35","0","SOD");

		Qty_56= new Qty("20","10","FIN");

		Qty_57= new Qty("10",NULL,"IAS");

		Qty_58= new Qty("35","0","SOD");

		Qty_59= new Qty("20","10","FIN");

		Qty_60= new Qty("10",NULL,"IAS");

		Qty_61= new Qty("35","0","SOD");

		Qty_62= new Qty("20","10","FIN");

		Qty_63= new Qty("10",NULL,"IAS");

		Qty_64= new Qty("35","0","SOD");

		Qty_65= new Qty("20","10","FIN");

		Qty_66= new Qty("10",NULL,"IAS");

		Qty_67= new Qty("35","0","SOD");

		Qty_68= new Qty("20","10","FIN");

		Qty_69= new Qty("10",NULL,"IAS");

		Qty_70= new Qty("35","0","SOD");

		Qty_71= new Qty("20","10","FIN");

		Qty_72= new Qty("10",NULL,"IAS");

		Qty_73= new Qty("35","0","SOD");

		Qty_74= new Qty("20","10","FIN");

		Qty_75= new Qty("10",NULL,"IAS");

		Qty_76= new Qty("35","0","SOD");

		Qty_77= new Qty("20","10","FIN");

		Qty_78= new Qty("10",NULL,"IAS");

		Qty_79= new Qty("35","0","SOD");

		Qty_80= new Qty("20","10","FIN");

		Qty_81= new Qty("10",NULL,"IAS");

		Qty_82= new Qty("35","0","SOD");

		Qty_83= new Qty("20","10","FIN");

		Qty_84= new Qty("10",NULL,"IAS");

		Qty_85= new Qty("35","0","SOD");

		Qty_86= new Qty("20","10","FIN");

		Qty_87= new Qty("10",NULL,"IAS");

		Qty_88= new Qty("35","0","SOD");

		Qty_89= new Qty("20","10","FIN");

		Qty_90= new Qty("10",NULL,"IAS");

		Qty_91= new Qty("35","0","SOD");

		Qty_92= new Qty("20","10","FIN");

		Qty_93= new Qty("10",NULL,"IAS");

		Qty_94= new Qty("35","0","SOD");

		Qty_95= new Qty("20","10","FIN");

		Qty_96= new Qty("10",NULL,"IAS");

		Qty_97= new Qty("35","0","SOD");

		Qty_98= new Qty("20","10","FIN");

		Qty_99= new Qty("10",NULL,"IAS");

		Qty_100= new Qty("35","0","SOD");

		Qty_101= new Qty("20","10","FIN");

		Qty_102= new Qty("10",NULL,"IAS");

		Qty_103= new Qty("35","0","SOD");

		Qty_104= new Qty("20","10","FIN");

		Qty_105= new Qty("10",NULL,"IAS");

		Qty_106= new Qty("35","0","SOD");

		Qty_107= new Qty("20","10","FIN");

		Qty_108= new Qty("10",NULL,"IAS");

		Qty_109= new Qty("35","0","SOD");

		Qty_110= new Qty("20","10","FIN");

		Qty_111= new Qty("10",NULL,"IAS");

		Qty_112= new Qty("35","0","SOD");

		Qty_113= new Qty("20","10","FIN");

		Qty_114= new Qty("10",NULL,"IAS");

		Qty_115= new Qty("35","0","SOD");

		Qty_116= new Qty("20","10","FIN");

		Qty_117= new Qty("10",NULL,"IAS");

		Qty_118= new Qty("35","0","SOD");

		Qty_119= new Qty("20","10","FIN");

		Qty_120= new Qty("10",NULL,"IAS");

		Qty_121= new Qty("35","0","SOD");

		Qty_122= new Qty("20","10","FIN");

		Qty_123= new Qty("10",NULL,"IAS");

		Qty_124= new Qty("35","0","SOD");

		Qty_125= new Qty("20","10","FIN");

		Qty_126= new Qty("10",NULL,"IAS");

		Qty_127= new Qty("35","0","SOD");

		Qty_128= new Qty("20","10","FIN");

		Qty_129= new Qty("10",NULL,"IAS");

		Qty_130= new Qty("35","0","SOD");

		Qty_131= new Qty("20","10","FIN");

		Qty_132= new Qty("10",NULL,"IAS");

		Qty_133= new Qty("35","0","SOD");

		Qty_134= new Qty("20","10","FIN");

		Qty_135= new Qty("10",NULL,"IAS");

		Qty_136= new Qty("35","0","SOD");

		Qty_137= new Qty("20","10","FIN");

		Qty_138= new Qty("10",NULL,"IAS");

		Qty_139= new Qty("35","0","SOD");

		Qty_140= new Qty("20","10","FIN");

		Qty_141= new Qty("10",NULL,"IAS");

		Qty_142= new Qty("35","0","SOD");

		Qty_143= new Qty("20","10","FIN");

		Qty_144= new Qty("10",NULL,"IAS");

		Qty_145= new Qty("35","0","SOD");

		Qty_146= new Qty("20","10","FIN");

		Qty_147= new Qty("10",NULL,"IAS");

		Qty_148= new Qty("35","0","SOD");

		Qty_149= new Qty("20","10","FIN");

		Qty_150= new Qty("10",NULL,"IAS");

		Qty_151= new Qty("35","0","SOD");

		Qty_152= new Qty("20","10","FIN");

		Qty_153= new Qty("10",NULL,"IAS");

		Qty_154= new Qty("35","0","SOD");

		Qty_155= new Qty("20","10","FIN");

		Qty_156= new Qty("10",NULL,"IAS");

		Qty_157= new Qty("35","0","SOD");

		Qty_158= new Qty("20","10","FIN");

		Qty_159= new Qty("10",NULL,"IAS");

		Qty_160= new Qty("35","0","SOD");

		Qty_161= new Qty("20","10","FIN");

		Qty_162= new Qty("10",NULL,"IAS");

		Qty_163= new Qty("35","0","SOD");

		Qty_164= new Qty("20","10","FIN");

		Qty_165= new Qty("10",NULL,"IAS");

		Qty_166= new Qty("35","0","SOD");

		Qty_167= new Qty("20","10","FIN");

		Qty_168= new Qty("10",NULL,"IAS");

		Qty_169= new Qty("35","0","SOD");

		Qty_170= new Qty("20","10","FIN");

		Qty_171= new Qty("10",NULL,"IAS");

		Qty_172= new Qty("35","0","SOD");

		Qty_173= new Qty("20","10","FIN");

		Qty_174= new Qty("10",NULL,"IAS");

		Qty_175= new Qty("35","0","SOD");

		Qty_176= new Qty("20","10","FIN");

		Qty_177= new Qty("10",NULL,"IAS");

		Qty_178= new Qty("35","0","SOD");

		Qty_179= new Qty("20","10","FIN");

		Qty_180= new Qty("10",NULL,"IAS");

		Qty_181= new Qty("35","0","SOD");

		Qty_182= new Qty("20","10","FIN");

		Qty_183= new Qty("10",NULL,"IAS");

		Qty_184= new Qty("35","0","SOD");

		Qty_185= new Qty("20","10","FIN");

		Qty_186= new Qty("10",NULL,"IAS");

		Qty_187= new Qty("35","0","SOD");

		Qty_188= new Qty("20","10","FIN");

		Qty_189= new Qty("10",NULL,"IAS");

		Qty_190= new Qty("35","0","SOD");

		Qty_191= new Qty("20","10","FIN");

		Qty_192= new Qty("10",NULL,"IAS");

		Qty_193= new Qty("35","0","SOD");

		Qty_194= new Qty("20","10","FIN");

		Qty_195= new Qty("10",NULL,"IAS");

		Qty_196= new Qty("35","0","SOD");

		Qty_197= new Qty("20","10","FIN");

		Qty_198= new Qty("10",NULL,"IAS");

		Qty_199= new Qty("35","0","SOD");

		Qty_200= new Qty("20","10","FIN");

		Qty_201= new Qty("10",NULL,"IAS");

		Qty_202= new Qty("35","0","SOD");

		Qty_203= new Qty("20","10","FIN");

		Qty_204= new Qty("10",NULL,"IAS");

		Qty_205= new Qty("35","0","SOD");

		Qty_206= new Qty("20","10","FIN");

		Qty_207= new Qty("10",NULL,"IAS");

		Qty_208= new Qty("35","0","SOD");

		Qty_209= new Qty("20","10","FIN");

		Qty_210= new Qty("10",NULL,"IAS");

		Qty_211= new Qty("35","0","SOD");

		Qty_212= new Qty("20","10","FIN");

		Qty_213= new Qty("10",NULL,"IAS");

		Qty_214= new Qty("35","0","SOD");

		Qty_215= new Qty("20","10","FIN");

		Qty_216= new Qty("10",NULL,"IAS");

		Qty_217= new Qty("35","0","SOD");

		Qty_218= new Qty("20","10","FIN");

		Qty_219= new Qty("10",NULL,"IAS");

		Qty_220= new Qty("35","0","SOD");

		Qty_221= new Qty("20","10","FIN");

		Qty_222= new Qty("10",NULL,"IAS");

		Qty_223= new Qty("35","0","SOD");

		Qty_224= new Qty("20","10","FIN");

		Qty_225= new Qty("10",NULL,"IAS");

		Qty_226= new Qty("35","0","SOD");

		Qty_227= new Qty("20","10","FIN");

		Qty_228= new Qty("10",NULL,"IAS");

		Qty_229= new Qty("35","0","SOD");

		Qty_230= new Qty("20","10","FIN");

		Qty_231= new Qty("10",NULL,"IAS");

		Qty_232= new Qty("35","0","SOD");

		Qty_233= new Qty("20","10","FIN");

		Qty_234= new Qty("10",NULL,"IAS");

		Qty_235= new Qty("35","0","SOD");

		Qty_236= new Qty("20","10","FIN");

		Qty_237= new Qty("10",NULL,"IAS");

		Qty_238= new Qty("35","0","SOD");

		Qty_239= new Qty("20","10","FIN");

		Qty_240= new Qty("10",NULL,"IAS");

		Qty_241= new Qty("35","0","SOD");

		Qty_242= new Qty("20","10","FIN");

		Qty_243= new Qty("10",NULL,"IAS");

		Qty_244= new Qty("35","0","SOD");

		Qty_245= new Qty("20","10","FIN");

		Qty_246= new Qty("10",NULL,"IAS");

		Qty_247= new Qty("35","0","SOD");

		Qty_248= new Qty("20","10","FIN");

		Qty_249= new Qty("10",NULL,"IAS");

		Qty_250= new Qty("35","0","SOD");

		Qty_251= new Qty("20","10","FIN");

		Qty_252= new Qty("10",NULL,"IAS");

		Qty_253= new Qty("35","0","SOD");

		Qty_254= new Qty("20","10","FIN");

		Qty_255= new Qty("10",NULL,"IAS");

		Qty_256= new Qty("35","0","SOD");

		Qty_257= new Qty("20","10","FIN");

		Qty_258= new Qty("10",NULL,"IAS");

		Qty_259= new Qty("35","0","SOD");

		Qty_260= new Qty("20","10","FIN");

		Qty_261= new Qty("10",NULL,"IAS");

		Qty_262= new Qty("35","0","SOD");

		Qty_263= new Qty("20","10","FIN");

		Qty_264= new Qty("10",NULL,"IAS");

		Qty_265= new Qty("35","0","SOD");

		Qty_266= new Qty("20","10","FIN");

		Qty_267= new Qty("10",NULL,"IAS");

		Qty_268= new Qty("35","0","SOD");

		Qty_269= new Qty("20","10","FIN");

		Qty_270= new Qty("10",NULL,"IAS");

		Qty_271= new Qty("35","0","SOD");

		Qty_272= new Qty("20","10","FIN");

		Qty_273= new Qty("10",NULL,"IAS");

		Qty_274= new Qty("35","0","SOD");

		Qty_275= new Qty("20","10","FIN");

		Qty_276= new Qty("10",NULL,"IAS");

		Qty_277= new Qty("35","0","SOD");

		Qty_278= new Qty("20","10","FIN");

		Qty_279= new Qty("10",NULL,"IAS");

		Qty_280= new Qty("35","0","SOD");

		Qty_281= new Qty("20","10","FIN");

		Qty_282= new Qty("10",NULL,"IAS");

		Qty_283= new Qty("35","0","SOD");

		Qty_284= new Qty("20","10","FIN");

		Qty_285= new Qty("10",NULL,"IAS");

		Qty_286= new Qty("35","0","SOD");

		Qty_287= new Qty("20","10","FIN");

		Qty_288= new Qty("10",NULL,"IAS");

		Qty_289= new Qty("35","0","SOD");

		Qty_290= new Qty("20","10","FIN");

		Qty_291= new Qty("10",NULL,"IAS");

		Qty_292= new Qty("35","0","SOD");

		Qty_293= new Qty("20","10","FIN");

		Qty_294= new Qty("10",NULL,"IAS");

		Qty_295= new Qty("35","0","SOD");

		Qty_296= new Qty("20","10","FIN");

		Qty_297= new Qty("10",NULL,"IAS");

		Qty_298= new Qty("35","0","SOD");

		Qty_299= new Qty("20","10","FIN");

		Qty_300= new Qty("10",NULL,"IAS");

		Qty_301= new Qty("35","0","SOD");

		Qty_302= new Qty("20","10","FIN");

		Qty_303= new Qty("10",NULL,"IAS");

		Qty_304= new Qty("35","0","SOD");

		Qty_305= new Qty("20","10","FIN");

		Qty_306= new Qty("10",NULL,"IAS");

		Qty_307= new Qty("35","0","SOD");

		Qty_308= new Qty("20","10","FIN");

		Qty_309= new Qty("10",NULL,"IAS");

		Qty_310= new Qty("35","0","SOD");

		Qty_311= new Qty("20","10","FIN");

		Qty_312= new Qty("10",NULL,"IAS");

		Qty_313= new Qty("35","0","SOD");

		Qty_314= new Qty("20","10","FIN");

		Qty_315= new Qty("10",NULL,"IAS");

		Qty_316= new Qty("35","0","SOD");

		Qty_317= new Qty("20","10","FIN");

		Qty_318= new Qty("10",NULL,"IAS");

		Qty_319= new Qty("35","0","SOD");

		Qty_320= new Qty("20","10","FIN");

		Qty_321= new Qty("10",NULL,"IAS");

		Qty_322= new Qty("35","0","SOD");

		Qty_323= new Qty("20","10","FIN");

		Qty_324= new Qty("10",NULL,"IAS");

		Qty_325= new Qty("35","0","SOD");

		Qty_326= new Qty("20","10","FIN");

		Qty_327= new Qty("10",NULL,"IAS");

		Qty_328= new Qty("35","0","SOD");

		Qty_329= new Qty("20","10","FIN");

		Qty_330= new Qty("10",NULL,"IAS");

		Qty_331= new Qty("35","0","SOD");

		Qty_332= new Qty("20","10","FIN");

		Qty_333= new Qty("10",NULL,"IAS");

		Qty_334= new Qty("35","0","SOD");

		Qty_335= new Qty("20","10","FIN");

		Qty_336= new Qty("10",NULL,"IAS");

		Qty_337= new Qty("35","0","SOD");

		Qty_338= new Qty("20","10","FIN");

		Qty_339= new Qty("10",NULL,"IAS");

		Qty_340= new Qty("35","0","SOD");

		Qty_341= new Qty("20","10","FIN");

		Qty_342= new Qty("10",NULL,"IAS");

		Amt_1= new Amt("0.00","FMTM");

		Instrmt_1= new Instrmt("OCASPS","KW","J","20031122","2003-11-22T00:00:00","100","47.50","USD","AOL");  	
  	}
  
  	// by parameters
  	PosRpt (		string Acct_p, string AcctTyp_p, string BizDt_p, string Ccy_p, string PriSetPx_p, string ReqTyp_p, string RptID_p, string Rslt_p, string SetPx_p, string SetPxTyp_p, Hdr* Hdr_1, Pty* Pty_1, Pty* Pty_2, Pty* Pty_3, Qty* Qty_1, Qty* Qty_2, Qty* Qty_3, Qty* Qty_4, Qty* Qty_5, Qty* Qty_6, Qty* Qty_7, Qty* Qty_8, Qty* Qty_9, Qty* Qty_10, Qty* Qty_11, Qty* Qty_12, Qty* Qty_13, Qty* Qty_14, Qty* Qty_15, Qty* Qty_16, Qty* Qty_17, Qty* Qty_18, Qty* Qty_19, Qty* Qty_20, Qty* Qty_21, Qty* Qty_22, Qty* Qty_23, Qty* Qty_24, Qty* Qty_25, Qty* Qty_26, Qty* Qty_27, Qty* Qty_28, Qty* Qty_29, Qty* Qty_30, Qty* Qty_31, Qty* Qty_32, Qty* Qty_33, Qty* Qty_34, Qty* Qty_35, Qty* Qty_36, Qty* Qty_37, Qty* Qty_38, Qty* Qty_39, Qty* Qty_40, Qty* Qty_41, Qty* Qty_42, Qty* Qty_43, Qty* Qty_44, Qty* Qty_45, Qty* Qty_46, Qty* Qty_47, Qty* Qty_48, Qty* Qty_49, Qty* Qty_50, Qty* Qty_51, Qty* Qty_52, Qty* Qty_53, Qty* Qty_54, Qty* Qty_55, Qty* Qty_56, Qty* Qty_57, Qty* Qty_58, Qty* Qty_59, Qty* Qty_60, Qty* Qty_61, Qty* Qty_62, Qty* Qty_63, Qty* Qty_64, Qty* Qty_65, Qty* Qty_66, Qty* Qty_67, Qty* Qty_68, Qty* Qty_69, Qty* Qty_70, Qty* Qty_71, Qty* Qty_72, Qty* Qty_73, Qty* Qty_74, Qty* Qty_75, Qty* Qty_76, Qty* Qty_77, Qty* Qty_78, Qty* Qty_79, Qty* Qty_80, Qty* Qty_81, Qty* Qty_82, Qty* Qty_83, Qty* Qty_84, Qty* Qty_85, Qty* Qty_86, Qty* Qty_87, Qty* Qty_88, Qty* Qty_89, Qty* Qty_90, Qty* Qty_91, Qty* Qty_92, Qty* Qty_93, Qty* Qty_94, Qty* Qty_95, Qty* Qty_96, Qty* Qty_97, Qty* Qty_98, Qty* Qty_99, Qty* Qty_100, Qty* Qty_101, Qty* Qty_102, Qty* Qty_103, Qty* Qty_104, Qty* Qty_105, Qty* Qty_106, Qty* Qty_107, Qty* Qty_108, Qty* Qty_109, Qty* Qty_110, Qty* Qty_111, Qty* Qty_112, Qty* Qty_113, Qty* Qty_114, Qty* Qty_115, Qty* Qty_116, Qty* Qty_117, Qty* Qty_118, Qty* Qty_119, Qty* Qty_120, Qty* Qty_121, Qty* Qty_122, Qty* Qty_123, Qty* Qty_124, Qty* Qty_125, Qty* Qty_126, Qty* Qty_127, Qty* Qty_128, Qty* Qty_129, Qty* Qty_130, Qty* Qty_131, Qty* Qty_132, Qty* Qty_133, Qty* Qty_134, Qty* Qty_135, Qty* Qty_136, Qty* Qty_137, Qty* Qty_138, Qty* Qty_139, Qty* Qty_140, Qty* Qty_141, Qty* Qty_142, Qty* Qty_143, Qty* Qty_144, Qty* Qty_145, Qty* Qty_146, Qty* Qty_147, Qty* Qty_148, Qty* Qty_149, Qty* Qty_150, Qty* Qty_151, Qty* Qty_152, Qty* Qty_153, Qty* Qty_154, Qty* Qty_155, Qty* Qty_156, Qty* Qty_157, Qty* Qty_158, Qty* Qty_159, Qty* Qty_160, Qty* Qty_161, Qty* Qty_162, Qty* Qty_163, Qty* Qty_164, Qty* Qty_165, Qty* Qty_166, Qty* Qty_167, Qty* Qty_168, Qty* Qty_169, Qty* Qty_170, Qty* Qty_171, Qty* Qty_172, Qty* Qty_173, Qty* Qty_174, Qty* Qty_175, Qty* Qty_176, Qty* Qty_177, Qty* Qty_178, Qty* Qty_179, Qty* Qty_180, Qty* Qty_181, Qty* Qty_182, Qty* Qty_183, Qty* Qty_184, Qty* Qty_185, Qty* Qty_186, Qty* Qty_187, Qty* Qty_188, Qty* Qty_189, Qty* Qty_190, Qty* Qty_191, Qty* Qty_192, Qty* Qty_193, Qty* Qty_194, Qty* Qty_195, Qty* Qty_196, Qty* Qty_197, Qty* Qty_198, Qty* Qty_199, Qty* Qty_200, Qty* Qty_201, Qty* Qty_202, Qty* Qty_203, Qty* Qty_204, Qty* Qty_205, Qty* Qty_206, Qty* Qty_207, Qty* Qty_208, Qty* Qty_209, Qty* Qty_210, Qty* Qty_211, Qty* Qty_212, Qty* Qty_213, Qty* Qty_214, Qty* Qty_215, Qty* Qty_216, Qty* Qty_217, Qty* Qty_218, Qty* Qty_219, Qty* Qty_220, Qty* Qty_221, Qty* Qty_222, Qty* Qty_223, Qty* Qty_224, Qty* Qty_225, Qty* Qty_226, Qty* Qty_227, Qty* Qty_228, Qty* Qty_229, Qty* Qty_230, Qty* Qty_231, Qty* Qty_232, Qty* Qty_233, Qty* Qty_234, Qty* Qty_235, Qty* Qty_236, Qty* Qty_237, Qty* Qty_238, Qty* Qty_239, Qty* Qty_240, Qty* Qty_241, Qty* Qty_242, Qty* Qty_243, Qty* Qty_244, Qty* Qty_245, Qty* Qty_246, Qty* Qty_247, Qty* Qty_248, Qty* Qty_249, Qty* Qty_250, Qty* Qty_251, Qty* Qty_252, Qty* Qty_253, Qty* Qty_254, Qty* Qty_255, Qty* Qty_256, Qty* Qty_257, Qty* Qty_258, Qty* Qty_259, Qty* Qty_260, Qty* Qty_261, Qty* Qty_262, Qty* Qty_263, Qty* Qty_264, Qty* Qty_265, Qty* Qty_266, Qty* Qty_267, Qty* Qty_268, Qty* Qty_269, Qty* Qty_270, Qty* Qty_271, Qty* Qty_272, Qty* Qty_273, Qty* Qty_274, Qty* Qty_275, Qty* Qty_276, Qty* Qty_277, Qty* Qty_278, Qty* Qty_279, Qty* Qty_280, Qty* Qty_281, Qty* Qty_282, Qty* Qty_283, Qty* Qty_284, Qty* Qty_285, Qty* Qty_286, Qty* Qty_287, Qty* Qty_288, Qty* Qty_289, Qty* Qty_290, Qty* Qty_291, Qty* Qty_292, Qty* Qty_293, Qty* Qty_294, Qty* Qty_295, Qty* Qty_296, Qty* Qty_297, Qty* Qty_298, Qty* Qty_299, Qty* Qty_300, Qty* Qty_301, Qty* Qty_302, Qty* Qty_303, Qty* Qty_304, Qty* Qty_305, Qty* Qty_306, Qty* Qty_307, Qty* Qty_308, Qty* Qty_309, Qty* Qty_310, Qty* Qty_311, Qty* Qty_312, Qty* Qty_313, Qty* Qty_314, Qty* Qty_315, Qty* Qty_316, Qty* Qty_317, Qty* Qty_318, Qty* Qty_319, Qty* Qty_320, Qty* Qty_321, Qty* Qty_322, Qty* Qty_323, Qty* Qty_324, Qty* Qty_325, Qty* Qty_326, Qty* Qty_327, Qty* Qty_328, Qty* Qty_329, Qty* Qty_330, Qty* Qty_331, Qty* Qty_332, Qty* Qty_333, Qty* Qty_334, Qty* Qty_335, Qty* Qty_336, Qty* Qty_337, Qty* Qty_338, Qty* Qty_339, Qty* Qty_340, Qty* Qty_341, Qty* Qty_342, Amt* Amt_1, Instrmt* Instrmt_1){
	  
		Acct_ = Acct_p;
		AcctTyp_ = AcctTyp_p;
		BizDt_ = BizDt_p;
		Ccy_ = Ccy_p;
		PriSetPx_ = PriSetPx_p;
		ReqTyp_ = ReqTyp_p;
		RptID_ = RptID_p;
		Rslt_ = Rslt_p;
		SetPx_ = SetPx_p;
		SetPxTyp_ = SetPxTyp_p;
	  
		this->Hdr_1 = Hdr_1;
		this->Pty_1 = Pty_1;
		this->Pty_2 = Pty_2;
		this->Pty_3 = Pty_3;
		this->Qty_1 = Qty_1;
		this->Qty_2 = Qty_2;
		this->Qty_3 = Qty_3;
		this->Qty_4 = Qty_4;
		this->Qty_5 = Qty_5;
		this->Qty_6 = Qty_6;
		this->Qty_7 = Qty_7;
		this->Qty_8 = Qty_8;
		this->Qty_9 = Qty_9;
		this->Qty_10 = Qty_10;
		this->Qty_11 = Qty_11;
		this->Qty_12 = Qty_12;
		this->Qty_13 = Qty_13;
		this->Qty_14 = Qty_14;
		this->Qty_15 = Qty_15;
		this->Qty_16 = Qty_16;
		this->Qty_17 = Qty_17;
		this->Qty_18 = Qty_18;
		this->Qty_19 = Qty_19;
		this->Qty_20 = Qty_20;
		this->Qty_21 = Qty_21;
		this->Qty_22 = Qty_22;
		this->Qty_23 = Qty_23;
		this->Qty_24 = Qty_24;
		this->Qty_25 = Qty_25;
		this->Qty_26 = Qty_26;
		this->Qty_27 = Qty_27;
		this->Qty_28 = Qty_28;
		this->Qty_29 = Qty_29;
		this->Qty_30 = Qty_30;
		this->Qty_31 = Qty_31;
		this->Qty_32 = Qty_32;
		this->Qty_33 = Qty_33;
		this->Qty_34 = Qty_34;
		this->Qty_35 = Qty_35;
		this->Qty_36 = Qty_36;
		this->Qty_37 = Qty_37;
		this->Qty_38 = Qty_38;
		this->Qty_39 = Qty_39;
		this->Qty_40 = Qty_40;
		this->Qty_41 = Qty_41;
		this->Qty_42 = Qty_42;
		this->Qty_43 = Qty_43;
		this->Qty_44 = Qty_44;
		this->Qty_45 = Qty_45;
		this->Qty_46 = Qty_46;
		this->Qty_47 = Qty_47;
		this->Qty_48 = Qty_48;
		this->Qty_49 = Qty_49;
		this->Qty_50 = Qty_50;
		this->Qty_51 = Qty_51;
		this->Qty_52 = Qty_52;
		this->Qty_53 = Qty_53;
		this->Qty_54 = Qty_54;
		this->Qty_55 = Qty_55;
		this->Qty_56 = Qty_56;
		this->Qty_57 = Qty_57;
		this->Qty_58 = Qty_58;
		this->Qty_59 = Qty_59;
		this->Qty_60 = Qty_60;
		this->Qty_61 = Qty_61;
		this->Qty_62 = Qty_62;
		this->Qty_63 = Qty_63;
		this->Qty_64 = Qty_64;
		this->Qty_65 = Qty_65;
		this->Qty_66 = Qty_66;
		this->Qty_67 = Qty_67;
		this->Qty_68 = Qty_68;
		this->Qty_69 = Qty_69;
		this->Qty_70 = Qty_70;
		this->Qty_71 = Qty_71;
		this->Qty_72 = Qty_72;
		this->Qty_73 = Qty_73;
		this->Qty_74 = Qty_74;
		this->Qty_75 = Qty_75;
		this->Qty_76 = Qty_76;
		this->Qty_77 = Qty_77;
		this->Qty_78 = Qty_78;
		this->Qty_79 = Qty_79;
		this->Qty_80 = Qty_80;
		this->Qty_81 = Qty_81;
		this->Qty_82 = Qty_82;
		this->Qty_83 = Qty_83;
		this->Qty_84 = Qty_84;
		this->Qty_85 = Qty_85;
		this->Qty_86 = Qty_86;
		this->Qty_87 = Qty_87;
		this->Qty_88 = Qty_88;
		this->Qty_89 = Qty_89;
		this->Qty_90 = Qty_90;
		this->Qty_91 = Qty_91;
		this->Qty_92 = Qty_92;
		this->Qty_93 = Qty_93;
		this->Qty_94 = Qty_94;
		this->Qty_95 = Qty_95;
		this->Qty_96 = Qty_96;
		this->Qty_97 = Qty_97;
		this->Qty_98 = Qty_98;
		this->Qty_99 = Qty_99;
		this->Qty_100 = Qty_100;
		this->Qty_101 = Qty_101;
		this->Qty_102 = Qty_102;
		this->Qty_103 = Qty_103;
		this->Qty_104 = Qty_104;
		this->Qty_105 = Qty_105;
		this->Qty_106 = Qty_106;
		this->Qty_107 = Qty_107;
		this->Qty_108 = Qty_108;
		this->Qty_109 = Qty_109;
		this->Qty_110 = Qty_110;
		this->Qty_111 = Qty_111;
		this->Qty_112 = Qty_112;
		this->Qty_113 = Qty_113;
		this->Qty_114 = Qty_114;
		this->Qty_115 = Qty_115;
		this->Qty_116 = Qty_116;
		this->Qty_117 = Qty_117;
		this->Qty_118 = Qty_118;
		this->Qty_119 = Qty_119;
		this->Qty_120 = Qty_120;
		this->Qty_121 = Qty_121;
		this->Qty_122 = Qty_122;
		this->Qty_123 = Qty_123;
		this->Qty_124 = Qty_124;
		this->Qty_125 = Qty_125;
		this->Qty_126 = Qty_126;
		this->Qty_127 = Qty_127;
		this->Qty_128 = Qty_128;
		this->Qty_129 = Qty_129;
		this->Qty_130 = Qty_130;
		this->Qty_131 = Qty_131;
		this->Qty_132 = Qty_132;
		this->Qty_133 = Qty_133;
		this->Qty_134 = Qty_134;
		this->Qty_135 = Qty_135;
		this->Qty_136 = Qty_136;
		this->Qty_137 = Qty_137;
		this->Qty_138 = Qty_138;
		this->Qty_139 = Qty_139;
		this->Qty_140 = Qty_140;
		this->Qty_141 = Qty_141;
		this->Qty_142 = Qty_142;
		this->Qty_143 = Qty_143;
		this->Qty_144 = Qty_144;
		this->Qty_145 = Qty_145;
		this->Qty_146 = Qty_146;
		this->Qty_147 = Qty_147;
		this->Qty_148 = Qty_148;
		this->Qty_149 = Qty_149;
		this->Qty_150 = Qty_150;
		this->Qty_151 = Qty_151;
		this->Qty_152 = Qty_152;
		this->Qty_153 = Qty_153;
		this->Qty_154 = Qty_154;
		this->Qty_155 = Qty_155;
		this->Qty_156 = Qty_156;
		this->Qty_157 = Qty_157;
		this->Qty_158 = Qty_158;
		this->Qty_159 = Qty_159;
		this->Qty_160 = Qty_160;
		this->Qty_161 = Qty_161;
		this->Qty_162 = Qty_162;
		this->Qty_163 = Qty_163;
		this->Qty_164 = Qty_164;
		this->Qty_165 = Qty_165;
		this->Qty_166 = Qty_166;
		this->Qty_167 = Qty_167;
		this->Qty_168 = Qty_168;
		this->Qty_169 = Qty_169;
		this->Qty_170 = Qty_170;
		this->Qty_171 = Qty_171;
		this->Qty_172 = Qty_172;
		this->Qty_173 = Qty_173;
		this->Qty_174 = Qty_174;
		this->Qty_175 = Qty_175;
		this->Qty_176 = Qty_176;
		this->Qty_177 = Qty_177;
		this->Qty_178 = Qty_178;
		this->Qty_179 = Qty_179;
		this->Qty_180 = Qty_180;
		this->Qty_181 = Qty_181;
		this->Qty_182 = Qty_182;
		this->Qty_183 = Qty_183;
		this->Qty_184 = Qty_184;
		this->Qty_185 = Qty_185;
		this->Qty_186 = Qty_186;
		this->Qty_187 = Qty_187;
		this->Qty_188 = Qty_188;
		this->Qty_189 = Qty_189;
		this->Qty_190 = Qty_190;
		this->Qty_191 = Qty_191;
		this->Qty_192 = Qty_192;
		this->Qty_193 = Qty_193;
		this->Qty_194 = Qty_194;
		this->Qty_195 = Qty_195;
		this->Qty_196 = Qty_196;
		this->Qty_197 = Qty_197;
		this->Qty_198 = Qty_198;
		this->Qty_199 = Qty_199;
		this->Qty_200 = Qty_200;
		this->Qty_201 = Qty_201;
		this->Qty_202 = Qty_202;
		this->Qty_203 = Qty_203;
		this->Qty_204 = Qty_204;
		this->Qty_205 = Qty_205;
		this->Qty_206 = Qty_206;
		this->Qty_207 = Qty_207;
		this->Qty_208 = Qty_208;
		this->Qty_209 = Qty_209;
		this->Qty_210 = Qty_210;
		this->Qty_211 = Qty_211;
		this->Qty_212 = Qty_212;
		this->Qty_213 = Qty_213;
		this->Qty_214 = Qty_214;
		this->Qty_215 = Qty_215;
		this->Qty_216 = Qty_216;
		this->Qty_217 = Qty_217;
		this->Qty_218 = Qty_218;
		this->Qty_219 = Qty_219;
		this->Qty_220 = Qty_220;
		this->Qty_221 = Qty_221;
		this->Qty_222 = Qty_222;
		this->Qty_223 = Qty_223;
		this->Qty_224 = Qty_224;
		this->Qty_225 = Qty_225;
		this->Qty_226 = Qty_226;
		this->Qty_227 = Qty_227;
		this->Qty_228 = Qty_228;
		this->Qty_229 = Qty_229;
		this->Qty_230 = Qty_230;
		this->Qty_231 = Qty_231;
		this->Qty_232 = Qty_232;
		this->Qty_233 = Qty_233;
		this->Qty_234 = Qty_234;
		this->Qty_235 = Qty_235;
		this->Qty_236 = Qty_236;
		this->Qty_237 = Qty_237;
		this->Qty_238 = Qty_238;
		this->Qty_239 = Qty_239;
		this->Qty_240 = Qty_240;
		this->Qty_241 = Qty_241;
		this->Qty_242 = Qty_242;
		this->Qty_243 = Qty_243;
		this->Qty_244 = Qty_244;
		this->Qty_245 = Qty_245;
		this->Qty_246 = Qty_246;
		this->Qty_247 = Qty_247;
		this->Qty_248 = Qty_248;
		this->Qty_249 = Qty_249;
		this->Qty_250 = Qty_250;
		this->Qty_251 = Qty_251;
		this->Qty_252 = Qty_252;
		this->Qty_253 = Qty_253;
		this->Qty_254 = Qty_254;
		this->Qty_255 = Qty_255;
		this->Qty_256 = Qty_256;
		this->Qty_257 = Qty_257;
		this->Qty_258 = Qty_258;
		this->Qty_259 = Qty_259;
		this->Qty_260 = Qty_260;
		this->Qty_261 = Qty_261;
		this->Qty_262 = Qty_262;
		this->Qty_263 = Qty_263;
		this->Qty_264 = Qty_264;
		this->Qty_265 = Qty_265;
		this->Qty_266 = Qty_266;
		this->Qty_267 = Qty_267;
		this->Qty_268 = Qty_268;
		this->Qty_269 = Qty_269;
		this->Qty_270 = Qty_270;
		this->Qty_271 = Qty_271;
		this->Qty_272 = Qty_272;
		this->Qty_273 = Qty_273;
		this->Qty_274 = Qty_274;
		this->Qty_275 = Qty_275;
		this->Qty_276 = Qty_276;
		this->Qty_277 = Qty_277;
		this->Qty_278 = Qty_278;
		this->Qty_279 = Qty_279;
		this->Qty_280 = Qty_280;
		this->Qty_281 = Qty_281;
		this->Qty_282 = Qty_282;
		this->Qty_283 = Qty_283;
		this->Qty_284 = Qty_284;
		this->Qty_285 = Qty_285;
		this->Qty_286 = Qty_286;
		this->Qty_287 = Qty_287;
		this->Qty_288 = Qty_288;
		this->Qty_289 = Qty_289;
		this->Qty_290 = Qty_290;
		this->Qty_291 = Qty_291;
		this->Qty_292 = Qty_292;
		this->Qty_293 = Qty_293;
		this->Qty_294 = Qty_294;
		this->Qty_295 = Qty_295;
		this->Qty_296 = Qty_296;
		this->Qty_297 = Qty_297;
		this->Qty_298 = Qty_298;
		this->Qty_299 = Qty_299;
		this->Qty_300 = Qty_300;
		this->Qty_301 = Qty_301;
		this->Qty_302 = Qty_302;
		this->Qty_303 = Qty_303;
		this->Qty_304 = Qty_304;
		this->Qty_305 = Qty_305;
		this->Qty_306 = Qty_306;
		this->Qty_307 = Qty_307;
		this->Qty_308 = Qty_308;
		this->Qty_309 = Qty_309;
		this->Qty_310 = Qty_310;
		this->Qty_311 = Qty_311;
		this->Qty_312 = Qty_312;
		this->Qty_313 = Qty_313;
		this->Qty_314 = Qty_314;
		this->Qty_315 = Qty_315;
		this->Qty_316 = Qty_316;
		this->Qty_317 = Qty_317;
		this->Qty_318 = Qty_318;
		this->Qty_319 = Qty_319;
		this->Qty_320 = Qty_320;
		this->Qty_321 = Qty_321;
		this->Qty_322 = Qty_322;
		this->Qty_323 = Qty_323;
		this->Qty_324 = Qty_324;
		this->Qty_325 = Qty_325;
		this->Qty_326 = Qty_326;
		this->Qty_327 = Qty_327;
		this->Qty_328 = Qty_328;
		this->Qty_329 = Qty_329;
		this->Qty_330 = Qty_330;
		this->Qty_331 = Qty_331;
		this->Qty_332 = Qty_332;
		this->Qty_333 = Qty_333;
		this->Qty_334 = Qty_334;
		this->Qty_335 = Qty_335;
		this->Qty_336 = Qty_336;
		this->Qty_337 = Qty_337;
		this->Qty_338 = Qty_338;
		this->Qty_339 = Qty_339;
		this->Qty_340 = Qty_340;
		this->Qty_341 = Qty_341;
		this->Qty_342 = Qty_342;
		this->Amt_1 = Amt_1;
		this->Instrmt_1 = Instrmt_1;
  	}
};