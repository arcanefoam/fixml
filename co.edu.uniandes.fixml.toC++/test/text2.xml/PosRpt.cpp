#include <iostream> 
 #include "Hdr.cpp" 
 #include "Pty.cpp" 
 #include "Qty.cpp" 
 #include "Amt.cpp" 
 #include "Instrmt.cpp" 

using namespace std;

class PosRpt {

	private:
  	string RptID_;
  	string Rslt_;
  	string BizDt_;
  	string Acct_;
  	string AcctTyp_;
  	string SetPx_;
  	string SetPxTyp_;
  	string PriSetPx_;
  	string ReqTyp_;
  	string Ccy_;
	Hdr* Hdr_1;
	Pty* Pty_1;	Pty* Pty_2;	Pty* Pty_3;
	Qty* Qty_1;	Qty* Qty_2;	Qty* Qty_3;
	Amt* Amt_1;
	Instrmt* Instrmt_1;
 	
 	public: 

  	// default constructor
	PosRpt () {
		RptID_ = "541386431";
		Rslt_ = "0";
		BizDt_ = "2003-03-10T00:00:00";
		Acct_ = "1";
		AcctTyp_ = "1";
		SetPx_ = "0.00";
		SetPxTyp_ = "1";
		PriSetPx_ = "0.00";
		ReqTyp_ = "0";
		Ccy_ = "USD";


		Hdr_1= new Hdr("2001-12-17T09:30:47-05:00","N","N","1002"
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

		Qty_1= new Qty("SOD","35","0");

		Qty_2= new Qty("FIN","20","10");

		Qty_3= new Qty("IAS","10",NULL);

		Amt_1= new Amt("FMTM","0.00");

		Instrmt_1= new Instrmt("AOL","KW","3","OCASPS","20031122","2003-11-22T00:00:00","47.50","USD","100");  	
  	}
  
  	// by parameters
  	PosRpt (		string RptID_p, string Rslt_p, string BizDt_p, string Acct_p, string AcctTyp_p, string SetPx_p, string SetPxTyp_p, string PriSetPx_p, string ReqTyp_p, string Ccy_p, Hdr* Hdr_1, Pty* Pty_1, Pty* Pty_2, Pty* Pty_3, Qty* Qty_1, Qty* Qty_2, Qty* Qty_3, Amt* Amt_1, Instrmt* Instrmt_1){
	  
		RptID_ = RptID_p;
		Rslt_ = Rslt_p;
		BizDt_ = BizDt_p;
		Acct_ = Acct_p;
		AcctTyp_ = AcctTyp_p;
		SetPx_ = SetPx_p;
		SetPxTyp_ = SetPxTyp_p;
		PriSetPx_ = PriSetPx_p;
		ReqTyp_ = ReqTyp_p;
		Ccy_ = Ccy_p;
	  
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