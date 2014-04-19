
using System.Collections.Generic;
// Class for tag FIXMLMessage
class FIXMLMessage {


  List<ApplicationMessage> _ApplicationMessages = new List<ApplicationMessage>();

  // default constructor

  public FIXMLMessage ( ) {   
;
  
ApplicationMessage FIXMLMessage_ApplicationMessage_0= new ApplicationMessage();
Order FIXMLMessage_ApplicationMessage_0_Order_0= new Order();
ClOrdID FIXMLMessage_ApplicationMessage_0_Order_0_ClOrdID_0= new ClOrdID();
FIXMLMessage_ApplicationMessage_0_Order_0.AddClOrdID( FIXMLMessage_ApplicationMessage_0_Order_0_ClOrdID_0 );
  		
HandInst FIXMLMessage_ApplicationMessage_0_Order_0_HandInst_1= new HandInst();
FIXMLMessage_ApplicationMessage_0_Order_0.AddHandInst( FIXMLMessage_ApplicationMessage_0_Order_0_HandInst_1 );
  		
MinQty FIXMLMessage_ApplicationMessage_0_Order_0_MinQty_2= new MinQty();
FIXMLMessage_ApplicationMessage_0_Order_0.AddMinQty( FIXMLMessage_ApplicationMessage_0_Order_0_MinQty_2 );
  		
Instrument FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3= new Instrument();
Symbol FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_Symbol_0= new Symbol();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.AddSymbol( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_Symbol_0 );
  		
IDSource FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_IDSource_1= new IDSource();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.AddIDSource( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_IDSource_1 );
  		
SecurityID FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_SecurityID_2= new SecurityID();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.AddSecurityID( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_SecurityID_2 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.AddInstrument( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3 );
  		
Side FIXMLMessage_ApplicationMessage_0_Order_0_Side_4= new Side();
FIXMLMessage_ApplicationMessage_0_Order_0.AddSide( FIXMLMessage_ApplicationMessage_0_Order_0_Side_4 );
  		
TransactTime FIXMLMessage_ApplicationMessage_0_Order_0_TransactTime_5= new TransactTime();
FIXMLMessage_ApplicationMessage_0_Order_0.AddTransactTime( FIXMLMessage_ApplicationMessage_0_Order_0_TransactTime_5 );
  		
OrderQuantity FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6= new OrderQuantity();
OrderQty FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6_OrderQty_0= new OrderQty();
FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6.AddOrderQty( FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6_OrderQty_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.AddOrderQuantity( FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6 );
  		
OrderType FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7= new OrderType();
LimitOrder FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0= new LimitOrder();
Price FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0_Price_0= new Price();
FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0.AddPrice( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0_Price_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7.AddLimitOrder( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.AddOrderType( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7 );
  		
Currency FIXMLMessage_ApplicationMessage_0_Order_0_Currency_8= new Currency();
FIXMLMessage_ApplicationMessage_0_Order_0.AddCurrency( FIXMLMessage_ApplicationMessage_0_Order_0_Currency_8 );
  		
Rule80A FIXMLMessage_ApplicationMessage_0_Order_0_Rule80A_9= new Rule80A("A");
FIXMLMessage_ApplicationMessage_0_Order_0.AddRule80A( FIXMLMessage_ApplicationMessage_0_Order_0_Rule80A_9 );
  		
FIXMLMessage_ApplicationMessage_0.AddOrder( FIXMLMessage_ApplicationMessage_0_Order_0 );
  		
this.AddApplicationMessage( FIXMLMessage_ApplicationMessage_0 );
  		
 
  }
    
  public FIXMLMessage (  ) {
  
  }
  
  public void AddApplicationMessage( ApplicationMessage child ) {
    this._ApplicationMessages.Add( child );
  }
  

} 