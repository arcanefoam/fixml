#include <iostream> 
 #include "Order.cpp" 

using namespace std;

class FIXML {

	private:
	Order* Order_1;
 	
 	public: 

  	// default constructor
	FIXML () {
		Order_1 = new Order();
  	
  	}
  
  	// by parameters
  	FIXML (		, Order* Order_1){
	  
		;
	  
		this->Order_1 = Order_1;
  	}
};