
using System.Collections.Generic;
// Class for tag Order
class Order {


  List<ClOrdID> _ClOrdIDs = new List<ClOrdID>();
  List<HandInst> _HandInsts = new List<HandInst>();
  List<Instrument> _Instruments = new List<Instrument>();
  List<Side> _Sides = new List<Side>();
  List<TransactTime> _TransactTimes = new List<TransactTime>();
  List<OrderQuantity> _OrderQuantitys = new List<OrderQuantity>();
  List<OrderType> _OrderTypes = new List<OrderType>();
  List<Currency> _Currencys = new List<Currency>();
  List<OrderDuration> _OrderDurations = new List<OrderDuration>();
  List<Rule80A> _Rule80As = new List<Rule80A>();

  // default constructor

  public Order ( ) {   
;
  
ClOrdID Order_ClOrdID_0= new ClOrdID();
this.AddClOrdID( Order_ClOrdID_0 );
  		
HandInst Order_HandInst_1= new HandInst();
this.AddHandInst( Order_HandInst_1 );
  		
Instrument Order_Instrument_2= new Instrument();
Symbol Order_Instrument_2_Symbol_0= new Symbol();
Order_Instrument_2.AddSymbol( Order_Instrument_2_Symbol_0 );
  		
SecurityType Order_Instrument_2_SecurityType_1= new SecurityType();
Equity Order_Instrument_2_SecurityType_1_Equity_0= new Equity();
Order_Instrument_2_SecurityType_1.AddEquity( Order_Instrument_2_SecurityType_1_Equity_0 );
  		
Order_Instrument_2.AddSecurityType( Order_Instrument_2_SecurityType_1 );
  		
this.AddInstrument( Order_Instrument_2 );
  		
Side Order_Side_3= new Side();
this.AddSide( Order_Side_3 );
  		
TransactTime Order_TransactTime_4= new TransactTime();
this.AddTransactTime( Order_TransactTime_4 );
  		
OrderQuantity Order_OrderQuantity_5= new OrderQuantity();
OrderQty Order_OrderQuantity_5_OrderQty_0= new OrderQty();
Order_OrderQuantity_5.AddOrderQty( Order_OrderQuantity_5_OrderQty_0 );
  		
this.AddOrderQuantity( Order_OrderQuantity_5 );
  		
OrderType Order_OrderType_6= new OrderType();
LimitOrder Order_OrderType_6_LimitOrder_0= new LimitOrder();
Price Order_OrderType_6_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
Order_OrderType_6_LimitOrder_0.AddPrice( Order_OrderType_6_LimitOrder_0_Price_0 );
  		
Order_OrderType_6.AddLimitOrder( Order_OrderType_6_LimitOrder_0 );
  		
this.AddOrderType( Order_OrderType_6 );
  		
Currency Order_Currency_7= new Currency();
this.AddCurrency( Order_Currency_7 );
  		
OrderDuration Order_OrderDuration_8= new OrderDuration();
TimeInForce Order_OrderDuration_8_TimeInForce_0= new TimeInForce();
Order_OrderDuration_8.AddTimeInForce( Order_OrderDuration_8_TimeInForce_0 );
  		
this.AddOrderDuration( Order_OrderDuration_8 );
  		
Rule80A Order_Rule80A_9= new Rule80A("A", "47", "char");
this.AddRule80A( Order_Rule80A_9 );
  		
 
  }
    
  public Order (  ) {
  
  }
  
  public void AddClOrdID( ClOrdID child ) {
    this._ClOrdIDs.Add( child );
  }
  
  public void AddHandInst( HandInst child ) {
    this._HandInsts.Add( child );
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
  
  public void AddOrderDuration( OrderDuration child ) {
    this._OrderDurations.Add( child );
  }
  
  public void AddRule80A( Rule80A child ) {
    this._Rule80As.Add( child );
  }
  

} 