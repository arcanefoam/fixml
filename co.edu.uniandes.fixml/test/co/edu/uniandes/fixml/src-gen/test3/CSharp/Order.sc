
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
  
ClOrdID Order_ClOrdID_0= new ClOrdID();
this.AddClOrdID( Order_ClOrdID_0 );
  		
HandInst Order_HandInst_1= new HandInst();
this.AddHandInst( Order_HandInst_1 );
  		
MinQty Order_MinQty_2= new MinQty();
this.AddMinQty( Order_MinQty_2 );
  		
Instrument Order_Instrument_3= new Instrument();
Symbol Order_Instrument_3_Symbol_0= new Symbol();
Order_Instrument_3.AddSymbol( Order_Instrument_3_Symbol_0 );
  		
IDSource Order_Instrument_3_IDSource_1= new IDSource();
Order_Instrument_3.AddIDSource( Order_Instrument_3_IDSource_1 );
  		
SecurityID Order_Instrument_3_SecurityID_2= new SecurityID();
Order_Instrument_3.AddSecurityID( Order_Instrument_3_SecurityID_2 );
  		
this.AddInstrument( Order_Instrument_3 );
  		
Side Order_Side_4= new Side();
this.AddSide( Order_Side_4 );
  		
TransactTime Order_TransactTime_5= new TransactTime();
this.AddTransactTime( Order_TransactTime_5 );
  		
OrderQuantity Order_OrderQuantity_6= new OrderQuantity();
OrderQty Order_OrderQuantity_6_OrderQty_0= new OrderQty();
Order_OrderQuantity_6.AddOrderQty( Order_OrderQuantity_6_OrderQty_0 );
  		
this.AddOrderQuantity( Order_OrderQuantity_6 );
  		
OrderType Order_OrderType_7= new OrderType();
LimitOrder Order_OrderType_7_LimitOrder_0= new LimitOrder();
Price Order_OrderType_7_LimitOrder_0_Price_0= new Price();
Order_OrderType_7_LimitOrder_0.AddPrice( Order_OrderType_7_LimitOrder_0_Price_0 );
  		
Order_OrderType_7.AddLimitOrder( Order_OrderType_7_LimitOrder_0 );
  		
this.AddOrderType( Order_OrderType_7 );
  		
Currency Order_Currency_8= new Currency();
this.AddCurrency( Order_Currency_8 );
  		
Rule80A Order_Rule80A_9= new Rule80A("A");
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