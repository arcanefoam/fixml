#include <iostream> 

using namespace std;

class Rule80A {

	private:
  	string Value_;
 	
 	public: 

  	// default constructor
	Rule80A () {
		Value_ = "A";
  	
  	}
  
  	// by parameters
  	Rule80A (		string Value_p){
	  
		Value_ = Value_p;
	  
  	}
};