
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
		
		Sndr Hdr_Sndr_0= new Sndr("String", "String", "String");
		this.AddSndr( Hdr_Sndr_0 );
		
		Tgt Hdr_Tgt_1= new Tgt("String", "String", "String");
		this.AddTgt( Hdr_Tgt_1 );
		
		OnBhlfOf Hdr_OnBhlfOf_2= new OnBhlfOf("String", "String", "String");
		this.AddOnBhlfOf( Hdr_OnBhlfOf_2 );
		
		DlvrTo Hdr_DlvrTo_3= new DlvrTo("String", "String", "String");
		this.AddDlvrTo( Hdr_DlvrTo_3 );
		
		
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