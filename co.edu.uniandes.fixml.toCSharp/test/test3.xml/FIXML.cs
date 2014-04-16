
using System.Collections.Generic;
// Class for tag FIXML
class FIXML {


	List<FIXMLMessage> _FIXMLMessages = new List<FIXMLMessage>();
	
	// default constructor
	
	public FIXML ( ) {   
		;
		
		FIXMLMessage FIXML_FIXMLMessage= new FIXMLMessage();
		ApplicationMessage FIXML_FIXMLMessage_ApplicationMessage= new ApplicationMessage();
		Order FIXML_FIXMLMessage_ApplicationMessage_Order= new Order();
		ClOrdID FIXML_FIXMLMessage_ApplicationMessage_Order_ClOrdID= new ClOrdID();
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddClOrdID( FIXML_FIXMLMessage_ApplicationMessage_Order_ClOrdID );
		
		HandInst FIXML_FIXMLMessage_ApplicationMessage_Order_HandInst= new HandInst("2");
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddHandInst( FIXML_FIXMLMessage_ApplicationMessage_Order_HandInst );
		
		MinQty FIXML_FIXMLMessage_ApplicationMessage_Order_MinQty= new MinQty();
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddMinQty( FIXML_FIXMLMessage_ApplicationMessage_Order_MinQty );
		
		Instrument FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument= new Instrument();
		Symbol FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_Symbol= new Symbol();
		FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument.AddSymbol( FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_Symbol );
		
		IDSource FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_IDSource= new IDSource();
		FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument.AddIDSource( FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_IDSource );
		
		SecurityID FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_SecurityID= new SecurityID();
		FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument.AddSecurityID( FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument_SecurityID );
		
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddInstrument( FIXML_FIXMLMessage_ApplicationMessage_Order_Instrument );
		
		Side FIXML_FIXMLMessage_ApplicationMessage_Order_Side= new Side("1");
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddSide( FIXML_FIXMLMessage_ApplicationMessage_Order_Side );
		
		TransactTime FIXML_FIXMLMessage_ApplicationMessage_Order_TransactTime= new TransactTime();
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddTransactTime( FIXML_FIXMLMessage_ApplicationMessage_Order_TransactTime );
		
		OrderQuantity FIXML_FIXMLMessage_ApplicationMessage_Order_OrderQuantity= new OrderQuantity();
		OrderQty FIXML_FIXMLMessage_ApplicationMessage_Order_OrderQuantity_OrderQty= new OrderQty();
		FIXML_FIXMLMessage_ApplicationMessage_Order_OrderQuantity.AddOrderQty( FIXML_FIXMLMessage_ApplicationMessage_Order_OrderQuantity_OrderQty );
		
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddOrderQuantity( FIXML_FIXMLMessage_ApplicationMessage_Order_OrderQuantity );
		
		OrderType FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType= new OrderType();
		LimitOrder FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder= new LimitOrder("2");
		Price FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder_Price= new Price();
		FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder.AddPrice( FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder_Price );
		
		FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType.AddLimitOrder( FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType_LimitOrder );
		
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddOrderType( FIXML_FIXMLMessage_ApplicationMessage_Order_OrderType );
		
		Currency FIXML_FIXMLMessage_ApplicationMessage_Order_Currency= new Currency("USD");
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddCurrency( FIXML_FIXMLMessage_ApplicationMessage_Order_Currency );
		
		Rule80A FIXML_FIXMLMessage_ApplicationMessage_Order_Rule80A= new Rule80A("A");
		FIXML_FIXMLMessage_ApplicationMessage_Order.AddRule80A( FIXML_FIXMLMessage_ApplicationMessage_Order_Rule80A );
		
		FIXML_FIXMLMessage_ApplicationMessage.AddOrder( FIXML_FIXMLMessage_ApplicationMessage_Order );
		
		FIXML_FIXMLMessage.AddApplicationMessage( FIXML_FIXMLMessage_ApplicationMessage );
		
		this.AddFIXMLMessage( FIXML_FIXMLMessage );
		
		
	}
	
	public FIXML (  ) {
	
	}
	
	public void AddFIXMLMessage( FIXMLMessage child ) {
		this._FIXMLMessages.Add( child );
	}
	
	
} 