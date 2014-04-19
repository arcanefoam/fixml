
using System.Collections.Generic;
// Class for tag FIXMLMessage
class FIXMLMessage {


  List<Header> _Headers = new List<Header>();
  List<ApplicationMessage> _ApplicationMessages = new List<ApplicationMessage>();

  // default constructor

  public FIXMLMessage ( ) {   
;
  
Header FIXMLMessage_Header_0= new Header();
Sender FIXMLMessage_Header_0_Sender_0= new Sender();
CompID FIXMLMessage_Header_0_Sender_0_CompID_0= new CompID();
FIXMLMessage_Header_0_Sender_0.AddCompID( FIXMLMessage_Header_0_Sender_0_CompID_0 );
  		
SubID FIXMLMessage_Header_0_Sender_0_SubID_1= new SubID("50", "57", "116", "129");
FIXMLMessage_Header_0_Sender_0.AddSubID( FIXMLMessage_Header_0_Sender_0_SubID_1 );
  		
FIXMLMessage_Header_0.AddSender( FIXMLMessage_Header_0_Sender_0 );
  		
Target FIXMLMessage_Header_0_Target_1= new Target();
CompID FIXMLMessage_Header_0_Target_1_CompID_0= new CompID();
FIXMLMessage_Header_0_Target_1.AddCompID( FIXMLMessage_Header_0_Target_1_CompID_0 );
  		
SubID FIXMLMessage_Header_0_Target_1_SubID_1= new SubID("50", "57", "116", "129");
FIXMLMessage_Header_0_Target_1.AddSubID( FIXMLMessage_Header_0_Target_1_SubID_1 );
  		
FIXMLMessage_Header_0.AddTarget( FIXMLMessage_Header_0_Target_1 );
  		
SendingTime FIXMLMessage_Header_0_SendingTime_2= new SendingTime();
FIXMLMessage_Header_0.AddSendingTime( FIXMLMessage_Header_0_SendingTime_2 );
  		
this.AddHeader( FIXMLMessage_Header_0 );
  		
ApplicationMessage FIXMLMessage_ApplicationMessage_1= new ApplicationMessage();
Order FIXMLMessage_ApplicationMessage_1_Order_0= new Order();
ClOrdID FIXMLMessage_ApplicationMessage_1_Order_0_ClOrdID_0= new ClOrdID();
FIXMLMessage_ApplicationMessage_1_Order_0.AddClOrdID( FIXMLMessage_ApplicationMessage_1_Order_0_ClOrdID_0 );
  		
HandInst FIXMLMessage_ApplicationMessage_1_Order_0_HandInst_1= new HandInst();
FIXMLMessage_ApplicationMessage_1_Order_0.AddHandInst( FIXMLMessage_ApplicationMessage_1_Order_0_HandInst_1 );
  		
Instrument FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2= new Instrument();
Symbol FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_Symbol_0= new Symbol();
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2.AddSymbol( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_Symbol_0 );
  		
SecurityType FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1= new SecurityType();
Equity FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1_Equity_0= new Equity();
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1.AddEquity( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1_Equity_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2.AddSecurityType( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.AddInstrument( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2 );
  		
Side FIXMLMessage_ApplicationMessage_1_Order_0_Side_3= new Side();
FIXMLMessage_ApplicationMessage_1_Order_0.AddSide( FIXMLMessage_ApplicationMessage_1_Order_0_Side_3 );
  		
TransactTime FIXMLMessage_ApplicationMessage_1_Order_0_TransactTime_4= new TransactTime();
FIXMLMessage_ApplicationMessage_1_Order_0.AddTransactTime( FIXMLMessage_ApplicationMessage_1_Order_0_TransactTime_4 );
  		
OrderQuantity FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5= new OrderQuantity();
OrderQty FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5_OrderQty_0= new OrderQty();
FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5.AddOrderQty( FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5_OrderQty_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.AddOrderQuantity( FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5 );
  		
OrderType FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6= new OrderType();
LimitOrder FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0= new LimitOrder();
Price FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0.AddPrice( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0_Price_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6.AddLimitOrder( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.AddOrderType( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6 );
  		
Currency FIXMLMessage_ApplicationMessage_1_Order_0_Currency_7= new Currency();
FIXMLMessage_ApplicationMessage_1_Order_0.AddCurrency( FIXMLMessage_ApplicationMessage_1_Order_0_Currency_7 );
  		
OrderDuration FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8= new OrderDuration();
TimeInForce FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8_TimeInForce_0= new TimeInForce();
FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8.AddTimeInForce( FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8_TimeInForce_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.AddOrderDuration( FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8 );
  		
Rule80A FIXMLMessage_ApplicationMessage_1_Order_0_Rule80A_9= new Rule80A("A", "47", "char");
FIXMLMessage_ApplicationMessage_1_Order_0.AddRule80A( FIXMLMessage_ApplicationMessage_1_Order_0_Rule80A_9 );
  		
FIXMLMessage_ApplicationMessage_1.AddOrder( FIXMLMessage_ApplicationMessage_1_Order_0 );
  		
this.AddApplicationMessage( FIXMLMessage_ApplicationMessage_1 );
  		
 
  }
    
  public FIXMLMessage (  ) {
  
  }
  
  public void AddHeader( Header child ) {
    this._Headers.Add( child );
  }
  
  public void AddApplicationMessage( ApplicationMessage child ) {
    this._ApplicationMessages.Add( child );
  }
  

} 