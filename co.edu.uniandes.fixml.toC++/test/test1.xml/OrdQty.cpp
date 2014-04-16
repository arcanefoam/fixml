#include <iostream> 

using namespace std;

class OrdQty {

	private:
  	string Qty_;
 	
 	public: 

  	// default constructor
	OrdQty () {
		Qty_ = "1000";
  	
  	}
  
  	// by parameters
  	OrdQty (		string Qty_p){
	  
		Qty_ = Qty_p;
	  
  	}
};