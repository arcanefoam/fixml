package text2.xml;

public class Pty {

	private:
  	String ID;
  	String R;

	Sub* Sub_1; 
	

 	public: 

  	// default constructor
	public Pty () {
		ID = "OCC" ;
		R = "21" ;
		
			Sub_obj = new Sub();
  	
  	}
  	
  	
  	
  
  	// by parameters
  	public Pty (
	  String ID_, String R_, 
			Sub* Sub_1,
  	){
	  
	  ID = ID_;
		R = R_;
	  
		this.Sub_1 = Sub_1;
	
  }
} 