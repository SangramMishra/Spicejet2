package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class VerifyOrigons_WebTable {
	public WebDriver driver;
  @Test
  public void f() {
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
String loc=".//*[@id='citydropdown']/tbody/tr[2]/td[2]";
String str=driver.findElement(By.xpath(loc)).getText();
System.out.println(str);
	String s[]=str.split("\n");
	System.out.println(s.length);
	for(int i=0; i<s.length; i++)
	{
		if(s[i].equalsIgnoreCase("Hyderabad (HYD)"))
		{
		System.out.println(s[i]);
		driver.findElement(By.linkText(s[i])).click();
		}
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
