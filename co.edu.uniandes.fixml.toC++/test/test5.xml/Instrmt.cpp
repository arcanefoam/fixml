#include <iostream> 

using namespace std;

class Instrmt {

	private:
  	string CFI_;
  	string ID_;
  	string IDSrc_;
  	string MMY_;
  	string Mat_;
  	string Mult_;
  	string Strk_;
  	string StrkCcy_;
  	string Sym_;
 	
 	public: 

  	// default constructor
	Instrmt () {
		CFI_ = "OCASPS";
		ID_ = "KW";
		IDSrc_ = "J";
		MMY_ = "20031122";
		Mat_ = "2003-11-22T00:00:00";
		Mult_ = "100";
		Strk_ = "47.50";
		StrkCcy_ = "USD";
		Sym_ = "AOL";
  	
  	}
  
  	// by parameters
  	Instrmt (		string CFI_p, string ID_p, string IDSrc_p, string MMY_p, string Mat_p, string Mult_p, string Strk_p, string StrkCcy_p, string Sym_p){
	  
		CFI_ = CFI_p;
		ID_ = ID_p;
		IDSrc_ = IDSrc_p;
		MMY_ = MMY_p;
		Mat_ = Mat_p;
		Mult_ = Mult_p;
		Strk_ = Strk_p;
		StrkCcy_ = StrkCcy_p;
		Sym_ = Sym_p;
	  
  	}
};