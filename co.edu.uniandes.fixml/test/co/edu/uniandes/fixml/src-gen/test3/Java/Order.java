package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Order
public class Order {


  List<ClOrdID> ClOrdIDs = new ArrayList<ClOrdID>();
  List<HandInst> HandInsts = new ArrayList<HandInst>();
  List<MinQty> MinQtys = new ArrayList<MinQty>();
  List<Instrument> Instruments = new ArrayList<Instrument>();
  List<Side> Sides = new ArrayList<Side>();
  List<TransactTime> TransactTimes = new ArrayList<TransactTime>();
  List<OrderQuantity> OrderQuantitys = new ArrayList<OrderQuantity>();
  List<OrderType> OrderTypes = new ArrayList<OrderType>();
  List<Currency> Currencys = new ArrayList<Currency>();
  List<Rule80A> Rule80As = new ArrayList<Rule80A>();



  public Order ( ) {   
  
;
  
ClOrdID Order_ClOrdID_0= new ClOrdID();
this.addClOrdID( Order_ClOrdID_0 );
  		
HandInst Order_HandInst_1= new HandInst();
this.addHandInst( Order_HandInst_1 );
  		
MinQty Order_MinQty_2= new MinQty();
this.addMinQty( Order_MinQty_2 );
  		
Instrument Order_Instrument_3= new Instrument();
Symbol Order_Instrument_3_Symbol_0= new Symbol();
Order_Instrument_3.addSymbol( Order_Instrument_3_Symbol_0 );
  		
IDSource Order_Instrument_3_IDSource_1= new IDSource();
Order_Instrument_3.addIDSource( Order_Instrument_3_IDSource_1 );
  		
SecurityID Order_Instrument_3_SecurityID_2= new SecurityID();
Order_Instrument_3.addSecurityID( Order_Instrument_3_SecurityID_2 );
  		
this.addInstrument( Order_Instrument_3 );
  		
Side Order_Side_4= new Side();
this.addSide( Order_Side_4 );
  		
TransactTime Order_TransactTime_5= new TransactTime();
this.addTransactTime( Order_TransactTime_5 );
  		
OrderQuantity Order_OrderQuantity_6= new OrderQuantity();
OrderQty Order_OrderQuantity_6_OrderQty_0= new OrderQty();
Order_OrderQuantity_6.addOrderQty( Order_OrderQuantity_6_OrderQty_0 );
  		
this.addOrderQuantity( Order_OrderQuantity_6 );
  		
OrderType Order_OrderType_7= new OrderType();
LimitOrder Order_OrderType_7_LimitOrder_0= new LimitOrder();
Price Order_OrderType_7_LimitOrder_0_Price_0= new Price();
Order_OrderType_7_LimitOrder_0.addPrice( Order_OrderType_7_LimitOrder_0_Price_0 );
  		
Order_OrderType_7.addLimitOrder( Order_OrderType_7_LimitOrder_0 );
  		
this.addOrderType( Order_OrderType_7 );
  		
Currency Order_Currency_8= new Currency();
this.addCurrency( Order_Currency_8 );
  		
Rule80A Order_Rule80A_9= new Rule80A("A");
this.addRule80A( Order_Rule80A_9 );
  		
  }
      
  public void addClOrdID( ClOrdID child ) {
    this.ClOrdIDs.add( child );
  }
  public void addHandInst( HandInst child ) {
    this.HandInsts.add( child );
  }
  public void addMinQty( MinQty child ) {
    this.MinQtys.add( child );
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
  public void addRule80A( Rule80A child ) {
    this.Rule80As.add( child );
  }

} 