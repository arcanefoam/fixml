package object;

import java.util.List;
import java.util.ArrayList;

// Class for tag Pty
public class Pty {

  String R;

  List<Sub> Subs = new ArrayList<Sub>();

  // default constructor
  public Pty ( String R ) {
    this.R = R;
  
  }


  public Pty ( ) {   
  
this.R = "21";
  
  }
      
  public void addSub( Sub child ) {
    this.Subs.add( child );
  }

} 