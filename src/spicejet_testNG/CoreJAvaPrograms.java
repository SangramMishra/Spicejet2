package spicejet_testNG;


import org.testng.annotations.Test;

public class CoreJAvaPrograms {
  @Test(enabled=false)
  public void reverseString() {
	  String str="Nagesh";
	  System.out.println(str.length());
	  
	// To print in Normal order
	  for(int i=0; i<str.length(); i++)
	  {
		  System.out.println(str.charAt(i));	  
	  }
	
	// To print in reverse order
	  for(int i=str.length()-1; i >= 0; i--)
	  {
		  System.out.println(str.charAt(i));
	  }	  
  }
  
  @Test(enabled=false)
  public void stringComparisons() {
	  String str="Nagesh";	  
	if(str.equalsIgnoreCase("nagesh"))
	{
		System.out.println("Matching");
	}else{
		System.out.println("Not matching");
	}
	
	if(str.contains("Nag"))
	{
		System.out.println("AVailable");
	}else{
		System.out.println("Not available");
	}	  
  }
  @Test
  public void palindrome() {
	  String str="Madam";
	  String str1 = "";	  
	  for(int i=str.length()-1; i>= 0; i--)
	  {
		  System.out.println(str.charAt(i));
		  str1=str1+str.charAt(i);
	  }	  
	  System.out.println(str1);
	  if(str.equalsIgnoreCase(str1))
	  {
		  System.out.println("Palindrome");
	  }else{
		  System.out.println("Not a palindrome");
	  }	  
  }
}















