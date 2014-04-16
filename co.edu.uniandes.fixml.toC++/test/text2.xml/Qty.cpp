package text2.xml;

public class Qty {

	private:
  	String Typ;
  	String Long;
  	String Short;


 	public: 

  	// default constructor
	public Qty () {
		Typ = "SOD" ;
		Long = "35" ;
		Short = "0" ;
  	
  	}
  	
  	
  	
  
  	// by parameters
  	public Qty (
	  String Typ_, String Long_, String Short_, 
  	){
	  
	  Typ = Typ_;
		Long = Long_;
		Short = Short_;
	  
  }
} 