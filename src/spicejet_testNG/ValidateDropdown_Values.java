package spicejet_testNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class ValidateDropdown_Values {
	public WebDriver driver;
  @Test
  public void validateAdultDD() {
	  String id="ctl00_mainContent_ddl_Adult";
List<WebElement> s=new Select(driver.findElement(By.id(id))).  
													 getOptions();
System.out.println(s.size());
for (int i = 0; i < s.size(); i++) {
	//Check for 5adults and select it
	if(s.get(i).getText().equalsIgnoreCase("5 Adults"))
	{
	System.out.println(s.get(i).getText());
new Select(driver.findElement(By.id(id))).selectByVisibleText(
											  s.get(i).getText());	
	}
//Print all values except 5 adults	
	if(!s.get(i).getText().equalsIgnoreCase("5 Adults"))
	{
	System.out.println(s.get(i).getText());	
	}
}
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.findElement(By.linkText("Desktop Site")).click();

  }

}
