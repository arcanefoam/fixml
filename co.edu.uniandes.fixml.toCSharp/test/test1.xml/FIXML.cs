
using System.Collections.Generic;
// Class for tag FIXML
class FIXML {


	List<Order> _Orders = new List<Order>();
	
	// default constructor
	
	public FIXML ( ) {   
		;
		
		Order FIXML_Order_0= new Order("26522154", "123456", "2", "93.25", "2", "2001-09-11T09:30:47-05:00");
		Hdr FIXML_Order_0_Hdr_0= new Hdr("N", "N", "521", "2001-09-11T09:30:47-05:00");
		Sndr FIXML_Order_0_Hdr_0_Sndr_0= new Sndr("AFUNDMGR");
		FIXML_Order_0_Hdr_0.AddSndr( FIXML_Order_0_Hdr_0_Sndr_0 );
		
		Tgt FIXML_Order_0_Hdr_0_Tgt_1= new Tgt("ABROKER");
		FIXML_Order_0_Hdr_0.AddTgt( FIXML_Order_0_Hdr_0_Tgt_1 );
		
		FIXML_Order_0.AddHdr( FIXML_Order_0_Hdr_0 );
		
		Instrmt FIXML_Order_0_Instrmt_1= new Instrmt("459200101", "1", "IBM");
		FIXML_Order_0.AddInstrmt( FIXML_Order_0_Instrmt_1 );
		
		OrdQty FIXML_Order_0_OrdQty_2= new OrdQty("1000");
		FIXML_Order_0.AddOrdQty( FIXML_Order_0_OrdQty_2 );
		
		this.AddOrder( FIXML_Order_0 );
		
		
	}
	
	public FIXML (  ) {
	
	}
	
	public void AddOrder( Order child ) {
		this._Orders.Add( child );
	}
	
	
} 