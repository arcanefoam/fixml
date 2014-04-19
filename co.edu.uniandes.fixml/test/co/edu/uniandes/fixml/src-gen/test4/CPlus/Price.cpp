#include <iostream> 

using namespace std;

class Price {

	private:
  	string Min_;
  	string Max_;
 	
 	public: 

  	// default constructor
	Price () {
		Min_ = "0";
		Max_ = "99999999.9999";
  	
  	}
  
  	// by parameters
  	Price (		string Min_p, string Max_p){
	  
		Min_ = Min_p;
		Max_ = Max_p;
	  
  	}
};