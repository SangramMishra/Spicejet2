package spicejet_testNG;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class DynamicPopup {
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
@SuppressWarnings("unused")
String str=driver.getWindowHandle();
driver.findElement(By.id("popUpConverter")).click();
Thread.sleep(2000);
Set<String> s=driver.getWindowHandles();
System.out.println(s);
Object s1[]=s.toArray();
driver.switchTo().window(s1[1].toString());
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
Thread.sleep(3000);
driver.findElement(By.id("ButtonCloseWindow")).click();
driver.switchTo().window(s1[0].toString());
new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Ahmedabad (AMD)");
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
  }

}
