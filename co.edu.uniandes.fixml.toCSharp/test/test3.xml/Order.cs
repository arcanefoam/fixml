
using System.Collections.Generic;
// Class for tag Order
class Order {


	List<ClOrdID> _ClOrdIDs = new List<ClOrdID>();
	List<HandInst> _HandInsts = new List<HandInst>();
	List<MinQty> _MinQtys = new List<MinQty>();
	List<Instrument> _Instruments = new List<Instrument>();
	List<Side> _Sides = new List<Side>();
	List<TransactTime> _TransactTimes = new List<TransactTime>();
	List<OrderQuantity> _OrderQuantitys = new List<OrderQuantity>();
	List<OrderType> _OrderTypes = new List<OrderType>();
	List<Currency> _Currencys = new List<Currency>();
	List<Rule80A> _Rule80As = new List<Rule80A>();
	
	// default constructor
	
	public Order ( ) {   
		;
		
		ClOrdID Order_ClOrdID= new ClOrdID();
		this.AddClOrdID( Order_ClOrdID );
		
		HandInst Order_HandInst= new HandInst("2");
		this.AddHandInst( Order_HandInst );
		
		MinQty Order_MinQty= new MinQty();
		this.AddMinQty( Order_MinQty );
		
		Instrument Order_Instrument= new Instrument();
		Symbol Order_Instrument_Symbol= new Symbol();
		Order_Instrument.AddSymbol( Order_Instrument_Symbol );
		
		IDSource Order_Instrument_IDSource= new IDSource();
		Order_Instrument.AddIDSource( Order_Instrument_IDSource );
		
		SecurityID Order_Instrument_SecurityID= new SecurityID();
		Order_Instrument.AddSecurityID( Order_Instrument_SecurityID );
		
		this.AddInstrument( Order_Instrument );
		
		Side Order_Side= new Side("1");
		this.AddSide( Order_Side );
		
		TransactTime Order_TransactTime= new TransactTime();
		this.AddTransactTime( Order_TransactTime );
		
		OrderQuantity Order_OrderQuantity= new OrderQuantity();
		OrderQty Order_OrderQuantity_OrderQty= new OrderQty();
		Order_OrderQuantity.AddOrderQty( Order_OrderQuantity_OrderQty );
		
		this.AddOrderQuantity( Order_OrderQuantity );
		
		OrderType Order_OrderType= new OrderType();
		LimitOrder Order_OrderType_LimitOrder= new LimitOrder("2");
		Price Order_OrderType_LimitOrder_Price= new Price();
		Order_OrderType_LimitOrder.AddPrice( Order_OrderType_LimitOrder_Price );
		
		Order_OrderType.AddLimitOrder( Order_OrderType_LimitOrder );
		
		this.AddOrderType( Order_OrderType );
		
		Currency Order_Currency= new Currency("USD");
		this.AddCurrency( Order_Currency );
		
		Rule80A Order_Rule80A= new Rule80A("A");
		this.AddRule80A( Order_Rule80A );
		
		
	}
	
	public Order (  ) {
	
	}
	
	public void AddClOrdID( ClOrdID child ) {
		this._ClOrdIDs.Add( child );
	}
	
	public void AddHandInst( HandInst child ) {
		this._HandInsts.Add( child );
	}
	
	public void AddMinQty( MinQty child ) {
		this._MinQtys.Add( child );
	}
	
	public void AddInstrument( Instrument child ) {
		this._Instruments.Add( child );
	}
	
	public void AddSide( Side child ) {
		this._Sides.Add( child );
	}
	
	public void AddTransactTime( TransactTime child ) {
		this._TransactTimes.Add( child );
	}
	
	public void AddOrderQuantity( OrderQuantity child ) {
		this._OrderQuantitys.Add( child );
	}
	
	public void AddOrderType( OrderType child ) {
		this._OrderTypes.Add( child );
	}
	
	public void AddCurrency( Currency child ) {
		this._Currencys.Add( child );
	}
	
	public void AddRule80A( Rule80A child ) {
		this._Rule80As.Add( child );
	}
	
	
} 