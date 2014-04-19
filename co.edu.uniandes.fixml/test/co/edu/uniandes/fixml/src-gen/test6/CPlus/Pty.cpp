#include <iostream> 
 #include "Sub.cpp" 

using namespace std;

class Pty {

	private:
  	string R_;
	Sub* Sub_1;
 	
 	public: 

  	// default constructor
	Pty () {
		R_ = "21";
		Sub_1 = new Sub();
  	
  	}
  
  	// by parameters
  	Pty (		string R_p, Sub* Sub_1){
	  
		R_ = R_p;
	  
		this->Sub_1 = Sub_1;
  	}
};