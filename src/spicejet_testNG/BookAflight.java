package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class BookAflight {
	public WebDriver driver;
  @Test
  public void test01() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("29")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
  }
  @Test
  public void test02() throws Exception{
		String str=driver.getWindowHandle();
		driver.findElement(By.id("popUpConverter")).click();
		Thread.sleep(2000);
		driver.switchTo().window("converter");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
Thread.sleep(3000);
driver.findElement(By.id("ButtonCloseWindow")).click();
driver.switchTo().window(str);
new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Ahmedabad (AMD)");
  }
  
  @Parameters("nagesh")
  @BeforeTest
  public void beforeTest(String str) {
	  if(str.equalsIgnoreCase("firefox")){
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
		  driver.findElement(By.linkText("Desktop Site")).click();		 
	  }
	  else if(str.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
	  } 	  
	  else if(str.equalsIgnoreCase("ie"))
	  {
		  System.setProperty("webdriver.ie.driver","D:\\Library\\IEDriverServer.exe");	  
		  driver=new InternetExplorerDriver();
		  driver.get("http://spicejet.com");
	  }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  

}



