
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
  
Sndr Hdr_Sndr_0= new Sndr();
this.AddSndr( Hdr_Sndr_0 );
  		
Tgt Hdr_Tgt_1= new Tgt();
this.AddTgt( Hdr_Tgt_1 );
  		
 
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