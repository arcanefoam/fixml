
using System.Collections.Generic;
// Class for tag ApplicationMessage
class ApplicationMessage {


	List<Order> _Orders = new List<Order>();
	
	// default constructor
	
	public ApplicationMessage ( ) {   
		;
		
		Order ApplicationMessage_Order= new Order();
		ClOrdID ApplicationMessage_Order_ClOrdID= new ClOrdID();
		ApplicationMessage_Order.AddClOrdID( ApplicationMessage_Order_ClOrdID );
		
		HandInst ApplicationMessage_Order_HandInst= new HandInst("2");
		ApplicationMessage_Order.AddHandInst( ApplicationMessage_Order_HandInst );
		
		MinQty ApplicationMessage_Order_MinQty= new MinQty();
		ApplicationMessage_Order.AddMinQty( ApplicationMessage_Order_MinQty );
		
		Instrument ApplicationMessage_Order_Instrument= new Instrument();
		Symbol ApplicationMessage_Order_Instrument_Symbol= new Symbol();
		ApplicationMessage_Order_Instrument.AddSymbol( ApplicationMessage_Order_Instrument_Symbol );
		
		IDSource ApplicationMessage_Order_Instrument_IDSource= new IDSource();
		ApplicationMessage_Order_Instrument.AddIDSource( ApplicationMessage_Order_Instrument_IDSource );
		
		SecurityID ApplicationMessage_Order_Instrument_SecurityID= new SecurityID();
		ApplicationMessage_Order_Instrument.AddSecurityID( ApplicationMessage_Order_Instrument_SecurityID );
		
		ApplicationMessage_Order.AddInstrument( ApplicationMessage_Order_Instrument );
		
		Side ApplicationMessage_Order_Side= new Side("1");
		ApplicationMessage_Order.AddSide( ApplicationMessage_Order_Side );
		
		TransactTime ApplicationMessage_Order_TransactTime= new TransactTime();
		ApplicationMessage_Order.AddTransactTime( ApplicationMessage_Order_TransactTime );
		
		OrderQuantity ApplicationMessage_Order_OrderQuantity= new OrderQuantity();
		OrderQty ApplicationMessage_Order_OrderQuantity_OrderQty= new OrderQty();
		ApplicationMessage_Order_OrderQuantity.AddOrderQty( ApplicationMessage_Order_OrderQuantity_OrderQty );
		
		ApplicationMessage_Order.AddOrderQuantity( ApplicationMessage_Order_OrderQuantity );
		
		OrderType ApplicationMessage_Order_OrderType= new OrderType();
		LimitOrder ApplicationMessage_Order_OrderType_LimitOrder= new LimitOrder("2");
		Price ApplicationMessage_Order_OrderType_LimitOrder_Price= new Price();
		ApplicationMessage_Order_OrderType_LimitOrder.AddPrice( ApplicationMessage_Order_OrderType_LimitOrder_Price );
		
		ApplicationMessage_Order_OrderType.AddLimitOrder( ApplicationMessage_Order_OrderType_LimitOrder );
		
		ApplicationMessage_Order.AddOrderType( ApplicationMessage_Order_OrderType );
		
		Currency ApplicationMessage_Order_Currency= new Currency("USD");
		ApplicationMessage_Order.AddCurrency( ApplicationMessage_Order_Currency );
		
		Rule80A ApplicationMessage_Order_Rule80A= new Rule80A("A");
		ApplicationMessage_Order.AddRule80A( ApplicationMessage_Order_Rule80A );
		
		this.AddOrder( ApplicationMessage_Order );
		
		
	}
	
	public ApplicationMessage (  ) {
	
	}
	
	public void AddOrder( Order child ) {
		this._Orders.Add( child );
	}
	
	
} 