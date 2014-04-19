#include <iostream> 
 #include "Symbol.cpp" 
 #include "SecurityType.cpp" 

using namespace std;

class Instrument {

	private:
	Symbol* Symbol_1;
	SecurityType* SecurityType_1;
 	
 	public: 

  	// default constructor
	Instrument () {
		Symbol_1 = new Symbol();
		SecurityType_1 = new SecurityType();
  	
  	}
  
  	// by parameters
  	Instrument (		, Symbol* Symbol_1, SecurityType* SecurityType_1){
	  
		;
	  
		this->Symbol_1 = Symbol_1;
		this->SecurityType_1 = SecurityType_1;
  	}
};