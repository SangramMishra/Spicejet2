package spicejet_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HMS_PrintDisplayNames_WebTables {
	public WebDriver driver;
	public void login(){
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
	}	
	public void registration() throws Exception{
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Permanent Registration")).click();
	}
  @Test
  public void printDisplayNames() {
	  String str;
	  String loc=".//*[@id='form1']/div[1]/table";
	  str=driver.findElement(By.xpath(loc)).getText();
	  //System.out.println(str);
	String s[]=str.split("\n");
	System.out.println(s.length);
	for(int i=0; i<s.length; i++)
	{
		//Nested If
		if(s[i].contains("*"))
		{
			if(s[i].equalsIgnoreCase("Last Name*"))
			{
				System.out.println(s[i]);
			}
			else if(s[i].equalsIgnoreCase("Gender*"))
			{
				System.out.println(s[i]);
			}
		}
	}
	  
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
		driver= new FirefoxDriver();
		driver.get("http://selenium4testing.com/hms/");
		  login();
		  registration();
  }

  @AfterTest
  public void afterTest() {
  }

}


