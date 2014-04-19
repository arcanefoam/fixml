#include <iostream> 

using namespace std;

class SubID {

	private:
  	string SenderFIXTag_;
  	string TargetFIXTag_;
  	string OnBehalfOfFIXTag_;
  	string DeliverToFIXTag_;
 	
 	public: 

  	// default constructor
	SubID () {
		SenderFIXTag_ = "50";
		TargetFIXTag_ = "57";
		OnBehalfOfFIXTag_ = "116";
		DeliverToFIXTag_ = "129";
  	
  	}
  
  	// by parameters
  	SubID (		string SenderFIXTag_p, string TargetFIXTag_p, string OnBehalfOfFIXTag_p, string DeliverToFIXTag_p){
	  
		SenderFIXTag_ = SenderFIXTag_p;
		TargetFIXTag_ = TargetFIXTag_p;
		OnBehalfOfFIXTag_ = OnBehalfOfFIXTag_p;
		DeliverToFIXTag_ = DeliverToFIXTag_p;
	  
  	}
};