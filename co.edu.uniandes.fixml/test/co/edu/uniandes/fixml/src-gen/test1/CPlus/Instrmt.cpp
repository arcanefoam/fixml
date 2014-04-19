#include <iostream> 

using namespace std;

class Instrmt {

	private:
  	string Sym_;
  	string ID_;
  	string IDSrc_;
 	
 	public: 

  	// default constructor
	Instrmt () {
		Sym_ = "IBM";
		ID_ = "459200101";
		IDSrc_ = "1";
  	
  	}
  
  	// by parameters
  	Instrmt (		string Sym_p, string ID_p, string IDSrc_p){
	  
		Sym_ = Sym_p;
		ID_ = ID_p;
		IDSrc_ = IDSrc_p;
	  
  	}
};