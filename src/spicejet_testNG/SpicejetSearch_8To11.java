package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpicejetSearch_8To11 {
	public WebDriver driver;
public void verifySearch(String a,String c,String i) throws Exception{
	 driver.get("http://spicejet.com");
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Hyderabad (HYD)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Bengaluru (BLR)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("29")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(a);
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText(c);
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText(i);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
}
  @Test(description="Verify the oneway search functionality with 1 adult")
  public void test08() throws Exception{
	  verifySearch("1 Adult","0 Children","0 Infant");
}
  @Test(description="Verify the oneway search functionality with 2 adults and 1 child")
  public void test09() throws Exception{
	  verifySearch("2 Adults","1 Child","0 Infant");	  
  }
  @Test(description="Verify the oneway search functionality with 3 adults, 2 children and 1 infant")
  public void test10() throws Exception{
	  verifySearch("3 Adults","2 Children","1 Infant");	  
  }
  @Test(description="Verify the oneway search functionality with 9 passengers")
  public void test11() throws Exception{
	  verifySearch("5 Adults","4 Children","2 Infants");	  
  }
  
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
	//  driver.findElement(By.linkText("Desktop Site")).click();
  }
}
