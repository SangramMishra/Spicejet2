package spicejet_testNG;


import org.testng.annotations.Test;

public class StringSplits {
  @Test
  public void f() {
/*	  String s1[];
	  int k[];
	  char c[];
	  Object o[];*/
	  
	  String str="one,two,three,four";
	   String[] s=str.split(",");
	  System.out.println(s.length);
	  
	  for(int i=0; i<s.length; i++)
	  {
		  if(s[i].equalsIgnoreCase("three"))
		  {
		  System.out.println(s[i]);
		  }
	  }
	  
  }
}




