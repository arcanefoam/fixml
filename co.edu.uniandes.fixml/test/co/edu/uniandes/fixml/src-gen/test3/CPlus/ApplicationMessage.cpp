#include <iostream> 
 #include "Order.cpp" 

using namespace std;

class ApplicationMessage {

	private:
	Order* Order_1;
 	
 	public: 

  	// default constructor
	ApplicationMessage () {


		Order_1= new Order(
				, new ClOrdID()
				, new HandInst()
				, new MinQty()
				, new SecurityID())
				, new Side()
				, new TransactTime()
				, new OrderQty())
				, new Price()))
				, new Currency()
				, new Rule80A("A"));  	
  	}
  
  	// by parameters
  	ApplicationMessage (		, Order* Order_1){
	  
		;
	  
		this->Order_1 = Order_1;
  	}
};