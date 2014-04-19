#include <iostream> 
 #include "Hdr.cpp" 
 #include "Instrmt.cpp" 
 #include "OrdQty.cpp" 

using namespace std;

class Order {

	private:
  	string ClOrdID_;
  	string Side_;
  	string TransactTm_;
  	string OrdTyp_;
  	string Px_;
  	string Acct_;
	Hdr* Hdr_1;
	Instrmt* Instrmt_1;
	OrdQty* OrdQty_1;
 	
 	public: 

  	// default constructor
	Order () {
		ClOrdID_ = "123456";
		Side_ = "2";
		TransactTm_ = "2001-09-11T09:30:47-05:00";
		OrdTyp_ = "2";
		Px_ = "93.25";
		Acct_ = "26522154";
		Hdr_1 = new Hdr();
		Instrmt_1 = new Instrmt();
		OrdQty_1 = new OrdQty();
  	
  	}
  
  	// by parameters
  	Order (		string ClOrdID_p, string Side_p, string TransactTm_p, string OrdTyp_p, string Px_p, string Acct_p, Hdr* Hdr_1, Instrmt* Instrmt_1, OrdQty* OrdQty_1){
	  
		ClOrdID_ = ClOrdID_p;
		Side_ = Side_p;
		TransactTm_ = TransactTm_p;
		OrdTyp_ = OrdTyp_p;
		Px_ = Px_p;
		Acct_ = Acct_p;
	  
		this->Hdr_1 = Hdr_1;
		this->Instrmt_1 = Instrmt_1;
		this->OrdQty_1 = OrdQty_1;
  	}
};