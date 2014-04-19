#include <iostream> 
 #include "Sub.cpp" 

using namespace std;

class Pty {

	private:
  	string R_;
	Sub* Sub_1;	Sub* Sub_2;	Sub* Sub_3;	Sub* Sub_4;	Sub* Sub_5;	Sub* Sub_6;	Sub* Sub_7;	Sub* Sub_8;	Sub* Sub_9;	Sub* Sub_10;	Sub* Sub_11;	Sub* Sub_12;	Sub* Sub_13;	Sub* Sub_14;	Sub* Sub_15;	Sub* Sub_16;	Sub* Sub_17;	Sub* Sub_18;	Sub* Sub_19;	Sub* Sub_20;	Sub* Sub_21;
 	
 	public: 

  	// default constructor
	Pty () {
		R_ = "21";
		Sub_1 = new Sub();
		Sub_2 = new Sub();
		Sub_3 = new Sub();
		Sub_4 = new Sub();
		Sub_5 = new Sub();
		Sub_6 = new Sub();
		Sub_7 = new Sub();
		Sub_8 = new Sub();
		Sub_9 = new Sub();
		Sub_10 = new Sub();
		Sub_11 = new Sub();
		Sub_12 = new Sub();
		Sub_13 = new Sub();
		Sub_14 = new Sub();
		Sub_15 = new Sub();
		Sub_16 = new Sub();
		Sub_17 = new Sub();
		Sub_18 = new Sub();
		Sub_19 = new Sub();
		Sub_20 = new Sub();
		Sub_21 = new Sub();
  	
  	}
  
  	// by parameters
  	Pty (		string R_p, Sub* Sub_1, Sub* Sub_2, Sub* Sub_3, Sub* Sub_4, Sub* Sub_5, Sub* Sub_6, Sub* Sub_7, Sub* Sub_8, Sub* Sub_9, Sub* Sub_10, Sub* Sub_11, Sub* Sub_12, Sub* Sub_13, Sub* Sub_14, Sub* Sub_15, Sub* Sub_16, Sub* Sub_17, Sub* Sub_18, Sub* Sub_19, Sub* Sub_20, Sub* Sub_21){
	  
		R_ = R_p;
	  
		this->Sub_1 = Sub_1;
		this->Sub_2 = Sub_2;
		this->Sub_3 = Sub_3;
		this->Sub_4 = Sub_4;
		this->Sub_5 = Sub_5;
		this->Sub_6 = Sub_6;
		this->Sub_7 = Sub_7;
		this->Sub_8 = Sub_8;
		this->Sub_9 = Sub_9;
		this->Sub_10 = Sub_10;
		this->Sub_11 = Sub_11;
		this->Sub_12 = Sub_12;
		this->Sub_13 = Sub_13;
		this->Sub_14 = Sub_14;
		this->Sub_15 = Sub_15;
		this->Sub_16 = Sub_16;
		this->Sub_17 = Sub_17;
		this->Sub_18 = Sub_18;
		this->Sub_19 = Sub_19;
		this->Sub_20 = Sub_20;
		this->Sub_21 = Sub_21;
  	}
};