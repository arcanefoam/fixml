package text2.xml;

public class Instrmt {

	private:
  	String Sym;
  	String ID;
  	String IDSrc;
  	String CFI;
  	String MMY;
  	String Mat;
  	String Strk;
  	String StrkCcy;
  	String Mult;


 	public: 

  	// default constructor
	public Instrmt () {
		Sym = "AOL" ;
		ID = "KW" ;
		IDSrc = "3" ;
		CFI = "OCASPS" ;
		MMY = "20031122" ;
		Mat = "2003-11-22T00:00:00" ;
		Strk = "47.50" ;
		StrkCcy = "USD" ;
		Mult = "100" ;
  	
  	}
  	
  	
  	
  
  	// by parameters
  	public Instrmt (
	  String Sym_, String ID_, String IDSrc_, String CFI_, String MMY_, String Mat_, String Strk_, String StrkCcy_, String Mult_, 
  	){
	  
	  Sym = Sym_;
		ID = ID_;
		IDSrc = IDSrc_;
		CFI = CFI_;
		MMY = MMY_;
		Mat = Mat_;
		Strk = Strk_;
		StrkCcy = StrkCcy_;
		Mult = Mult_;
	  
  }
} 