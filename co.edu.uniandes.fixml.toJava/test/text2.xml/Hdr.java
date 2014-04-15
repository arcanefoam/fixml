package text2.xml;



// Class for tag Hdr
public class Hdr {

	String Snt;
	String PosDup;
	String PosRsnd;
	String SeqNum;
	
	List<Sndr> Sndrs = new ArrayList<Sndr>();
	List<Tgt> Tgts = new ArrayList<Tgt>();
	List<OnBhlfOf> OnBhlfOfs = new ArrayList<OnBhlfOf>();
	List<DlvrTo> DlvrTos = new ArrayList<DlvrTo>();
	
	// default constructor
	public Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum ) {
	
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
	
	public addOnBhlfOf( OnBhlfOf child ) {
		this.OnBhlfOfs.add( child );
	}
	
	public addDlvrTo( DlvrTo child ) {
		this.DlvrTos.add( child );
	}
	
	
	
} 