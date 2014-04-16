#include <iostream> 
 #include "Sub.cpp" 

using namespace std;

class Pty {

	private:
  	string ID_;
  	string R_;
	Sub* Sub_1;
 	
 	public: 

  	// default constructor
	Pty () {
		ID_ = "OCC";
		R_ = "21";
		Sub_1 = new Sub();
  	
  	}
  
  	// by parameters
  	Pty (		string ID_p, string R_p, Sub* Sub_1){
	  
		ID_ = ID_p;
		R_ = R_p;
	  
		this->Sub_1 = Sub_1;
  	}
};