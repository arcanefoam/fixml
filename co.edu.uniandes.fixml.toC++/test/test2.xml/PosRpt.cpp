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
	Qty* Qty_1;	Qty* Qty_2;	Qty* Qty_3;
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

		Amt_1= new Amt("0.00","FMTM");

		Instrmt_1= new Instrmt("OCASPS","KW","J","20031122","2003-11-22T00:00:00","100","47.50","USD","AOL");  	
  	}
  
  	// by parameters
  	PosRpt (		string Acct_p, string AcctTyp_p, string BizDt_p, string Ccy_p, string PriSetPx_p, string ReqTyp_p, string RptID_p, string Rslt_p, string SetPx_p, string SetPxTyp_p, Hdr* Hdr_1, Pty* Pty_1, Pty* Pty_2, Pty* Pty_3, Qty* Qty_1, Qty* Qty_2, Qty* Qty_3, Amt* Amt_1, Instrmt* Instrmt_1){
	  
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
		this->Amt_1 = Amt_1;
		this->Instrmt_1 = Instrmt_1;
  	}
};