#include <iostream> 
 #include "Sndr.cpp" 
 #include "Tgt.cpp" 

using namespace std;

class Hdr {

	private:
  	string PosDup_;
  	string PosRsnd_;
  	string SeqNum_;
  	string Snt_;
	Sndr* Sndr_1;
	Tgt* Tgt_1;
 	
 	public: 

  	// default constructor
	Hdr () {
		PosDup_ = "N";
		PosRsnd_ = "N";
		SeqNum_ = "521";
		Snt_ = "2001-09-11T09:30:47-05:00";
		Sndr_1 = new Sndr();
		Tgt_1 = new Tgt();
  	
  	}
  
  	// by parameters
  	Hdr (		string PosDup_p, string PosRsnd_p, string SeqNum_p, string Snt_p, Sndr* Sndr_1, Tgt* Tgt_1){
	  
		PosDup_ = PosDup_p;
		PosRsnd_ = PosRsnd_p;
		SeqNum_ = SeqNum_p;
		Snt_ = Snt_p;
	  
		this->Sndr_1 = Sndr_1;
		this->Tgt_1 = Tgt_1;
  	}
};