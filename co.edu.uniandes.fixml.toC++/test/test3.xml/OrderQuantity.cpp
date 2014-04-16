#include <iostream> 
 #include "OrderQty.cpp" 

using namespace std;

class OrderQuantity {

	private:
	OrderQty* OrderQty_1;
 	
 	public: 

  	// default constructor
	OrderQuantity () {
		OrderQty_1 = new OrderQty();
  	
  	}
  
  	// by parameters
  	OrderQuantity (		, OrderQty* OrderQty_1){
	  
		;
	  
		this->OrderQty_1 = OrderQty_1;
  	}
};