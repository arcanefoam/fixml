#include <iostream> 

using namespace std;

class Sndr {

	private:
  	string ID_;
  	string Loc_;
  	string Sub_;
 	
 	public: 

  	// default constructor
	Sndr () {
		ID_ = "String";
		Loc_ = "String";
		Sub_ = "String";
  	
  	}
  
  	// by parameters
  	Sndr (		string ID_p, string Loc_p, string Sub_p){
	  
		ID_ = ID_p;
		Loc_ = Loc_p;
		Sub_ = Sub_p;
	  
  	}
};