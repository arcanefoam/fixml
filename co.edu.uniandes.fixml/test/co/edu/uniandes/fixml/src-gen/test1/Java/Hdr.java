package test1.Java

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

  // default constructor
  public Hdr ( String Snt, String PosDup, String PosRsnd, String SeqNum ) {
    this.Snt = Snt;
    this.PosDup = PosDup;
    this.PosRsnd = PosRsnd;
    this.SeqNum = SeqNum;
  
  }


  public Hdr ( ) {   
  
this.Snt = "2001-09-11T09:30:47-05:00";
this.PosDup = "N";
this.PosRsnd = "N";
this.SeqNum = "521";
  
Sndr Hdr_Sndr_0= new Sndr();
this.addSndr( Hdr_Sndr_0 );
  		
Tgt Hdr_Tgt_1= new Tgt();
this.addTgt( Hdr_Tgt_1 );
  		
  }
      
  public void addSndr( Sndr child ) {
    this.Sndrs.add( child );
  }
  public void addTgt( Tgt child ) {
    this.Tgts.add( child );
  }

} 