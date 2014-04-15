namespace text2.xml;

using System.Collections.Generic;

// Class for tag Hdr
class Hdr {

	string Snt;
	string PosDup;
	string PosRsnd;
	string SeqNum;
	
	List<Sndr> Sndrs = new List<Sndr>();
	List<Tgt> Tgts = new List<Tgt>();
	List<OnBhlfOf> OnBhlfOfs = new List<OnBhlfOf>();
	List<DlvrTo> DlvrTos = new List<DlvrTo>();
	
	// default constructor
	
	Hdr ( ) {   
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
	
	Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum ) {
		this.Snt = Snt;
		this.PosDup = PosDup;
		this.PosRsnd = PosRsnd;
		this.SeqNum = SeqNum;
		
	}
	
	AddSndr( Sndr child ) {
		this.Sndrs.Add( child );
	}
	
	AddTgt( Tgt child ) {
		this.Tgts.Add( child );
	}
	
	AddOnBhlfOf( OnBhlfOf child ) {
		this.OnBhlfOfs.Add( child );
	}
	
	AddDlvrTo( DlvrTo child ) {
		this.DlvrTos.Add( child );
	}
	
	
} 