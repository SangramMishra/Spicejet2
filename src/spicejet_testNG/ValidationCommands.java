package spicejet_testNG;


import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class ValidationCommands {
	public WebDriver driver;
  @Test(enabled=false)
  public void validateUsername() {
	  if(driver.findElement(By.name("usernjhgjh")).isDisplayed())
	  {
		  System.out.println("Available");
	  }else{
		  System.out.println("Not available");
	  }
	  
  }
  @Test(description="Verify the functionality of oneway radio button")
  public void test03() {
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
String id="ctl00_mainContent_txt_Todate";
/*if(driver.findElement(By.id(id)).isDisplayed())
{
	System.out.println("Available");
}else{
	System.out.println("Not available");
}*/

AssertJUnit.assertEquals(driver.findElement(By.id(id)).isDisplayed(),true);
AssertJUnit.assertEquals(driver.findElement(By.id(id)).isDisplayed(),false);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.findElement(By.linkText("Desktop Site")).click();
  }

}
