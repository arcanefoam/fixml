
using System.Collections.Generic;
// Class for tag Hdr
class Hdr {

	string _PosDup;
	string _PosRsnd;
	string _SeqNum;
	string _Snt;
	
	List<Sndr> _Sndrs = new List<Sndr>();
	List<Tgt> _Tgts = new List<Tgt>();
	List<OnBhlfOf> _OnBhlfOfs = new List<OnBhlfOf>();
	List<DlvrTo> _DlvrTos = new List<DlvrTo>();
	
	// default constructor
	
	public Hdr ( ) {   
		this._PosDup = "N";
		this._PosRsnd = "N";
		this._SeqNum = "1002";
		this._Snt = "2001-12-17T09:30:47-05:00";
		
		Sndr Hdr_Sndr= new Sndr("String", "String", "String");
		this.AddSndr( Hdr_Sndr );
		
		Tgt Hdr_Tgt= new Tgt("String", "String", "String");
		this.AddTgt( Hdr_Tgt );
		
		OnBhlfOf Hdr_OnBhlfOf= new OnBhlfOf("String", "String", "String");
		this.AddOnBhlfOf( Hdr_OnBhlfOf );
		
		DlvrTo Hdr_DlvrTo= new DlvrTo("String", "String", "String");
		this.AddDlvrTo( Hdr_DlvrTo );
		
		
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
	
	public void AddOnBhlfOf( OnBhlfOf child ) {
		this._OnBhlfOfs.Add( child );
	}
	
	public void AddDlvrTo( DlvrTo child ) {
		this._DlvrTos.Add( child );
	}
	
	
} 