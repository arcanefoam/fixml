package object;



// Class for tag Instrmt
public class Instrmt {

  String Sym;
  String ID;
  String IDSrc;


  // default constructor
  public Instrmt ( String Sym, String ID, String IDSrc ) {
    this.Sym = Sym;
    this.ID = ID;
    this.IDSrc = IDSrc;
  
  }


  public Instrmt ( ) {   
  
this.Sym = "IBM";
this.ID = "459200101";
this.IDSrc = "1";
  
  }
      

} 