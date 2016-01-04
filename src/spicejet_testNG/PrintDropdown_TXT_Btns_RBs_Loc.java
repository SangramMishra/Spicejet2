package spicejet_testNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class PrintDropdown_TXT_Btns_RBs_Loc {
	public WebDriver driver;
	public void login(){
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
	}	
	public void registration() throws Exception{
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Permanent Registration")).click();
	}
  @Test(enabled=false)
  public void printDropdonLoc_Values() {
	 List<WebElement> s=driver.findElements(By.tagName("select"));
	 System.out.println(s.size());
	 for(int i=0; i<s.size(); i++)
	 {
System.out.println("Dropdown loc :"+s.get(i).getAttribute("name"));
System.out.println("Dropdown values :"+s.get(i).getText());
	 }
  }
  @Test
  public void printTxt_Btns_RBs_Chk_Loc(){
List<WebElement> str=driver.findElements(By.tagName("input"));
System.out.println(str.size());
for(int i=0; i<str.size(); i++)
{
if(str.get(i).getAttribute("type").equalsIgnoreCase("text"))
{
System.out.println("TXt bx loc :"+str.get(i).getAttribute("name"));
}
else if(str.get(i).getAttribute("class").equalsIgnoreCase("log"))
{
System.out.println("Btn Loc:"+str.get(i).getAttribute("value"));
}
}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver=new FirefoxDriver();
			driver.get("http://selenium4testing.com/hms/");
			login();
			registration();
  }

}
