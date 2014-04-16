#include <iostream> 
 #include "Hdr.cpp" 
 #include "Instrmt.cpp" 
 #include "OrdQty.cpp" 

using namespace std;

class Order {

	private:
  	string Acct_;
  	string ClOrdID_;
  	string OrdTyp_;
  	string Px_;
  	string Side_;
  	string TransactTm_;
	Hdr* Hdr_1;
	Instrmt* Instrmt_1;
	OrdQty* OrdQty_1;
 	
 	public: 

  	// default constructor
	Order () {
		Acct_ = "26522154";
		ClOrdID_ = "123456";
		OrdTyp_ = "2";
		Px_ = "93.25";
		Side_ = "2";
		TransactTm_ = "2001-09-11T09:30:47-05:00";


		Hdr_1= new Hdr("N","N","521","2001-09-11T09:30:47-05:00"
				, new Sndr()
				, new Tgt());

		Instrmt_1= new Instrmt("459200101","1","IBM");

		OrdQty_1= new OrdQty("1000");  	
  	}
  
  	// by parameters
  	Order (		string Acct_p, string ClOrdID_p, string OrdTyp_p, string Px_p, string Side_p, string TransactTm_p, Hdr* Hdr_1, Instrmt* Instrmt_1, OrdQty* OrdQty_1){
	  
		Acct_ = Acct_p;
		ClOrdID_ = ClOrdID_p;
		OrdTyp_ = OrdTyp_p;
		Px_ = Px_p;
		Side_ = Side_p;
		TransactTm_ = TransactTm_p;
	  
		this->Hdr_1 = Hdr_1;
		this->Instrmt_1 = Instrmt_1;
		this->OrdQty_1 = OrdQty_1;
  	}
};