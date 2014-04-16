#include <iostream> 

using namespace std;

class HandInst {

	private:
  	string Value_;
 	
 	public: 

  	// default constructor
	HandInst () {
		Value_ = "2";
  	
  	}
  
  	// by parameters
  	HandInst (		string Value_p){
	  
		Value_ = Value_p;
	  
  	}
};