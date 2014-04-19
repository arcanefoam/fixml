#include <iostream> 

using namespace std;

class Amt {

	private:
  	string Typ_;
  	string Amt_;
 	
 	public: 

  	// default constructor
	Amt () {
		Typ_ = "FMTM";
		Amt_ = "0.00";
  	
  	}
  
  	// by parameters
  	Amt (		string Typ_p, string Amt_p){
	  
		Typ_ = Typ_p;
		Amt_ = Amt_p;
	  
  	}
};