package text2.xml;

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

public class Sndr {

	private:
  	String ID;
  	String Sub;
  	String Loc;
 	
 	public: 

  	// default constructor
	public Sndr () {
		ID = "String";
		Sub = "String";
		Loc = "String";
  	
  	}
  
  	// by parameters
  	public Sndr (		String ID_, String Sub_, String Loc_){
	  
		ID = ID_;
		Sub = Sub_;
		Loc = Loc_;
	  
  }
} 