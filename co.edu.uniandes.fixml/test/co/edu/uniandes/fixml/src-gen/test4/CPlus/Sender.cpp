#include <iostream> 
 #include "CompID.cpp" 
 #include "SubID.cpp" 

using namespace std;

class Sender {

	private:
	CompID* CompID_1;	CompID* CompID_2;
	SubID* SubID_1;	SubID* SubID_2;
 	
 	public: 

  	// default constructor
	Sender () {
		CompID_1 = new CompID();
		CompID_2 = new CompID();
		SubID_1 = new SubID();
		SubID_2 = new SubID();
  	
  	}
  
  	// by parameters
  	Sender (		, CompID* CompID_1, CompID* CompID_2, SubID* SubID_1, SubID* SubID_2){
	  
		;
	  
		this->CompID_1 = CompID_1;
		this->CompID_2 = CompID_2;
		this->SubID_1 = SubID_1;
		this->SubID_2 = SubID_2;
  	}
};