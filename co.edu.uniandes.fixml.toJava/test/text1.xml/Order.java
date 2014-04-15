package text1.xml;



// Class for tag Order
public class Order {

	String ClOrdID;
	String Side;
	String TransactTm;
	String OrdTyp;
	String Px;
	String Acct;
	
	List<Hdr> Hdrs;
	List<Instrmt> Instrmts;
	List<OrdQty> OrdQtys;
	
	// default constructor
	public Order ( String ClOrdID, String Side, String TransactTm, String OrdTyp, String Px, String Acct ) {
	
		this.ClOrdID = ClOrdID;
		this.Side = Side;
		this.TransactTm = TransactTm;
		this.OrdTyp = OrdTyp;
		this.Px = Px;
		this.Acct = Acct;
		
	}
	
	public addHdr( Hdr child ) {
		this.Hdrs.add( child );
	}
	
	public addInstrmt( Instrmt child ) {
		this.Instrmts.add( child );
	}
	
	public addOrdQty( OrdQty child ) {
		this.OrdQtys.add( child );
	}
	
	
	
	public Order createMessage ( ) {   
		Order Order1= new Order();
		Hdr Order1_Hdr1= new Hdr();
		Sndr Order1_Hdr1_Sndr1= new Sndr();
		Order1_Hdr1.addSndr( Order1_Hdr1_Sndr1 );
		
		Tgt Order1_Hdr1_Tgt1= new Tgt();
		Order1_Hdr1.addTgt( Order1_Hdr1_Tgt1 );
		
		Order1.addHdr( Order1_Hdr1 );
		
		Instrmt Order1_Instrmt1= new Instrmt();
		Order1.addInstrmt( Order1_Instrmt1 );
		
		OrdQty Order1_OrderQty1= new OrdQty();
		Order1.addOrdQty( Order1_OrderQty1 );
		
		
		
		return Order1; 
	}
} 