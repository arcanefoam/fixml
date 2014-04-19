
using System.Collections.Generic;
// Class for tag Pty
class Pty {

  string _R;

  List<Sub> _Subs = new List<Sub>();

  // default constructor

  public Pty ( ) {   
this._R = "21";
  
 
  }
    
  public Pty ( string R ) {
    this._R = R;
  
  }
  
  public void AddSub( Sub child ) {
    this._Subs.Add( child );
  }
  

} 