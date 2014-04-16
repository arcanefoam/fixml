package text1.xml;

public class Hdr {

	private:
	String Snt;
	String PosDup;
	String PosRsnd;
	String SeqNum;
	
	Sndr* Sndr_obj;
	Tgt* Tgt_obj;
	
	public: 
	
	// default constructor
	public Hdr () {
	
		Snt = 
		2001-09-11T09:30:47-05:00 ;
		
		PosDup = 
		N ;
		
		PosRsnd = 
		N ;
		
		SeqNum = 
		521 ;
		
		
		Sndr_obj = new Sndr() ;
		Tgt_obj = new Tgt() ;
		
	}
	
	// by parameters
	
	public Hdr (
	
	StringSnt, StringPosDup, StringPosRsnd, StringSeqNum, 
	Sndr*Sndr_, Tgt*Tgt_
	) {
	
	
	}
} 