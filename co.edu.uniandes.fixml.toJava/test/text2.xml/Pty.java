package text2.xml;



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
	
	public addSub( Sub child ) {
		this.Subs.add( child );
	}
	
	
	
} 