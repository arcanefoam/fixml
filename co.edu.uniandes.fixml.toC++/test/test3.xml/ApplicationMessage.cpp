#include <iostream> 
 #include "Order.cpp" 

using namespace std;

class ApplicationMessage {

	private:
	Order* Order_1;
 	
 	public: 

  	// default constructor
	ApplicationMessage () {
		Order_1 = new Order();
  	
  	}
  
  	// by parameters
  	ApplicationMessage (		, Order* Order_1){
	  
		;
	  
		this->Order_1 = Order_1;
  	}
};