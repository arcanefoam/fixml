#include <iostream> 

using namespace std;

class Instrmt {

	private:
  	string Sym_;
  	string ID_;
  	string IDSrc_;
  	string CFI_;
  	string MMY_;
  	string Mat_;
  	string Strk_;
  	string StrkCcy_;
  	string Mult_;
 	
 	public: 

  	// default constructor
	Instrmt () {
		Sym_ = "AOL";
		ID_ = "KW";
		IDSrc_ = "3";
		CFI_ = "OCASPS";
		MMY_ = "20031122";
		Mat_ = "2003-11-22T00:00:00";
		Strk_ = "47.50";
		StrkCcy_ = "USD";
		Mult_ = "100";
  	
  	}
  
  	// by parameters
  	Instrmt (		string Sym_p, string ID_p, string IDSrc_p, string CFI_p, string MMY_p, string Mat_p, string Strk_p, string StrkCcy_p, string Mult_p){
	  
		Sym_ = Sym_p;
		ID_ = ID_p;
		IDSrc_ = IDSrc_p;
		CFI_ = CFI_p;
		MMY_ = MMY_p;
		Mat_ = Mat_p;
		Strk_ = Strk_p;
		StrkCcy_ = StrkCcy_p;
		Mult_ = Mult_p;
	  
  	}
};