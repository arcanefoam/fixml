package text2.xml;

import java.util.List;
import java.util.ArrayList;

// Class for tag Pty
public class Pty {

	String ID;
	String R;
	
	List<Sub> Subs = new ArrayList<Sub>();
	
	// default constructor
	public Pty ( String ID, String R ) {
		this.ID = ID;
		this.R = R;
		
	}
	
	
	public Pty ( ) {   
	
		this.ID = "OCC";
		this.R = "21";
		
	}
	
	public void addSub( Sub child ) {
		this.Subs.add( child );
	}
	
} 