#include <iostream> 
 #include "Price.cpp" 

using namespace std;

class LimitOrder {

	private:
  	string Value_;
	Price* Price_1;
 	
 	public: 

  	// default constructor
	LimitOrder () {
		Value_ = "2";
		Price_1 = new Price();
  	
  	}
  
  	// by parameters
  	LimitOrder (		string Value_p, Price* Price_1){
	  
		Value_ = Value_p;
	  
		this->Price_1 = Price_1;
  	}
};