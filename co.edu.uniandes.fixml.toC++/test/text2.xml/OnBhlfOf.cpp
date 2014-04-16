#include <iostream> 

using namespace std;

class OnBhlfOf {

	private:
  	string ID_;
  	string Sub_;
  	string Loc_;
 	
 	public: 

  	// default constructor
	OnBhlfOf () {
		ID_ = "String";
		Sub_ = "String";
		Loc_ = "String";
  	
  	}
  
  	// by parameters
  	OnBhlfOf (		string ID_p, string Sub_p, string Loc_p){
	  
		ID_ = ID_p;
		Sub_ = Sub_p;
		Loc_ = Loc_p;
	  
  	}
};