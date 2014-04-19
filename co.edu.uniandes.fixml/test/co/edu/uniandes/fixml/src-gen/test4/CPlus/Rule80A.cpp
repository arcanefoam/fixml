#include <iostream> 

using namespace std;

class Rule80A {

	private:
  	string Value_;
  	string FIXTag_;
  	string DataType_;
 	
 	public: 

  	// default constructor
	Rule80A () {
		Value_ = "A";
		FIXTag_ = "47";
		DataType_ = "char";
  	
  	}
  
  	// by parameters
  	Rule80A (		string Value_p, string FIXTag_p, string DataType_p){
	  
		Value_ = Value_p;
		FIXTag_ = FIXTag_p;
		DataType_ = DataType_p;
	  
  	}
};