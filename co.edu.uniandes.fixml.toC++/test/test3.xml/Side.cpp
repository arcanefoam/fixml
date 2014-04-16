#include <iostream> 

using namespace std;

class Side {

	private:
  	string Value_;
 	
 	public: 

  	// default constructor
	Side () {
		Value_ = "1";
  	
  	}
  
  	// by parameters
  	Side (		string Value_p){
	  
		Value_ = Value_p;
	  
  	}
};