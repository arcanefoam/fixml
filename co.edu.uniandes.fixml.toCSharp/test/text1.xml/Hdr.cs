namespace text1.xml;

using System.Collections.Generic;

// Class for tag Hdr
class Hdr {

	string Snt;
	string PosDup;
	string PosRsnd;
	string SeqNum;
	
	List<Sndr> Sndrs = new List<Sndr>();
	List<Tgt> Tgts = new List<Tgt>();
	
	// default constructor
	
	Hdr ( ) {   
		this.Snt = "2001-09-11T09:30:47-05:00";
		this.PosDup = "N";
		this.PosRsnd = "N";
		this.SeqNum = "521";
		
		Sndr Hdr1_Sndr1= new Sndr("AFUNDMGR");
		this.addSndr( Hdr1_Sndr1 );
		
		Tgt Hdr1_Tgt1= new Tgt("ABROKER");
		this.addTgt( Hdr1_Tgt1 );
		
		
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
	
	
} 