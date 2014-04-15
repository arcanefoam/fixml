package text2.xml;

public class Hdr {

	private:
  	String Snt;
  	String PosDup;
  	String PosRsnd;
  	String SeqNum;

	Sndr* Sndr_1; 
	
	Tgt* Tgt_1; 
	
	OnBhlfOf* OnBhlfOf_1; 
	
	DlvrTo* DlvrTo_1; 
	

 	public: 

  	// default constructor
	public Hdr () {
		Snt = 2001-12-17T09:30:47-05:00 ;
	
		PosDup = N ;
	
		PosRsnd = N ;
	
		SeqNum = 1002 ;
	
    
		  Sndr_obj = new Sndr() ;
		  Tgt_obj = new Tgt() ;
		  OnBhlfOf_obj = new OnBhlfOf() ;
		  DlvrTo_obj = new DlvrTo() ;
  	}
  
  	// by parameters
  	public Hdr (
	  String Snt_, String PosDup_, String PosRsnd_, String SeqNum_, 
			Sndr* Sndr_1,
			Tgt* Tgt_1,
			OnBhlfOf* OnBhlfOf_1,
			DlvrTo* DlvrTo_1,
  	){
	  
	  Snt = Snt_;
		PosDup = PosDup_;
		PosRsnd = PosRsnd_;
		SeqNum = SeqNum_;
	  
		this.Sndr_1 = Sndr_1;
	
		this.Tgt_1 = Tgt_1;
	
		this.OnBhlfOf_1 = OnBhlfOf_1;
	
		this.DlvrTo_1 = DlvrTo_1;
	
  }
} 