
using System.Collections.Generic;
// Class for tag ApplicationMessage
class ApplicationMessage {


  List<Order> _Orders = new List<Order>();

  // default constructor

  public ApplicationMessage ( ) {   
;
  
Order ApplicationMessage_Order_0= new Order();
ClOrdID ApplicationMessage_Order_0_ClOrdID_0= new ClOrdID();
ApplicationMessage_Order_0.AddClOrdID( ApplicationMessage_Order_0_ClOrdID_0 );
  		
HandInst ApplicationMessage_Order_0_HandInst_1= new HandInst();
ApplicationMessage_Order_0.AddHandInst( ApplicationMessage_Order_0_HandInst_1 );
  		
MinQty ApplicationMessage_Order_0_MinQty_2= new MinQty();
ApplicationMessage_Order_0.AddMinQty( ApplicationMessage_Order_0_MinQty_2 );
  		
Instrument ApplicationMessage_Order_0_Instrument_3= new Instrument();
Symbol ApplicationMessage_Order_0_Instrument_3_Symbol_0= new Symbol();
ApplicationMessage_Order_0_Instrument_3.AddSymbol( ApplicationMessage_Order_0_Instrument_3_Symbol_0 );
  		
IDSource ApplicationMessage_Order_0_Instrument_3_IDSource_1= new IDSource();
ApplicationMessage_Order_0_Instrument_3.AddIDSource( ApplicationMessage_Order_0_Instrument_3_IDSource_1 );
  		
SecurityID ApplicationMessage_Order_0_Instrument_3_SecurityID_2= new SecurityID();
ApplicationMessage_Order_0_Instrument_3.AddSecurityID( ApplicationMessage_Order_0_Instrument_3_SecurityID_2 );
  		
ApplicationMessage_Order_0.AddInstrument( ApplicationMessage_Order_0_Instrument_3 );
  		
Side ApplicationMessage_Order_0_Side_4= new Side();
ApplicationMessage_Order_0.AddSide( ApplicationMessage_Order_0_Side_4 );
  		
TransactTime ApplicationMessage_Order_0_TransactTime_5= new TransactTime();
ApplicationMessage_Order_0.AddTransactTime( ApplicationMessage_Order_0_TransactTime_5 );
  		
OrderQuantity ApplicationMessage_Order_0_OrderQuantity_6= new OrderQuantity();
OrderQty ApplicationMessage_Order_0_OrderQuantity_6_OrderQty_0= new OrderQty();
ApplicationMessage_Order_0_OrderQuantity_6.AddOrderQty( ApplicationMessage_Order_0_OrderQuantity_6_OrderQty_0 );
  		
ApplicationMessage_Order_0.AddOrderQuantity( ApplicationMessage_Order_0_OrderQuantity_6 );
  		
OrderType ApplicationMessage_Order_0_OrderType_7= new OrderType();
LimitOrder ApplicationMessage_Order_0_OrderType_7_LimitOrder_0= new LimitOrder();
Price ApplicationMessage_Order_0_OrderType_7_LimitOrder_0_Price_0= new Price();
ApplicationMessage_Order_0_OrderType_7_LimitOrder_0.AddPrice( ApplicationMessage_Order_0_OrderType_7_LimitOrder_0_Price_0 );
  		
ApplicationMessage_Order_0_OrderType_7.AddLimitOrder( ApplicationMessage_Order_0_OrderType_7_LimitOrder_0 );
  		
ApplicationMessage_Order_0.AddOrderType( ApplicationMessage_Order_0_OrderType_7 );
  		
Currency ApplicationMessage_Order_0_Currency_8= new Currency();
ApplicationMessage_Order_0.AddCurrency( ApplicationMessage_Order_0_Currency_8 );
  		
Rule80A ApplicationMessage_Order_0_Rule80A_9= new Rule80A("A");
ApplicationMessage_Order_0.AddRule80A( ApplicationMessage_Order_0_Rule80A_9 );
  		
this.AddOrder( ApplicationMessage_Order_0 );
  		
 
  }
    
  public ApplicationMessage (  ) {
  
  }
  
  public void AddOrder( Order child ) {
    this._Orders.Add( child );
  }
  

} 