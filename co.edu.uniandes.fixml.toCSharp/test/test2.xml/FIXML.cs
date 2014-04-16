
using System.Collections.Generic;
// Class for tag FIXML
class FIXML {


	List<PosRpt> _PosRpts = new List<PosRpt>();
	
	// default constructor
	
	public FIXML ( ) {   
		;
		
		PosRpt FIXML_PosRpt_0= new PosRpt("1", "1", "2003-09-10T00:00:00", "USD", "0.00", "0", "541386431", "0", "0.00", "1");
		Hdr FIXML_PosRpt_0_Hdr_0= new Hdr("N", "N", "1002", "2001-12-17T09:30:47-05:00");
		Sndr FIXML_PosRpt_0_Hdr_0_Sndr_0= new Sndr("String", "String", "String");
		FIXML_PosRpt_0_Hdr_0.AddSndr( FIXML_PosRpt_0_Hdr_0_Sndr_0 );
		
		Tgt FIXML_PosRpt_0_Hdr_0_Tgt_1= new Tgt("String", "String", "String");
		FIXML_PosRpt_0_Hdr_0.AddTgt( FIXML_PosRpt_0_Hdr_0_Tgt_1 );
		
		OnBhlfOf FIXML_PosRpt_0_Hdr_0_OnBhlfOf_2= new OnBhlfOf("String", "String", "String");
		FIXML_PosRpt_0_Hdr_0.AddOnBhlfOf( FIXML_PosRpt_0_Hdr_0_OnBhlfOf_2 );
		
		DlvrTo FIXML_PosRpt_0_Hdr_0_DlvrTo_3= new DlvrTo("String", "String", "String");
		FIXML_PosRpt_0_Hdr_0.AddDlvrTo( FIXML_PosRpt_0_Hdr_0_DlvrTo_3 );
		
		FIXML_PosRpt_0.AddHdr( FIXML_PosRpt_0_Hdr_0 );
		
		Pty FIXML_PosRpt_0_Pty_1= new Pty("OCC", "21");
		FIXML_PosRpt_0.AddPty( FIXML_PosRpt_0_Pty_1 );
		
		Pty FIXML_PosRpt_0_Pty_2= new Pty("99999", "4");
		FIXML_PosRpt_0.AddPty( FIXML_PosRpt_0_Pty_2 );
		
		Pty FIXML_PosRpt_0_Pty_3= new Pty("C", "38");
		Sub FIXML_PosRpt_0_Pty_3_Sub_0= new Sub("ZZZ", "2");
		FIXML_PosRpt_0_Pty_3.AddSub( FIXML_PosRpt_0_Pty_3_Sub_0 );
		
		FIXML_PosRpt_0.AddPty( FIXML_PosRpt_0_Pty_3 );
		
		Qty FIXML_PosRpt_0_Qty_4= new Qty("35", "0", "SOD");
		FIXML_PosRpt_0.AddQty( FIXML_PosRpt_0_Qty_4 );
		
		Qty FIXML_PosRpt_0_Qty_5= new Qty("20", "10", "FIN");
		FIXML_PosRpt_0.AddQty( FIXML_PosRpt_0_Qty_5 );
		
		Qty FIXML_PosRpt_0_Qty_6= new Qty("10", null, "IAS");
		FIXML_PosRpt_0.AddQty( FIXML_PosRpt_0_Qty_6 );
		
		Amt FIXML_PosRpt_0_Amt_7= new Amt("0.00", "FMTM");
		FIXML_PosRpt_0.AddAmt( FIXML_PosRpt_0_Amt_7 );
		
		Instrmt FIXML_PosRpt_0_Instrmt_8= new Instrmt("OCASPS", "KW", "J", "20031122", "2003-11-22T00:00:00", "100", "47.50", "USD", "AOL");
		FIXML_PosRpt_0.AddInstrmt( FIXML_PosRpt_0_Instrmt_8 );
		
		this.AddPosRpt( FIXML_PosRpt_0 );
		
		
	}
	
	public FIXML (  ) {
	
	}
	
	public void AddPosRpt( PosRpt child ) {
		this._PosRpts.Add( child );
	}
	
	
} 