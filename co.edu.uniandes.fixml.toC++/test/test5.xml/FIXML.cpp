#include <iostream> 
 #include "PosRpt.cpp" 

using namespace std;

class FIXML {

	private:
	PosRpt* PosRpt_1;
 	
 	public: 

  	// default constructor
	FIXML () {
		PosRpt_1 = new PosRpt();
  	
  	}
  
  	// by parameters
  	FIXML (		, PosRpt* PosRpt_1){
	  
		;
	  
		this->PosRpt_1 = PosRpt_1;
  	}
};