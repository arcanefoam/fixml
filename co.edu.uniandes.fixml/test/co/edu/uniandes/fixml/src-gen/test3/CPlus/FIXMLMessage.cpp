#include <iostream> 
 #include "ApplicationMessage.cpp" 

using namespace std;

class FIXMLMessage {

	private:
	ApplicationMessage* ApplicationMessage_1;
 	
 	public: 

  	// default constructor
	FIXMLMessage () {
		ApplicationMessage_1 = new ApplicationMessage();
  	
  	}
  
  	// by parameters
  	FIXMLMessage (		, ApplicationMessage* ApplicationMessage_1){
	  
		;
	  
		this->ApplicationMessage_1 = ApplicationMessage_1;
  	}
};