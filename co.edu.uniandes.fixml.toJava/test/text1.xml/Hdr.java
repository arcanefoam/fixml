package text1.xml;

import java.util.List;
import java.util.ArrayList;

// Class for tag Hdr
public class Hdr {

	String Snt;
	String PosDup;
	String PosRsnd;
	String SeqNum;
	
	List<Sndr> Sndrs = new ArrayList<Sndr>();
	List<Tgt> Tgts = new ArrayList<Tgt>();
	
	// default constructor
	public Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum ) {
		this.Snt = Snt;
		this.PosDup = PosDup;
		this.PosRsnd = PosRsnd;
		this.SeqNum = SeqNum;
		
	}
	
	
	public Hdr ( ) {   
	
		this.Snt = "2001-09-11T09:30:47-05:00";
		this.PosDup = "N";
		this.PosRsnd = "N";
		this.SeqNum = "521";
		
		Sndr Hdr1_Sndr1= new Sndr("AFUNDMGR");
		this.addSndr( Hdr1_Sndr1 );
		
		Tgt Hdr1_Tgt1= new Tgt("ABROKER");
		this.addTgt( Hdr1_Tgt1 );
		
	}
	
	public void addSndr( Sndr child ) {
		this.Sndrs.add( child );
	}
	public void addTgt( Tgt child ) {
		this.Tgts.add( child );
	}
	
} 