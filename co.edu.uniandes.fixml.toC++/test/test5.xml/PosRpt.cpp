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
	Pty* Pty_1;	Pty* Pty_2;	Pty* Pty_3;	Pty* Pty_4;	Pty* Pty_5;	Pty* Pty_6;	Pty* Pty_7;	Pty* Pty_8;	Pty* Pty_9;	Pty* Pty_10;	Pty* Pty_11;	Pty* Pty_12;	Pty* Pty_13;	Pty* Pty_14;	Pty* Pty_15;	Pty* Pty_16;	Pty* Pty_17;	Pty* Pty_18;	Pty* Pty_19;	Pty* Pty_20;	Pty* Pty_21;	Pty* Pty_22;	Pty* Pty_23;	Pty* Pty_24;	Pty* Pty_25;	Pty* Pty_26;	Pty* Pty_27;	Pty* Pty_28;	Pty* Pty_29;	Pty* Pty_30;	Pty* Pty_31;	Pty* Pty_32;	Pty* Pty_33;	Pty* Pty_34;	Pty* Pty_35;	Pty* Pty_36;	Pty* Pty_37;	Pty* Pty_38;	Pty* Pty_39;	Pty* Pty_40;	Pty* Pty_41;	Pty* Pty_42;	Pty* Pty_43;	Pty* Pty_44;	Pty* Pty_45;	Pty* Pty_46;	Pty* Pty_47;	Pty* Pty_48;	Pty* Pty_49;	Pty* Pty_50;	Pty* Pty_51;	Pty* Pty_52;	Pty* Pty_53;	Pty* Pty_54;	Pty* Pty_55;	Pty* Pty_56;	Pty* Pty_57;	Pty* Pty_58;	Pty* Pty_59;	Pty* Pty_60;	Pty* Pty_61;	Pty* Pty_62;	Pty* Pty_63;
	Qty* Qty_1;	Qty* Qty_2;	Qty* Qty_3;	Qty* Qty_4;	Qty* Qty_5;	Qty* Qty_6;	Qty* Qty_7;	Qty* Qty_8;	Qty* Qty_9;	Qty* Qty_10;	Qty* Qty_11;	Qty* Qty_12;	Qty* Qty_13;	Qty* Qty_14;	Qty* Qty_15;	Qty* Qty_16;	Qty* Qty_17;	Qty* Qty_18;	Qty* Qty_19;	Qty* Qty_20;	Qty* Qty_21;	Qty* Qty_22;	Qty* Qty_23;	Qty* Qty_24;	Qty* Qty_25;	Qty* Qty_26;	Qty* Qty_27;	Qty* Qty_28;	Qty* Qty_29;	Qty* Qty_30;	Qty* Qty_31;	Qty* Qty_32;	Qty* Qty_33;	Qty* Qty_34;	Qty* Qty_35;	Qty* Qty_36;	Qty* Qty_37;	Qty* Qty_38;	Qty* Qty_39;	Qty* Qty_40;	Qty* Qty_41;	Qty* Qty_42;	Qty* Qty_43;	Qty* Qty_44;	Qty* Qty_45;	Qty* Qty_46;	Qty* Qty_47;	Qty* Qty_48;	Qty* Qty_49;	Qty* Qty_50;	Qty* Qty_51;	Qty* Qty_52;	Qty* Qty_53;	Qty* Qty_54;	Qty* Qty_55;	Qty* Qty_56;	Qty* Qty_57;	Qty* Qty_58;	Qty* Qty_59;	Qty* Qty_60;	Qty* Qty_61;	Qty* Qty_62;	Qty* Qty_63;
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
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_2= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_3= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_4= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_5= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_6= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_7= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_8= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_9= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_10= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_11= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_12= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_13= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_14= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_15= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_16= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_17= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_18= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_19= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_20= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_21= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_22= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_23= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_24= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_25= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_26= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_27= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_28= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_29= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_30= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_31= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_32= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_33= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_34= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_35= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_36= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_37= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_38= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_39= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_40= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_41= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_42= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_43= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_44= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_45= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_46= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_47= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_48= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_49= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_50= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_51= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_52= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_53= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_54= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_55= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_56= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_57= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_58= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_59= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_60= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_61= new Pty("OCC","21"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_62= new Pty("99999","4"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

		Pty_63= new Pty("C","38"
				, new Sub("ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2")"ZZZ","2"));

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

		Amt_1= new Amt("0.00","FMTM");

		Instrmt_1= new Instrmt("OCASPS","KW","J","20031122","2003-11-22T00:00:00","100","47.50","USD","AOL");  	
  	}
  
  	// by parameters
  	PosRpt (		string Acct_p, string AcctTyp_p, string BizDt_p, string Ccy_p, string PriSetPx_p, string ReqTyp_p, string RptID_p, string Rslt_p, string SetPx_p, string SetPxTyp_p, Hdr* Hdr_1, Pty* Pty_1, Pty* Pty_2, Pty* Pty_3, Pty* Pty_4, Pty* Pty_5, Pty* Pty_6, Pty* Pty_7, Pty* Pty_8, Pty* Pty_9, Pty* Pty_10, Pty* Pty_11, Pty* Pty_12, Pty* Pty_13, Pty* Pty_14, Pty* Pty_15, Pty* Pty_16, Pty* Pty_17, Pty* Pty_18, Pty* Pty_19, Pty* Pty_20, Pty* Pty_21, Pty* Pty_22, Pty* Pty_23, Pty* Pty_24, Pty* Pty_25, Pty* Pty_26, Pty* Pty_27, Pty* Pty_28, Pty* Pty_29, Pty* Pty_30, Pty* Pty_31, Pty* Pty_32, Pty* Pty_33, Pty* Pty_34, Pty* Pty_35, Pty* Pty_36, Pty* Pty_37, Pty* Pty_38, Pty* Pty_39, Pty* Pty_40, Pty* Pty_41, Pty* Pty_42, Pty* Pty_43, Pty* Pty_44, Pty* Pty_45, Pty* Pty_46, Pty* Pty_47, Pty* Pty_48, Pty* Pty_49, Pty* Pty_50, Pty* Pty_51, Pty* Pty_52, Pty* Pty_53, Pty* Pty_54, Pty* Pty_55, Pty* Pty_56, Pty* Pty_57, Pty* Pty_58, Pty* Pty_59, Pty* Pty_60, Pty* Pty_61, Pty* Pty_62, Pty* Pty_63, Qty* Qty_1, Qty* Qty_2, Qty* Qty_3, Qty* Qty_4, Qty* Qty_5, Qty* Qty_6, Qty* Qty_7, Qty* Qty_8, Qty* Qty_9, Qty* Qty_10, Qty* Qty_11, Qty* Qty_12, Qty* Qty_13, Qty* Qty_14, Qty* Qty_15, Qty* Qty_16, Qty* Qty_17, Qty* Qty_18, Qty* Qty_19, Qty* Qty_20, Qty* Qty_21, Qty* Qty_22, Qty* Qty_23, Qty* Qty_24, Qty* Qty_25, Qty* Qty_26, Qty* Qty_27, Qty* Qty_28, Qty* Qty_29, Qty* Qty_30, Qty* Qty_31, Qty* Qty_32, Qty* Qty_33, Qty* Qty_34, Qty* Qty_35, Qty* Qty_36, Qty* Qty_37, Qty* Qty_38, Qty* Qty_39, Qty* Qty_40, Qty* Qty_41, Qty* Qty_42, Qty* Qty_43, Qty* Qty_44, Qty* Qty_45, Qty* Qty_46, Qty* Qty_47, Qty* Qty_48, Qty* Qty_49, Qty* Qty_50, Qty* Qty_51, Qty* Qty_52, Qty* Qty_53, Qty* Qty_54, Qty* Qty_55, Qty* Qty_56, Qty* Qty_57, Qty* Qty_58, Qty* Qty_59, Qty* Qty_60, Qty* Qty_61, Qty* Qty_62, Qty* Qty_63, Amt* Amt_1, Instrmt* Instrmt_1){
	  
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
		this->Pty_4 = Pty_4;
		this->Pty_5 = Pty_5;
		this->Pty_6 = Pty_6;
		this->Pty_7 = Pty_7;
		this->Pty_8 = Pty_8;
		this->Pty_9 = Pty_9;
		this->Pty_10 = Pty_10;
		this->Pty_11 = Pty_11;
		this->Pty_12 = Pty_12;
		this->Pty_13 = Pty_13;
		this->Pty_14 = Pty_14;
		this->Pty_15 = Pty_15;
		this->Pty_16 = Pty_16;
		this->Pty_17 = Pty_17;
		this->Pty_18 = Pty_18;
		this->Pty_19 = Pty_19;
		this->Pty_20 = Pty_20;
		this->Pty_21 = Pty_21;
		this->Pty_22 = Pty_22;
		this->Pty_23 = Pty_23;
		this->Pty_24 = Pty_24;
		this->Pty_25 = Pty_25;
		this->Pty_26 = Pty_26;
		this->Pty_27 = Pty_27;
		this->Pty_28 = Pty_28;
		this->Pty_29 = Pty_29;
		this->Pty_30 = Pty_30;
		this->Pty_31 = Pty_31;
		this->Pty_32 = Pty_32;
		this->Pty_33 = Pty_33;
		this->Pty_34 = Pty_34;
		this->Pty_35 = Pty_35;
		this->Pty_36 = Pty_36;
		this->Pty_37 = Pty_37;
		this->Pty_38 = Pty_38;
		this->Pty_39 = Pty_39;
		this->Pty_40 = Pty_40;
		this->Pty_41 = Pty_41;
		this->Pty_42 = Pty_42;
		this->Pty_43 = Pty_43;
		this->Pty_44 = Pty_44;
		this->Pty_45 = Pty_45;
		this->Pty_46 = Pty_46;
		this->Pty_47 = Pty_47;
		this->Pty_48 = Pty_48;
		this->Pty_49 = Pty_49;
		this->Pty_50 = Pty_50;
		this->Pty_51 = Pty_51;
		this->Pty_52 = Pty_52;
		this->Pty_53 = Pty_53;
		this->Pty_54 = Pty_54;
		this->Pty_55 = Pty_55;
		this->Pty_56 = Pty_56;
		this->Pty_57 = Pty_57;
		this->Pty_58 = Pty_58;
		this->Pty_59 = Pty_59;
		this->Pty_60 = Pty_60;
		this->Pty_61 = Pty_61;
		this->Pty_62 = Pty_62;
		this->Pty_63 = Pty_63;
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
		this->Amt_1 = Amt_1;
		this->Instrmt_1 = Instrmt_1;
  	}
};