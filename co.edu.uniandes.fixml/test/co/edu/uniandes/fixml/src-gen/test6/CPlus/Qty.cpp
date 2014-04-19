#include <iostream> 

using namespace std;

class Qty {

	private:
  	string Long_;
  	string Short_;
 	
 	public: 

  	// default constructor
	Qty () {
		Long_ = "35";
		Short_ = "0";
  	
  	}
  
  	// by parameters
  	Qty (		string Long_p, string Short_p){
	  
		Long_ = Long_p;
		Short_ = Short_p;
	  
  	}
};