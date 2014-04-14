package text1.xml;

// Class for tag Hdr
public class Hdr {

	String Snt;
	String PosDup;
	String PosRsnd;
	String SeqNum;
	
	List<Sndr> Sndrs;
	List<Tgt> Tgts;
	
	// default constructor
	public Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum, ) {
	
		this.Snt = Snt;
		this.PosDup = PosDup;
		this.PosRsnd = PosRsnd;
		this.SeqNum = SeqNum;
		
	}
	
	public addSndr( Sndr child ) {
		this.Sndrs.add( child );
	}
	
	public addTgt( Tgt child ) {
		this.Tgts.add( child );
	}
	
	
} 