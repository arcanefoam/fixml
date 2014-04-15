
using System.Collections.Generic;
// Class for tag Hdr
class Hdr {

	string _Snt;
	string _PosDup;
	string _PosRsnd;
	string _SeqNum;
	
	List<Sndr> _Sndrs = new List<Sndr>();
	List<Tgt> _Tgts = new List<Tgt>();
	List<OnBhlfOf> _OnBhlfOfs = new List<OnBhlfOf>();
	List<DlvrTo> _DlvrTos = new List<DlvrTo>();
	
	// default constructor
	
	public Hdr ( ) {   
		this._Snt = "2001-12-17T09:30:47-05:00";
		this._PosDup = "N";
		this._PosRsnd = "N";
		this._SeqNum = "1002";
		
		Sndr Hdr1_Sndr1= new Sndr("String", "String", "String");
		this.AddSndr( Hdr1_Sndr1 );
		
		Tgt Hdr1_Tgt1= new Tgt("String", "String", "String");
		this.AddTgt( Hdr1_Tgt1 );
		
		OnBhlfOf Hdr1_OnBhlfOf1= new OnBhlfOf("String", "String", "String");
		this.AddOnBhlfOf( Hdr1_OnBhlfOf1 );
		
		DlvrTo Hdr1_DlvrTo1= new DlvrTo("String", "String", "String");
		this.AddDlvrTo( Hdr1_DlvrTo1 );
		
		
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
	
	public void AddOnBhlfOf( OnBhlfOf child ) {
		this._OnBhlfOfs.Add( child );
	}
	
	public void AddDlvrTo( DlvrTo child ) {
		this._DlvrTos.Add( child );
	}
	
	
} 