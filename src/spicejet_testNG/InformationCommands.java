package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class InformationCommands {
	public WebDriver driver;
  @Test
  public void f() {
String str=driver.findElement(By.linkText("Gmail")).getText();
System.out.println(str);
String s=driver.findElement(By.name("btnK")).getAttribute("value");
System.out.println(s);
String s1=driver.findElement(By.id("hplogo")).getAttribute("title");
System.out.println(s1);

//int i[]={20,51,6,12,1,66,8,10};



  }
  @BeforeTest
  public void beforeTest() {
	  driver= new FirefoxDriver();
		driver.get("http://google.co.in");
  }

}
