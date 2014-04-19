#include <iostream> 

using namespace std;

class DlvrTo {

	private:
  	string Sub_;
  	string Loc_;
 	
 	public: 

  	// default constructor
	DlvrTo () {
		Sub_ = "String";
		Loc_ = "String";
  	
  	}
  
  	// by parameters
  	DlvrTo (		string Sub_p, string Loc_p){
	  
		Sub_ = Sub_p;
		Loc_ = Loc_p;
	  
  	}
};