package text2.xml;

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

public class Amt {

	private:
  	String Typ;
  	String Amt;
 	
 	public: 

  	// default constructor
	public Amt () {
		Typ = "FMTM";
		Amt = "0.00";
  	
  	}
  
  	// by parameters
  	public Amt (		String Typ_, String Amt_){
	  
		Typ = Typ_;
		Amt = Amt_;
	  
  }
} 