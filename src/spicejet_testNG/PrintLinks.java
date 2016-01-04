package spicejet_testNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class PrintLinks {
	public WebDriver driver;
  @Test
  public void printAllLinks() {	  
	/*  List<String> s1=new ArrayList<String>();  //list
	  String s[]=new String[15]; //String array
	  WebElement s2;*/	  
	 List<WebElement> str=driver.findElements(By.tagName("a"));
	 System.out.println(str.size());
	 for(int i=0; i<str.size(); i++)
	 {
		 if(!str.get(i).getText().equalsIgnoreCase(""))
		 {
		 System.out.println(str.get(i).getText()); //str[i]
		 }
	 }	 
  }
  @BeforeTest
  public void beforeTest() {	
	  driver=new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.findElement(By.linkText("Desktop Site")).click();
	//	driver.findElement(By.id("closediv")).click();
  }

}
