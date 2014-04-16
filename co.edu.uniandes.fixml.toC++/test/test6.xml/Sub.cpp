#include <iostream> 

using namespace std;

class Sub {

	private:
  	string ID_;
  	string Typ_;
 	
 	public: 

  	// default constructor
	Sub () {
		ID_ = "ZZZ";
		Typ_ = "2";
  	
  	}
  
  	// by parameters
  	Sub (		string ID_p, string Typ_p){
	  
		ID_ = ID_p;
		Typ_ = Typ_p;
	  
  	}
};