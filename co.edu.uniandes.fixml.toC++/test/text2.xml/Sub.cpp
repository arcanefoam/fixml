package text2.xml;

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

public class Sub {

	private:
  	String ID;
  	String Typ;
 	
 	public: 

  	// default constructor
	public Sub () {
		ID = "ZZZ";
		Typ = "2";
  	
  	}
  
  	// by parameters
  	public Sub (		String ID_, String Typ_){
	  
		ID = ID_;
		Typ = Typ_;
	  
  }
} 