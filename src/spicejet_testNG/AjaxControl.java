package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class AjaxControl {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  Thread.sleep(1000);
	  String str;
	  String loc=".//*[@id='sbtc']/div[2]/div[2]/div[1]";
str=driver.findElement(By.xpath(loc)).getText();
System.out.println(str);
	String s[]=str.split("\n");
	System.out.println(s.length);
	for (int i = 0; i < s.length; i++) {
		if(s[i].equalsIgnoreCase("selenium tutorial"))
		{
			System.out.println(s[i]);	
			driver.findElement(By.id("lst-ib")).clear();	
			driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
		}	
	}	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");		
			driver=new ChromeDriver();
		driver.get("http://google.co.in");
  }

}
