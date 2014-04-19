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
		BizDt_ = "2003-09-10T00:00:00";
		Acct_ = "1";
		AcctTyp_ = "1";
		SetPx_ = "0.00";
		SetPxTyp_ = "1";
		PriSetPx_ = "0.00";
		ReqTyp_ = "0";
		Ccy_ = "USD";
		Hdr_1 = new Hdr();
		Pty_1 = new Pty();
		Pty_2 = new Pty();
		Pty_3 = new Pty();
		Qty_1 = new Qty();
		Qty_2 = new Qty();
		Qty_3 = new Qty();
		Amt_1 = new Amt();
		Instrmt_1 = new Instrmt();
  	
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