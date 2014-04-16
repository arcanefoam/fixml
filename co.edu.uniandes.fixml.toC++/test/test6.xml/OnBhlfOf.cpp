#include <iostream> 

using namespace std;

class OnBhlfOf {

	private:
  	string ID_;
  	string Loc_;
  	string Sub_;
 	
 	public: 

  	// default constructor
	OnBhlfOf () {
		ID_ = "String";
		Loc_ = "String";
		Sub_ = "String";
  	
  	}
  
  	// by parameters
  	OnBhlfOf (		string ID_p, string Loc_p, string Sub_p){
	  
		ID_ = ID_p;
		Loc_ = Loc_p;
		Sub_ = Sub_p;
	  
  	}
};