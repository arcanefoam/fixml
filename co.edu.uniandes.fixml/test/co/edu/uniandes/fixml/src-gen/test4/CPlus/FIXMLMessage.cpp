#include <iostream> 
 #include "Header.cpp" 
 #include "ApplicationMessage.cpp" 

using namespace std;

class FIXMLMessage {

	private:
	Header* Header_1;
	ApplicationMessage* ApplicationMessage_1;
 	
 	public: 

  	// default constructor
	FIXMLMessage () {
		Header_1 = new Header();
		ApplicationMessage_1 = new ApplicationMessage();
  	
  	}
  
  	// by parameters
  	FIXMLMessage (		, Header* Header_1, ApplicationMessage* ApplicationMessage_1){
	  
		;
	  
		this->Header_1 = Header_1;
		this->ApplicationMessage_1 = ApplicationMessage_1;
  	}
};