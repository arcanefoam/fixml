namespace text2.xml;

using System.Collections.Generic;

// Class for tag Pty
class Pty {

	string ID;
	string R;
	
	List<Sub> Subs = new List<Sub>();
	
	// default constructor
	
	Pty ( ) {   
		this.ID = "OCC";
		this.R = "21";
		
		
	}
	
	Pty ( String ID, String R ) {
		this.ID = ID;
		this.R = R;
		
	}
	
	AddSub( Sub child ) {
		this.Subs.Add( child );
	}
	
	
} 