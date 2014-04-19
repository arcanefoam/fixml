package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag ApplicationMessage
public class ApplicationMessage {


  List<Order> Orders = new ArrayList<Order>();



  public ApplicationMessage ( ) {   
  
;
  
Order ApplicationMessage_Order_0= new Order();
ClOrdID ApplicationMessage_Order_0_ClOrdID_0= new ClOrdID();
ApplicationMessage_Order_0.addClOrdID( ApplicationMessage_Order_0_ClOrdID_0 );
  		
HandInst ApplicationMessage_Order_0_HandInst_1= new HandInst();
ApplicationMessage_Order_0.addHandInst( ApplicationMessage_Order_0_HandInst_1 );
  		
MinQty ApplicationMessage_Order_0_MinQty_2= new MinQty();
ApplicationMessage_Order_0.addMinQty( ApplicationMessage_Order_0_MinQty_2 );
  		
Instrument ApplicationMessage_Order_0_Instrument_3= new Instrument();
Symbol ApplicationMessage_Order_0_Instrument_3_Symbol_0= new Symbol();
ApplicationMessage_Order_0_Instrument_3.addSymbol( ApplicationMessage_Order_0_Instrument_3_Symbol_0 );
  		
IDSource ApplicationMessage_Order_0_Instrument_3_IDSource_1= new IDSource();
ApplicationMessage_Order_0_Instrument_3.addIDSource( ApplicationMessage_Order_0_Instrument_3_IDSource_1 );
  		
SecurityID ApplicationMessage_Order_0_Instrument_3_SecurityID_2= new SecurityID();
ApplicationMessage_Order_0_Instrument_3.addSecurityID( ApplicationMessage_Order_0_Instrument_3_SecurityID_2 );
  		
ApplicationMessage_Order_0.addInstrument( ApplicationMessage_Order_0_Instrument_3 );
  		
Side ApplicationMessage_Order_0_Side_4= new Side();
ApplicationMessage_Order_0.addSide( ApplicationMessage_Order_0_Side_4 );
  		
TransactTime ApplicationMessage_Order_0_TransactTime_5= new TransactTime();
ApplicationMessage_Order_0.addTransactTime( ApplicationMessage_Order_0_TransactTime_5 );
  		
OrderQuantity ApplicationMessage_Order_0_OrderQuantity_6= new OrderQuantity();
OrderQty ApplicationMessage_Order_0_OrderQuantity_6_OrderQty_0= new OrderQty();
ApplicationMessage_Order_0_OrderQuantity_6.addOrderQty( ApplicationMessage_Order_0_OrderQuantity_6_OrderQty_0 );
  		
ApplicationMessage_Order_0.addOrderQuantity( ApplicationMessage_Order_0_OrderQuantity_6 );
  		
OrderType ApplicationMessage_Order_0_OrderType_7= new OrderType();
LimitOrder ApplicationMessage_Order_0_OrderType_7_LimitOrder_0= new LimitOrder();
Price ApplicationMessage_Order_0_OrderType_7_LimitOrder_0_Price_0= new Price();
ApplicationMessage_Order_0_OrderType_7_LimitOrder_0.addPrice( ApplicationMessage_Order_0_OrderType_7_LimitOrder_0_Price_0 );
  		
ApplicationMessage_Order_0_OrderType_7.addLimitOrder( ApplicationMessage_Order_0_OrderType_7_LimitOrder_0 );
  		
ApplicationMessage_Order_0.addOrderType( ApplicationMessage_Order_0_OrderType_7 );
  		
Currency ApplicationMessage_Order_0_Currency_8= new Currency();
ApplicationMessage_Order_0.addCurrency( ApplicationMessage_Order_0_Currency_8 );
  		
Rule80A ApplicationMessage_Order_0_Rule80A_9= new Rule80A("A");
ApplicationMessage_Order_0.addRule80A( ApplicationMessage_Order_0_Rule80A_9 );
  		
this.addOrder( ApplicationMessage_Order_0 );
  		
  }
      
  public void addOrder( Order child ) {
    this.Orders.add( child );
  }

} 