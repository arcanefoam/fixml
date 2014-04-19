package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag FIXMLMessage
public class FIXMLMessage {


  List<ApplicationMessage> ApplicationMessages = new ArrayList<ApplicationMessage>();



  public FIXMLMessage ( ) {   
  
;
  
ApplicationMessage FIXMLMessage_ApplicationMessage_0= new ApplicationMessage();
Order FIXMLMessage_ApplicationMessage_0_Order_0= new Order();
ClOrdID FIXMLMessage_ApplicationMessage_0_Order_0_ClOrdID_0= new ClOrdID();
FIXMLMessage_ApplicationMessage_0_Order_0.addClOrdID( FIXMLMessage_ApplicationMessage_0_Order_0_ClOrdID_0 );
  		
HandInst FIXMLMessage_ApplicationMessage_0_Order_0_HandInst_1= new HandInst();
FIXMLMessage_ApplicationMessage_0_Order_0.addHandInst( FIXMLMessage_ApplicationMessage_0_Order_0_HandInst_1 );
  		
MinQty FIXMLMessage_ApplicationMessage_0_Order_0_MinQty_2= new MinQty();
FIXMLMessage_ApplicationMessage_0_Order_0.addMinQty( FIXMLMessage_ApplicationMessage_0_Order_0_MinQty_2 );
  		
Instrument FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3= new Instrument();
Symbol FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_Symbol_0= new Symbol();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.addSymbol( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_Symbol_0 );
  		
IDSource FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_IDSource_1= new IDSource();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.addIDSource( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_IDSource_1 );
  		
SecurityID FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_SecurityID_2= new SecurityID();
FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3.addSecurityID( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3_SecurityID_2 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.addInstrument( FIXMLMessage_ApplicationMessage_0_Order_0_Instrument_3 );
  		
Side FIXMLMessage_ApplicationMessage_0_Order_0_Side_4= new Side();
FIXMLMessage_ApplicationMessage_0_Order_0.addSide( FIXMLMessage_ApplicationMessage_0_Order_0_Side_4 );
  		
TransactTime FIXMLMessage_ApplicationMessage_0_Order_0_TransactTime_5= new TransactTime();
FIXMLMessage_ApplicationMessage_0_Order_0.addTransactTime( FIXMLMessage_ApplicationMessage_0_Order_0_TransactTime_5 );
  		
OrderQuantity FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6= new OrderQuantity();
OrderQty FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6_OrderQty_0= new OrderQty();
FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6.addOrderQty( FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6_OrderQty_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.addOrderQuantity( FIXMLMessage_ApplicationMessage_0_Order_0_OrderQuantity_6 );
  		
OrderType FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7= new OrderType();
LimitOrder FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0= new LimitOrder();
Price FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0_Price_0= new Price();
FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0.addPrice( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0_Price_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7.addLimitOrder( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7_LimitOrder_0 );
  		
FIXMLMessage_ApplicationMessage_0_Order_0.addOrderType( FIXMLMessage_ApplicationMessage_0_Order_0_OrderType_7 );
  		
Currency FIXMLMessage_ApplicationMessage_0_Order_0_Currency_8= new Currency();
FIXMLMessage_ApplicationMessage_0_Order_0.addCurrency( FIXMLMessage_ApplicationMessage_0_Order_0_Currency_8 );
  		
Rule80A FIXMLMessage_ApplicationMessage_0_Order_0_Rule80A_9= new Rule80A("A");
FIXMLMessage_ApplicationMessage_0_Order_0.addRule80A( FIXMLMessage_ApplicationMessage_0_Order_0_Rule80A_9 );
  		
FIXMLMessage_ApplicationMessage_0.addOrder( FIXMLMessage_ApplicationMessage_0_Order_0 );
  		
this.addApplicationMessage( FIXMLMessage_ApplicationMessage_0 );
  		
  }
      
  public void addApplicationMessage( ApplicationMessage child ) {
    this.ApplicationMessages.add( child );
  }

} 