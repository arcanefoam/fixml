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
	public Order ( String ClOrdID, String Side, String TransactTm, String OrdTyp, String Px, String Acct, ) {
	
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
	
	
	public void main ( String args[]) {
	
		// build all the elements in the structure
		
	}
} 