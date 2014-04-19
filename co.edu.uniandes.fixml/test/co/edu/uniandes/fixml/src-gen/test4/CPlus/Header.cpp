#include <iostream> 
 #include "Sender.cpp" 
 #include "Target.cpp" 
 #include "SendingTime.cpp" 

using namespace std;

class Header {

	private:
	Sender* Sender_1;
	Target* Target_1;
	SendingTime* SendingTime_1;
 	
 	public: 

  	// default constructor
	Header () {


		Sender_1= new Sender(
				, new CompID())
				, new SubID("50","57","116","129")"50","57","116","129"));

		Target_1= new Target(
				, new CompID())
				, new SubID("50","57","116","129")"50","57","116","129"));

		SendingTime_1= new SendingTime();  	
  	}
  
  	// by parameters
  	Header (		, Sender* Sender_1, Target* Target_1, SendingTime* SendingTime_1){
	  
		;
	  
		this->Sender_1 = Sender_1;
		this->Target_1 = Target_1;
		this->SendingTime_1 = SendingTime_1;
  	}
};