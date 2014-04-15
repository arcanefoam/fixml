
using System.Collections.Generic;
// Class for tag Hdr
class Hdr {

	string _Snt;
	string _PosDup;
	string _PosRsnd;
	string _SeqNum;
	
	List<Sndr> _Sndrs = new List<Sndr>();
	List<Tgt> _Tgts = new List<Tgt>();
	
	// default constructor
	
	public Hdr ( ) {   
		this._Snt = "2001-09-11T09:30:47-05:00";
		this._PosDup = "N";
		this._PosRsnd = "N";
		this._SeqNum = "521";
		
		Sndr Hdr1_Sndr1= new Sndr("AFUNDMGR");
		this.AddSndr( Hdr1_Sndr1 );
		
		Tgt Hdr1_Tgt1= new Tgt("ABROKER");
		this.AddTgt( Hdr1_Tgt1 );
		
		
	}
	
	public Hdr ( string Snt, string PosDup, string PosRsnd, string SeqNum ) {
		this._Snt = Snt;
		this._PosDup = PosDup;
		this._PosRsnd = PosRsnd;
		this._SeqNum = SeqNum;
		
	}
	
	public void AddSndr( Sndr child ) {
		this._Sndrs.Add( child );
	}
	
	public void AddTgt( Tgt child ) {
		this._Tgts.Add( child );
	}
	
	
} 