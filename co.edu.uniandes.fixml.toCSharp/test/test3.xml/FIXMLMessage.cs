
using System.Collections.Generic;
// Class for tag FIXMLMessage
class FIXMLMessage {


	List<ApplicationMessage> _ApplicationMessages = new List<ApplicationMessage>();
	
	// default constructor
	
	public FIXMLMessage ( ) {   
		;
		
		ApplicationMessage FIXMLMessage_ApplicationMessage= new ApplicationMessage();
		Order FIXMLMessage_ApplicationMessage_Order= new Order();
		ClOrdID FIXMLMessage_ApplicationMessage_Order_ClOrdID= new ClOrdID();
		FIXMLMessage_ApplicationMessage_Order.AddClOrdID( FIXMLMessage_ApplicationMessage_Order_ClOrdID );
		
		HandInst FIXMLMessage_ApplicationMessage_Order_HandInst= new HandInst("2");
		FIXMLMessage_ApplicationMessage_Order.AddHandInst( FIXMLMessage_ApplicationMessage_Order_HandInst );
		
		MinQty FIXMLMessage_ApplicationMessage_Order_MinQty= new MinQty();
		FIXMLMessage_ApplicationMessage_Order.AddMinQty( FIXMLMessage_ApplicationMessage_Order_MinQty );
		
		Instrument FIXMLMessage_ApplicationMessage_Order_Instrument= new Instrument();
		Symbol FIXMLMessage_ApplicationMessage_Order_Instrument_Symbol= new Symbol();
		FIXMLMessage_ApplicationMessage_Order_Instrument.AddSymbol( FIXMLMessage_ApplicationMessage_Order_Instrument_Symbol );
		
		IDSource FIXMLMessage_ApplicationMessage_Order_Instrument_IDSource= new IDSource();
		FIXMLMessage_ApplicationMessage_Order_Instrument.AddIDSource( FIXMLMessage_ApplicationMessage_Order_Instrument_IDSource );
		
		SecurityID FIXMLMessage_ApplicationMessage_Order_Instrument_SecurityID= new SecurityID();
		FIXMLMessage_ApplicationMessage_Order_Instrument.AddSecurityID( FIXMLMessage_ApplicationMessage_Order_Instrument_SecurityID );
		
		FIXMLMessage_ApplicationMessage_Order.AddInstrument( FIXMLMessage_ApplicationMessage_Order_Instrument );
		
		Side FIXMLMessage_ApplicationMessage_Order_Side= new Side("1");
		FIXMLMessage_ApplicationMessage_Order.AddSide( FIXMLMessage_ApplicationMessage_Order_Side );
		
		TransactTime FIXMLMessage_ApplicationMessage_Order_TransactTime= new TransactTime();
		FIXMLMessage_ApplicationMessage_Order.AddTransactTime( FIXMLMessage_ApplicationMessage_Order_TransactTime );
		
		OrderQuantity FIXMLMessage_ApplicationMessage_Order_OrderQuantity= new OrderQuantity();
		OrderQty FIXMLMessage_ApplicationMessage_Order_OrderQuantity_OrderQty= new OrderQty();
		FIXMLMessage_ApplicationMessage_Order_OrderQuantity.AddOrderQty( FIXMLMessage_ApplicationMessage_Order_OrderQuantity_OrderQty );
		
		FIXMLMessage_ApplicationMessage_Order.AddOrderQuantity( FIXMLMessage_ApplicationMessage_Order_OrderQuantity );
		
		OrderType FIXMLMessage_ApplicationMessage_Order_OrderType= new OrderType();
		LimitOrder FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder= new LimitOrder("2");
		Price FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder_Price= new Price();
		FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder.AddPrice( FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder_Price );
		
		FIXMLMessage_ApplicationMessage_Order_OrderType.AddLimitOrder( FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder );
		
		FIXMLMessage_ApplicationMessage_Order.AddOrderType( FIXMLMessage_ApplicationMessage_Order_OrderType );
		
		Currency FIXMLMessage_ApplicationMessage_Order_Currency= new Currency("USD");
		FIXMLMessage_ApplicationMessage_Order.AddCurrency( FIXMLMessage_ApplicationMessage_Order_Currency );
		
		Rule80A FIXMLMessage_ApplicationMessage_Order_Rule80A= new Rule80A("A");
		FIXMLMessage_ApplicationMessage_Order.AddRule80A( FIXMLMessage_ApplicationMessage_Order_Rule80A );
		
		FIXMLMessage_ApplicationMessage.AddOrder( FIXMLMessage_ApplicationMessage_Order );
		
		this.AddApplicationMessage( FIXMLMessage_ApplicationMessage );
		
		
	}
	
	public FIXMLMessage (  ) {
	
	}
	
	public void AddApplicationMessage( ApplicationMessage child ) {
		this._ApplicationMessages.Add( child );
	}
	
	
} 