package text2.xml;

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
	List<OnBhlfOf> OnBhlfOfs = new ArrayList<OnBhlfOf>();
	List<DlvrTo> DlvrTos = new ArrayList<DlvrTo>();
	
	// default constructor
	public Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum ) {
		this.Snt = Snt;
		this.PosDup = PosDup;
		this.PosRsnd = PosRsnd;
		this.SeqNum = SeqNum;
		
	}
	
	
	public Hdr ( ) {   
	
		this.Snt = "2001-12-17T09:30:47-05:00";
		this.PosDup = "N";
		this.PosRsnd = "N";
		this.SeqNum = "1002";
		
		Sndr Hdr1_Sndr1= new Sndr("String", "String", "String");
		this.addSndr( Hdr1_Sndr1 );
		
		Tgt Hdr1_Tgt1= new Tgt("String", "String", "String");
		this.addTgt( Hdr1_Tgt1 );
		
		OnBhlfOf Hdr1_OnBhlfOf1= new OnBhlfOf("String", "String", "String");
		this.addOnBhlfOf( Hdr1_OnBhlfOf1 );
		
		DlvrTo Hdr1_DlvrTo1= new DlvrTo("String", "String", "String");
		this.addDlvrTo( Hdr1_DlvrTo1 );
		
	}
	
	public void addSndr( Sndr child ) {
		this.Sndrs.add( child );
	}
	public void addTgt( Tgt child ) {
		this.Tgts.add( child );
	}
	public void addOnBhlfOf( OnBhlfOf child ) {
		this.OnBhlfOfs.add( child );
	}
	public void addDlvrTo( DlvrTo child ) {
		this.DlvrTos.add( child );
	}
	
} 