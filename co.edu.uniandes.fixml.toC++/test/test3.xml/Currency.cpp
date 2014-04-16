#include <iostream> 

using namespace std;

class Currency {

	private:
  	string Value_;
 	
 	public: 

  	// default constructor
	Currency () {
		Value_ = "USD";
  	
  	}
  
  	// by parameters
  	Currency (		string Value_p){
	  
		Value_ = Value_p;
	  
  	}
};