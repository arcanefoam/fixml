
using System.Collections.Generic;
// Class for tag FIXML
class FIXML {


	List<PosRpt> _PosRpts = new List<PosRpt>();
	
	// default constructor
	
	public FIXML ( ) {   
		;
		
		PosRpt FIXML_PosRpt= new PosRpt("1", "1", "2003-09-10T00:00:00", "USD", "0.00", "0", "541386431", "0", "0.00", "1");
		Hdr FIXML_PosRpt_Hdr= new Hdr("N", "N", "1002", "2001-12-17T09:30:47-05:00");
		Sndr FIXML_PosRpt_Hdr_Sndr= new Sndr("String", "String", "String");
		FIXML_PosRpt_Hdr.AddSndr( FIXML_PosRpt_Hdr_Sndr );
		
		Tgt FIXML_PosRpt_Hdr_Tgt= new Tgt("String", "String", "String");
		FIXML_PosRpt_Hdr.AddTgt( FIXML_PosRpt_Hdr_Tgt );
		
		OnBhlfOf FIXML_PosRpt_Hdr_OnBhlfOf= new OnBhlfOf("String", "String", "String");
		FIXML_PosRpt_Hdr.AddOnBhlfOf( FIXML_PosRpt_Hdr_OnBhlfOf );
		
		DlvrTo FIXML_PosRpt_Hdr_DlvrTo= new DlvrTo("String", "String", "String");
		FIXML_PosRpt_Hdr.AddDlvrTo( FIXML_PosRpt_Hdr_DlvrTo );
		
		FIXML_PosRpt.AddHdr( FIXML_PosRpt_Hdr );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Pty FIXML_PosRpt_Pty= new Pty("OCC", "21");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("99999", "4");
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Pty FIXML_PosRpt_Pty= new Pty("C", "38");
		Sub FIXML_PosRpt_Pty_Sub= new Sub("ZZZ", "2");
		FIXML_PosRpt_Pty.AddSub( FIXML_PosRpt_Pty_Sub );
		
		FIXML_PosRpt.AddPty( FIXML_PosRpt_Pty );
		
		Qty FIXML_PosRpt_Qty= new Qty("35", "0", "SOD");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("20", "10", "FIN");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Qty FIXML_PosRpt_Qty= new Qty("10", null, "IAS");
		FIXML_PosRpt.AddQty( FIXML_PosRpt_Qty );
		
		Amt FIXML_PosRpt_Amt= new Amt("0.00", "FMTM");
		FIXML_PosRpt.AddAmt( FIXML_PosRpt_Amt );
		
		Instrmt FIXML_PosRpt_Instrmt= new Instrmt("OCASPS", "KW", "J", "20031122", "2003-11-22T00:00:00", "100", "47.50", "USD", "AOL");
		FIXML_PosRpt.AddInstrmt( FIXML_PosRpt_Instrmt );
		
		this.AddPosRpt( FIXML_PosRpt );
		
		
	}
	
	public FIXML (  ) {
	
	}
	
	public void AddPosRpt( PosRpt child ) {
		this._PosRpts.Add( child );
	}
	
	
} 