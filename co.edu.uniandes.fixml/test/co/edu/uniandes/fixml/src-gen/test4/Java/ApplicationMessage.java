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
  		
Instrument ApplicationMessage_Order_0_Instrument_2= new Instrument();
Symbol ApplicationMessage_Order_0_Instrument_2_Symbol_0= new Symbol();
ApplicationMessage_Order_0_Instrument_2.addSymbol( ApplicationMessage_Order_0_Instrument_2_Symbol_0 );
  		
SecurityType ApplicationMessage_Order_0_Instrument_2_SecurityType_1= new SecurityType();
Equity ApplicationMessage_Order_0_Instrument_2_SecurityType_1_Equity_0= new Equity();
ApplicationMessage_Order_0_Instrument_2_SecurityType_1.addEquity( ApplicationMessage_Order_0_Instrument_2_SecurityType_1_Equity_0 );
  		
ApplicationMessage_Order_0_Instrument_2.addSecurityType( ApplicationMessage_Order_0_Instrument_2_SecurityType_1 );
  		
ApplicationMessage_Order_0.addInstrument( ApplicationMessage_Order_0_Instrument_2 );
  		
Side ApplicationMessage_Order_0_Side_3= new Side();
ApplicationMessage_Order_0.addSide( ApplicationMessage_Order_0_Side_3 );
  		
TransactTime ApplicationMessage_Order_0_TransactTime_4= new TransactTime();
ApplicationMessage_Order_0.addTransactTime( ApplicationMessage_Order_0_TransactTime_4 );
  		
OrderQuantity ApplicationMessage_Order_0_OrderQuantity_5= new OrderQuantity();
OrderQty ApplicationMessage_Order_0_OrderQuantity_5_OrderQty_0= new OrderQty();
ApplicationMessage_Order_0_OrderQuantity_5.addOrderQty( ApplicationMessage_Order_0_OrderQuantity_5_OrderQty_0 );
  		
ApplicationMessage_Order_0.addOrderQuantity( ApplicationMessage_Order_0_OrderQuantity_5 );
  		
OrderType ApplicationMessage_Order_0_OrderType_6= new OrderType();
LimitOrder ApplicationMessage_Order_0_OrderType_6_LimitOrder_0= new LimitOrder();
Price ApplicationMessage_Order_0_OrderType_6_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
ApplicationMessage_Order_0_OrderType_6_LimitOrder_0.addPrice( ApplicationMessage_Order_0_OrderType_6_LimitOrder_0_Price_0 );
  		
ApplicationMessage_Order_0_OrderType_6.addLimitOrder( ApplicationMessage_Order_0_OrderType_6_LimitOrder_0 );
  		
ApplicationMessage_Order_0.addOrderType( ApplicationMessage_Order_0_OrderType_6 );
  		
Currency ApplicationMessage_Order_0_Currency_7= new Currency();
ApplicationMessage_Order_0.addCurrency( ApplicationMessage_Order_0_Currency_7 );
  		
OrderDuration ApplicationMessage_Order_0_OrderDuration_8= new OrderDuration();
TimeInForce ApplicationMessage_Order_0_OrderDuration_8_TimeInForce_0= new TimeInForce();
ApplicationMessage_Order_0_OrderDuration_8.addTimeInForce( ApplicationMessage_Order_0_OrderDuration_8_TimeInForce_0 );
  		
ApplicationMessage_Order_0.addOrderDuration( ApplicationMessage_Order_0_OrderDuration_8 );
  		
Rule80A ApplicationMessage_Order_0_Rule80A_9= new Rule80A("A", "47", "char");
ApplicationMessage_Order_0.addRule80A( ApplicationMessage_Order_0_Rule80A_9 );
  		
this.addOrder( ApplicationMessage_Order_0 );
  		
  }
      
  public void addOrder( Order child ) {
    this.Orders.add( child );
  }

} 