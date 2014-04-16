#include <iostream> 
 #include "FIXMLMessage.cpp" 

using namespace std;

class FIXML {

	private:
	FIXMLMessage* FIXMLMessage_1;
 	
 	public: 

  	// default constructor
	FIXML () {
		FIXMLMessage_1 = new FIXMLMessage();
  	
  	}
  
  	// by parameters
  	FIXML (		, FIXMLMessage* FIXMLMessage_1){
	  
		;
	  
		this->FIXMLMessage_1 = FIXMLMessage_1;
  	}
};