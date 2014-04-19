#include <iostream> 
 #include "ClOrdID.cpp" 
 #include "HandInst.cpp" 
 #include "MinQty.cpp" 
 #include "Instrument.cpp" 
 #include "Side.cpp" 
 #include "TransactTime.cpp" 
 #include "OrderQuantity.cpp" 
 #include "OrderType.cpp" 
 #include "Currency.cpp" 
 #include "Rule80A.cpp" 

using namespace std;

class Order {

	private:
	ClOrdID* ClOrdID_1;
	HandInst* HandInst_1;
	MinQty* MinQty_1;
	Instrument* Instrument_1;
	Side* Side_1;
	TransactTime* TransactTime_1;
	OrderQuantity* OrderQuantity_1;
	OrderType* OrderType_1;
	Currency* Currency_1;
	Rule80A* Rule80A_1;
 	
 	public: 

  	// default constructor
	Order () {
		ClOrdID_1 = new ClOrdID();
		HandInst_1 = new HandInst();
		MinQty_1 = new MinQty();
		Instrument_1 = new Instrument();
		Side_1 = new Side();
		TransactTime_1 = new TransactTime();
		OrderQuantity_1 = new OrderQuantity();
		OrderType_1 = new OrderType();
		Currency_1 = new Currency();
		Rule80A_1 = new Rule80A();
  	
  	}
  
  	// by parameters
  	Order (		, ClOrdID* ClOrdID_1, HandInst* HandInst_1, MinQty* MinQty_1, Instrument* Instrument_1, Side* Side_1, TransactTime* TransactTime_1, OrderQuantity* OrderQuantity_1, OrderType* OrderType_1, Currency* Currency_1, Rule80A* Rule80A_1){
	  
		;
	  
		this->ClOrdID_1 = ClOrdID_1;
		this->HandInst_1 = HandInst_1;
		this->MinQty_1 = MinQty_1;
		this->Instrument_1 = Instrument_1;
		this->Side_1 = Side_1;
		this->TransactTime_1 = TransactTime_1;
		this->OrderQuantity_1 = OrderQuantity_1;
		this->OrderType_1 = OrderType_1;
		this->Currency_1 = Currency_1;
		this->Rule80A_1 = Rule80A_1;
  	}
};