package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Validate1Adult_Spicejet {
	public WebDriver driver;
  @Test
  public void f() {
WebElement str=new Select(driver.findElement(By.id(
		"ctl00_mainContent_ddl_Adult"))).getFirstSelectedOption();
System.out.println(str.getText());
if(str.getText().contains("1 Adult"))
{
	System.out.println("Default values is 1Adult");
}else{
	System.out.println("Default values is not 1Adult");
}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.findElement(By.linkText("Desktop Site")).click();
  }

}
