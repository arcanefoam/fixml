#include <iostream> 

using namespace std;

class Instrmt {

	private:
  	string ID_;
  	string IDSrc_;
  	string Sym_;
 	
 	public: 

  	// default constructor
	Instrmt () {
		ID_ = "459200101";
		IDSrc_ = "1";
		Sym_ = "IBM";
  	
  	}
  
  	// by parameters
  	Instrmt (		string ID_p, string IDSrc_p, string Sym_p){
	  
		ID_ = ID_p;
		IDSrc_ = IDSrc_p;
		Sym_ = Sym_p;
	  
  	}
};