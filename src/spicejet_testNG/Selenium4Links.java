package spicejet_testNG;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Selenium4Links {
	public WebDriver driver;
public void takeScreenShot(String str) throws Exception{
	 DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss a");
	  Date d=new Date();
	  String time=df.format(d);
	  System.out.println(time);
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("D:\\Workspace\\"+str+time+".png"));		
	}
  @Test
  public void f() throws Exception{
driver.findElement(By.linkText("Manual FAQs")).click();
takeScreenShot("mFAQs");

driver.findElement(By.linkText("Selenium FAQs")).click();
takeScreenShot("sFAQs");

driver.findElement(By.linkText("General Testing FAQs")).click();
takeScreenShot("GTFAQs");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");		
			driver=new ChromeDriver();
	  driver.get("http://selenium4testing.com/");
	  driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
