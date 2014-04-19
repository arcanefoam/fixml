#include <iostream> 
 #include "Sndr.cpp" 
 #include "Tgt.cpp" 

using namespace std;

class Hdr {

	private:
  	string Snt_;
  	string PosDup_;
  	string PosRsnd_;
  	string SeqNum_;
	Sndr* Sndr_1;
	Tgt* Tgt_1;
 	
 	public: 

  	// default constructor
	Hdr () {
		Snt_ = "2001-09-11T09:30:47-05:00";
		PosDup_ = "N";
		PosRsnd_ = "N";
		SeqNum_ = "521";


		Sndr_1= new Sndr();

		Tgt_1= new Tgt();  	
  	}
  
  	// by parameters
  	Hdr (		string Snt_p, string PosDup_p, string PosRsnd_p, string SeqNum_p, Sndr* Sndr_1, Tgt* Tgt_1){
	  
		Snt_ = Snt_p;
		PosDup_ = PosDup_p;
		PosRsnd_ = PosRsnd_p;
		SeqNum_ = SeqNum_p;
	  
		this->Sndr_1 = Sndr_1;
		this->Tgt_1 = Tgt_1;
  	}
};