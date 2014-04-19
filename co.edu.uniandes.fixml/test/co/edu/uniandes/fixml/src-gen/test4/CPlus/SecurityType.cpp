#include <iostream> 
 #include "Equity.cpp" 

using namespace std;

class SecurityType {

	private:
	Equity* Equity_1;
 	
 	public: 

  	// default constructor
	SecurityType () {
		Equity_1 = new Equity();
  	
  	}
  
  	// by parameters
  	SecurityType (		, Equity* Equity_1){
	  
		;
	  
		this->Equity_1 = Equity_1;
  	}
};