package object;

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
  
Sndr Hdr_Sndr_0= new Sndr();
this.addSndr( Hdr_Sndr_0 );
  		
Tgt Hdr_Tgt_1= new Tgt();
this.addTgt( Hdr_Tgt_1 );
  		
OnBhlfOf Hdr_OnBhlfOf_2= new OnBhlfOf();
this.addOnBhlfOf( Hdr_OnBhlfOf_2 );
  		
DlvrTo Hdr_DlvrTo_3= new DlvrTo("String", "String");
this.addDlvrTo( Hdr_DlvrTo_3 );
  		
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