#include <iostream> 

using namespace std;

class Amt {

	private:
  	string Amt_;
  	string Typ_;
 	
 	public: 

  	// default constructor
	Amt () {
		Amt_ = "0.00";
		Typ_ = "FMTM";
  	
  	}
  
  	// by parameters
  	Amt (		string Amt_p, string Typ_p){
	  
		Amt_ = Amt_p;
		Typ_ = Typ_p;
	  
  	}
};