package com.epam.TDD_Junit_task;

public class RemoveA
{
   public String delete(String s) {
	  String s1= "";
	  String s2= "";
	  int len=s.length();
	  char one = s.charAt(0);
	  char two = s.charAt(1);
	  if(len>0) {
		  if(one=='A') {
			  s1=s1+s.substring(1,len);
			  if(two=='A') {
				  s2=s2+s.substring(2,len);
				  s1=s2;
			  }
		  }
		  else if(two=='A') {
			  s1=one+s.substring(2,len);
		  }
		  else {
			  s1=s1+s;
		  }
	  }
	 
	  return s1;
	   
   }
}
