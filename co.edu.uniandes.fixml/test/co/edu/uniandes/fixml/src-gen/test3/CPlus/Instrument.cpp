#include <iostream> 
 #include "Symbol.cpp" 
 #include "IDSource.cpp" 
 #include "SecurityID.cpp" 

using namespace std;

class Instrument {

	private:
	Symbol* Symbol_1;
	IDSource* IDSource_1;
	SecurityID* SecurityID_1;
 	
 	public: 

  	// default constructor
	Instrument () {
		Symbol_1 = new Symbol();
		IDSource_1 = new IDSource();
		SecurityID_1 = new SecurityID();
  	
  	}
  
  	// by parameters
  	Instrument (		, Symbol* Symbol_1, IDSource* IDSource_1, SecurityID* SecurityID_1){
	  
		;
	  
		this->Symbol_1 = Symbol_1;
		this->IDSource_1 = IDSource_1;
		this->SecurityID_1 = SecurityID_1;
  	}
};