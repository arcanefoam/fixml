package object;



// Class for tag Instrmt
public class Instrmt {

  String Sym;
  String ID;
  String IDSrc;
  String CFI;
  String MMY;
  String Mat;
  String Strk;
  String StrkCcy;
  String Mult;


  // default constructor
  public Instrmt ( String Sym, String ID, String IDSrc, String CFI, String MMY, String Mat, String Strk, String StrkCcy, String Mult ) {
    this.Sym = Sym;
    this.ID = ID;
    this.IDSrc = IDSrc;
    this.CFI = CFI;
    this.MMY = MMY;
    this.Mat = Mat;
    this.Strk = Strk;
    this.StrkCcy = StrkCcy;
    this.Mult = Mult;
  
  }


  public Instrmt ( ) {   
  
this.Sym = "AOL";
this.ID = "KW";
this.IDSrc = "J";
this.CFI = "OCASPS";
this.MMY = "20031122";
this.Mat = "2003-11-22T00:00:00";
this.Strk = "47.50";
this.StrkCcy = "USD";
this.Mult = "100";
  
  }
      

} 