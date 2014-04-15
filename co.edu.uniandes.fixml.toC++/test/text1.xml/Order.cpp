package text1.xml;

public class Order {

	private:
	String ClOrdID;
	String Side;
	String TransactTm;
	String OrdTyp;
	String Px;
	String Acct;
	
	Hdr* Hdr_obj;
	Instrmt* Instrmt_obj;
	OrdQty* OrdQty_obj;
	
	public: 
	
	// default constructor
	public Order () {
	
		ClOrdID = 
		123456 ;
		
		Side = 
		2 ;
		
		TransactTm = 
		2001-09-11T09:30:47-05:00 ;
		
		OrdTyp = 
		2 ;
		
		Px = 
		93.25 ;
		
		Acct = 
		26522154 ;
		
		
		Hdr_obj = new Hdr() ;
		Instrmt_obj = new Instrmt() ;
		OrdQty_obj = new OrdQty() ;
		
	}
	
	// by parameters
	
	public Order (
	
	StringClOrdID, StringSide, StringTransactTm, StringOrdTyp, StringPx, StringAcct, 
	Hdr*Hdr_, Instrmt*Instrmt_, OrdQty*OrdQty_
	) {
	
	
	}
} 