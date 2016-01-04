package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Implicit_ExplicitWait {
	public WebDriver driver;
	public void implicitWait(String str) throws Exception{
		for (int i = 0; i < 60; i++) {
			try{
				driver.findElement(By.xpath(str)).isDisplayed();	
				break;
			}catch(Exception e){Thread.sleep(1000);}
		}
	}
	
	public void explicitWait(String str) throws Exception{
		try{
			while(driver.findElement(By.xpath(str)).isDisplayed())
			{
				break;
			}			
		}catch(Exception e){}		
	}
	
  @Test
  public void f() throws Exception{
		driver.findElement(By.id("Email")).sendKeys("testingse2");
		driver.findElement(By.id("next")).click();
		//Thread.sleep(2000);
		implicitWait("//input[@id='Passwd']");
		driver.findElement(By.id("Passwd")).sendKeys("selenium");
		driver.findElement(By.id("signIn")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://gmail.com");
  }

}
