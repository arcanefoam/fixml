package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Order
public class Order {


  List<ClOrdID> ClOrdIDs = new ArrayList<ClOrdID>();
  List<HandInst> HandInsts = new ArrayList<HandInst>();
  List<Instrument> Instruments = new ArrayList<Instrument>();
  List<Side> Sides = new ArrayList<Side>();
  List<TransactTime> TransactTimes = new ArrayList<TransactTime>();
  List<OrderQuantity> OrderQuantitys = new ArrayList<OrderQuantity>();
  List<OrderType> OrderTypes = new ArrayList<OrderType>();
  List<Currency> Currencys = new ArrayList<Currency>();
  List<OrderDuration> OrderDurations = new ArrayList<OrderDuration>();
  List<Rule80A> Rule80As = new ArrayList<Rule80A>();



  public Order ( ) {   
  
;
  
ClOrdID Order_ClOrdID_0= new ClOrdID();
this.addClOrdID( Order_ClOrdID_0 );
  		
HandInst Order_HandInst_1= new HandInst();
this.addHandInst( Order_HandInst_1 );
  		
Instrument Order_Instrument_2= new Instrument();
Symbol Order_Instrument_2_Symbol_0= new Symbol();
Order_Instrument_2.addSymbol( Order_Instrument_2_Symbol_0 );
  		
SecurityType Order_Instrument_2_SecurityType_1= new SecurityType();
Equity Order_Instrument_2_SecurityType_1_Equity_0= new Equity();
Order_Instrument_2_SecurityType_1.addEquity( Order_Instrument_2_SecurityType_1_Equity_0 );
  		
Order_Instrument_2.addSecurityType( Order_Instrument_2_SecurityType_1 );
  		
this.addInstrument( Order_Instrument_2 );
  		
Side Order_Side_3= new Side();
this.addSide( Order_Side_3 );
  		
TransactTime Order_TransactTime_4= new TransactTime();
this.addTransactTime( Order_TransactTime_4 );
  		
OrderQuantity Order_OrderQuantity_5= new OrderQuantity();
OrderQty Order_OrderQuantity_5_OrderQty_0= new OrderQty();
Order_OrderQuantity_5.addOrderQty( Order_OrderQuantity_5_OrderQty_0 );
  		
this.addOrderQuantity( Order_OrderQuantity_5 );
  		
OrderType Order_OrderType_6= new OrderType();
LimitOrder Order_OrderType_6_LimitOrder_0= new LimitOrder();
Price Order_OrderType_6_LimitOrder_0_Price_0= new Price("0", "99999999.9999");
Order_OrderType_6_LimitOrder_0.addPrice( Order_OrderType_6_LimitOrder_0_Price_0 );
  		
Order_OrderType_6.addLimitOrder( Order_OrderType_6_LimitOrder_0 );
  		
this.addOrderType( Order_OrderType_6 );
  		
Currency Order_Currency_7= new Currency();
this.addCurrency( Order_Currency_7 );
  		
OrderDuration Order_OrderDuration_8= new OrderDuration();
TimeInForce Order_OrderDuration_8_TimeInForce_0= new TimeInForce();
Order_OrderDuration_8.addTimeInForce( Order_OrderDuration_8_TimeInForce_0 );
  		
this.addOrderDuration( Order_OrderDuration_8 );
  		
Rule80A Order_Rule80A_9= new Rule80A("A", "47", "char");
this.addRule80A( Order_Rule80A_9 );
  		
  }
      
  public void addClOrdID( ClOrdID child ) {
    this.ClOrdIDs.add( child );
  }
  public void addHandInst( HandInst child ) {
    this.HandInsts.add( child );
  }
  public void addInstrument( Instrument child ) {
    this.Instruments.add( child );
  }
  public void addSide( Side child ) {
    this.Sides.add( child );
  }
  public void addTransactTime( TransactTime child ) {
    this.TransactTimes.add( child );
  }
  public void addOrderQuantity( OrderQuantity child ) {
    this.OrderQuantitys.add( child );
  }
  public void addOrderType( OrderType child ) {
    this.OrderTypes.add( child );
  }
  public void addCurrency( Currency child ) {
    this.Currencys.add( child );
  }
  public void addOrderDuration( OrderDuration child ) {
    this.OrderDurations.add( child );
  }
  public void addRule80A( Rule80A child ) {
    this.Rule80As.add( child );
  }

} 