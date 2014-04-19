#include <iostream> 
 #include "LimitOrder.cpp" 

using namespace std;

class OrderType {

	private:
	LimitOrder* LimitOrder_1;
 	
 	public: 

  	// default constructor
	OrderType () {
		LimitOrder_1 = new LimitOrder();
  	
  	}
  
  	// by parameters
  	OrderType (		, LimitOrder* LimitOrder_1){
	  
		;
	  
		this->LimitOrder_1 = LimitOrder_1;
  	}
};