
using System.Collections.Generic;
// Class for tag OrderType
class OrderType {


	List<LimitOrder> _LimitOrders = new List<LimitOrder>();
	
	// default constructor
	
	public OrderType ( ) {   
		;
		
		LimitOrder OrderType_LimitOrder= new LimitOrder("2");
		Price OrderType_LimitOrder_Price= new Price();
		OrderType_LimitOrder.AddPrice( OrderType_LimitOrder_Price );
		
		this.AddLimitOrder( OrderType_LimitOrder );
		
		
	}
	
	public OrderType (  ) {
	
	}
	
	public void AddLimitOrder( LimitOrder child ) {
		this._LimitOrders.Add( child );
	}
	
	
} 