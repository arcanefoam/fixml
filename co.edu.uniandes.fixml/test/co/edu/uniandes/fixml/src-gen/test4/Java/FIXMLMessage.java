package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag FIXMLMessage
public class FIXMLMessage {


  List<Header> Headers = new ArrayList<Header>();
  List<ApplicationMessage> ApplicationMessages = new ArrayList<ApplicationMessage>();



  public FIXMLMessage ( ) {   
  
;
  
Header FIXMLMessage_Header_0= new Header();
Sender FIXMLMessage_Header_0_Sender_0= new Sender();
CompID FIXMLMessage_Header_0_Sender_0_CompID_0= new CompID();
FIXMLMessage_Header_0_Sender_0.addCompID( FIXMLMessage_Header_0_Sender_0_CompID_0 );
  		
SubID FIXMLMessage_Header_0_Sender_0_SubID_1= new SubID("50", "57", "116", "129");
FIXMLMessage_Header_0_Sender_0.addSubID( FIXMLMessage_Header_0_Sender_0_SubID_1 );
  		
FIXMLMessage_Header_0.addSender( FIXMLMessage_Header_0_Sender_0 );
  		
Target FIXMLMessage_Header_0_Target_1= new Target();
CompID FIXMLMessage_Header_0_Target_1_CompID_0= new CompID();
FIXMLMessage_Header_0_Target_1.addCompID( FIXMLMessage_Header_0_Target_1_CompID_0 );
  		
SubID FIXMLMessage_Header_0_Target_1_SubID_1= new SubID("50", "57", "116", "129");
FIXMLMessage_Header_0_Target_1.addSubID( FIXMLMessage_Header_0_Target_1_SubID_1 );
  		
FIXMLMessage_Header_0.addTarget( FIXMLMessage_Header_0_Target_1 );
  		
SendingTime FIXMLMessage_Header_0_SendingTime_2= new SendingTime();
FIXMLMessage_Header_0.addSendingTime( FIXMLMessage_Header_0_SendingTime_2 );
  		
this.addHeader( FIXMLMessage_Header_0 );
  		
ApplicationMessage FIXMLMessage_ApplicationMessage_1= new ApplicationMessage();
Order FIXMLMessage_ApplicationMessage_1_Order_0= new Order();
ClOrdID FIXMLMessage_ApplicationMessage_1_Order_0_ClOrdID_0= new ClOrdID();
FIXMLMessage_ApplicationMessage_1_Order_0.addClOrdID( FIXMLMessage_ApplicationMessage_1_Order_0_ClOrdID_0 );
  		
HandInst FIXMLMessage_ApplicationMessage_1_Order_0_HandInst_1= new HandInst();
FIXMLMessage_ApplicationMessage_1_Order_0.addHandInst( FIXMLMessage_ApplicationMessage_1_Order_0_HandInst_1 );
  		
Instrument FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2= new Instrument();
Symbol FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_Symbol_0= new Symbol();
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2.addSymbol( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_Symbol_0 );
  		
SecurityType FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1= new SecurityType();
Equity FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1_Equity_0= new Equity();
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1.addEquity( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1_Equity_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2.addSecurityType( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2_SecurityType_1 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.addInstrument( FIXMLMessage_ApplicationMessage_1_Order_0_Instrument_2 );
  		
Side FIXMLMessage_ApplicationMessage_1_Order_0_Side_3= new Side();
FIXMLMessage_ApplicationMessage_1_Order_0.addSide( FIXMLMessage_ApplicationMessage_1_Order_0_Side_3 );
  		
TransactTime FIXMLMessage_ApplicationMessage_1_Order_0_TransactTime_4= new TransactTime();
FIXMLMessage_ApplicationMessage_1_Order_0.addTransactTime( FIXMLMessage_ApplicationMessage_1_Order_0_TransactTime_4 );
  		
OrderQuantity FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5= new OrderQuantity();
OrderQty FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5_OrderQty_0= new OrderQty();
FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5.addOrderQty( FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5_OrderQty_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.addOrderQuantity( FIXMLMessage_ApplicationMessage_1_Order_0_OrderQuantity_5 );
  		
OrderType FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6= new OrderType();
LimitOrder FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0= new LimitOrder();
Price FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0.addPrice( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0_Price_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6.addLimitOrder( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6_LimitOrder_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.addOrderType( FIXMLMessage_ApplicationMessage_1_Order_0_OrderType_6 );
  		
Currency FIXMLMessage_ApplicationMessage_1_Order_0_Currency_7= new Currency();
FIXMLMessage_ApplicationMessage_1_Order_0.addCurrency( FIXMLMessage_ApplicationMessage_1_Order_0_Currency_7 );
  		
OrderDuration FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8= new OrderDuration();
TimeInForce FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8_TimeInForce_0= new TimeInForce();
FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8.addTimeInForce( FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8_TimeInForce_0 );
  		
FIXMLMessage_ApplicationMessage_1_Order_0.addOrderDuration( FIXMLMessage_ApplicationMessage_1_Order_0_OrderDuration_8 );
  		
Rule80A FIXMLMessage_ApplicationMessage_1_Order_0_Rule80A_9= new Rule80A("A", "47", "char");
FIXMLMessage_ApplicationMessage_1_Order_0.addRule80A( FIXMLMessage_ApplicationMessage_1_Order_0_Rule80A_9 );
  		
FIXMLMessage_ApplicationMessage_1.addOrder( FIXMLMessage_ApplicationMessage_1_Order_0 );
  		
this.addApplicationMessage( FIXMLMessage_ApplicationMessage_1 );
  		
  }
      
  public void addHeader( Header child ) {
    this.Headers.add( child );
  }
  public void addApplicationMessage( ApplicationMessage child ) {
    this.ApplicationMessages.add( child );
  }

} 