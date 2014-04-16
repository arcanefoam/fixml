
using System.Collections.Generic;
// Class for tag Hdr
class Hdr {

	string _PosDup;
	string _PosRsnd;
	string _SeqNum;
	string _Snt;
	
	List<Sndr> _Sndrs = new List<Sndr>();
	List<Tgt> _Tgts = new List<Tgt>();
	
	// default constructor
	
	public Hdr ( ) {   
		this._PosDup = "N";
		this._PosRsnd = "N";
		this._SeqNum = "521";
		this._Snt = "2001-09-11T09:30:47-05:00";
		
		Sndr Hdr_Sndr_0= new Sndr("AFUNDMGR");
		this.AddSndr( Hdr_Sndr_0 );
		
		Tgt Hdr_Tgt_1= new Tgt("ABROKER");
		this.AddTgt( Hdr_Tgt_1 );
		
		
	}
	
	public Hdr ( string PosDup, string PosRsnd, string SeqNum, string Snt ) {
		this._PosDup = PosDup;
		this._PosRsnd = PosRsnd;
		this._SeqNum = SeqNum;
		this._Snt = Snt;
		
	}
	
	public void AddSndr( Sndr child ) {
		this._Sndrs.Add( child );
	}
	
	public void AddTgt( Tgt child ) {
		this._Tgts.Add( child );
	}
	
	
} 