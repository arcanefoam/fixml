package text2.xml;

public class PosRpt {

	private:
  	String RptID;
  	String Rslt;
  	String BizDt;
  	String Acct;
  	String AcctTyp;
  	String SetPx;
  	String SetPxTyp;
  	String PriSetPx;
  	String ReqTyp;
  	String Ccy;

	Hdr* Hdr_1; 
	
	Pty* Pty_1; 
	Pty* Pty_2; 
	Pty* Pty_3; 
	
	Qty* Qty_1; 
	Qty* Qty_2; 
	Qty* Qty_3; 
	
	Amt* Amt_1; 
	
	Instrmt* Instrmt_1; 
	

 	public: 

  	// default constructor
	public PosRpt () {
		RptID = 541386431 ;
	
		Rslt = 0 ;
	
		BizDt = 2003-03-10T00:00:00 ;
	
		Acct = 1 ;
	
		AcctTyp = 1 ;
	
		SetPx = 0.00 ;
	
		SetPxTyp = 1 ;
	
		PriSetPx = 0.00 ;
	
		ReqTyp = 0 ;
	
		Ccy = USD ;
	
    
		
			Hdr Hdr_1 = new Hdr(
						    	"2001-12-17T09:30:47-05:00",
						    	"N",
						    	"N",
						    	"1002",	    
				    new Sndr (	"String",
				    	    	"String",
 						    	"String",
 						),				    		
				    new Tgt (  	"String",
 						    	"String",
 						    	"String",
 						),				    		
				    new OnBhlfOf (	"String",
 							    	"String",
 							    	"String",
 						),				    		
				    new DlvrTo (	"String",
 							    	"String",
 							    	"String",
 						),				    		
			);
		
			Pty Pty_1 = new Pty(
						    	"OCC",
						    	"21",
			
				    
				    new Sub (
							    	"ZZZ",
 
 
 
							    	"2",
 
						),				    		
	
			);
		
			Pty Pty_2 = new Pty(
						    	"99999",
						    	"4",
			
				    
				    new Sub (
							    	"ZZZ",
 
 
 
							    	"2",
 
						),				    		
	
			);
		
			Pty Pty_3 = new Pty(
						    	"C",
						    	"38",
			
				    
				    new Sub (
							    	"ZZZ",
 
 
 
							    	"2",
 
						),				    		
	
			);
		
			Qty Qty_1 = new Qty(
						    	"SOD",
						    	"35",
						    	"0",
			);
		
			Qty Qty_2 = new Qty(
						    	"FIN",
						    	"20",
						    	"10",
			);
		
			Qty Qty_3 = new Qty(
						    	"IAS",
						    	"10",
			);
		
			Amt Amt_1 = new Amt(
						    	"FMTM",
						    	"0.00",
			);
		
			Instrmt Instrmt_1 = new Instrmt(
						    	"AOL",
						    	"KW",
						    	"3",
						    	"OCASPS",
						    	"20031122",
						    	"2003-11-22T00:00:00",
						    	"47.50",
						    	"USD",
						    	"100",
			);
  	}
  
  	// by parameters
  	public PosRpt (
	  String RptID_, String Rslt_, String BizDt_, String Acct_, String AcctTyp_, String SetPx_, String SetPxTyp_, String PriSetPx_, String ReqTyp_, String Ccy_, 
			Hdr* Hdr_1,
			Pty* Pty_1,
			Pty* Pty_2,
			Pty* Pty_3,
			Qty* Qty_1,
			Qty* Qty_2,
			Qty* Qty_3,
			Amt* Amt_1,
			Instrmt* Instrmt_1,
  	){
	  
	  RptID = RptID_;
		Rslt = Rslt_;
		BizDt = BizDt_;
		Acct = Acct_;
		AcctTyp = AcctTyp_;
		SetPx = SetPx_;
		SetPxTyp = SetPxTyp_;
		PriSetPx = PriSetPx_;
		ReqTyp = ReqTyp_;
		Ccy = Ccy_;
	  
		this.Hdr_1 = Hdr_1;
	
		this.Pty_1 = Pty_1;
		this.Pty_2 = Pty_2;
		this.Pty_3 = Pty_3;
	
		this.Qty_1 = Qty_1;
		this.Qty_2 = Qty_2;
		this.Qty_3 = Qty_3;
	
		this.Amt_1 = Amt_1;
	
		this.Instrmt_1 = Instrmt_1;
	
  }
} 