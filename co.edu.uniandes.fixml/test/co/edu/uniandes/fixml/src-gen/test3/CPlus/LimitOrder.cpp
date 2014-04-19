#include <iostream> 
 #include "Price.cpp" 

using namespace std;

class LimitOrder {

	private:
	Price* Price_1;
 	
 	public: 

  	// default constructor
	LimitOrder () {
		Price_1 = new Price();
  	
  	}
  
  	// by parameters
  	LimitOrder (		, Price* Price_1){
	  
		;
	  
		this->Price_1 = Price_1;
  	}
};