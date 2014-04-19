#include <iostream> 
 #include "TimeInForce.cpp" 

using namespace std;

class OrderDuration {

	private:
	TimeInForce* TimeInForce_1;
 	
 	public: 

  	// default constructor
	OrderDuration () {
		TimeInForce_1 = new TimeInForce();
  	
  	}
  
  	// by parameters
  	OrderDuration (		, TimeInForce* TimeInForce_1){
	  
		;
	  
		this->TimeInForce_1 = TimeInForce_1;
  	}
};