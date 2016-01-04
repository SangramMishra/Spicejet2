package spicejet_testNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Spicejet_Locators {
	public WebDriver driver;
	  @Test
	  public void printTxt_Btns_RBs_Chk_Loc(){
	List<WebElement> str=driver.findElements(By.tagName("input"));
	System.out.println(str.size());
	for(int i=0; i<str.size(); i++)
	{
	if(str.get(i).getAttribute("type").equalsIgnoreCase("radio"))
	{
	System.out.println("RB loc :"+str.get(i).getAttribute("id"));
	}
	else if(str.get(i).getAttribute("type").equalsIgnoreCase("checkbox"))
	{
	System.out.println("Checkbox Loc:"+str.get(i).getAttribute("id"));
	}
	}
	  }
	  @BeforeTest
	  public void beforeTest() throws Exception {
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
		  driver.findElement(By.linkText("Desktop Site")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
