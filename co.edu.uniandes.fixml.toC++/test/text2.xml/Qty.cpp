#include <iostream> 

using namespace std;

class Qty {

	private:
  	string Typ_;
  	string Long_;
  	string Short_;
 	
 	public: 

  	// default constructor
	Qty () {
		Typ_ = "SOD";
		Long_ = "35";
		Short_ = "0";
  	
  	}
  
  	// by parameters
  	Qty (		string Typ_p, string Long_p, string Short_p){
	  
		Typ_ = Typ_p;
		Long_ = Long_p;
		Short_ = Short_p;
	  
  	}
};