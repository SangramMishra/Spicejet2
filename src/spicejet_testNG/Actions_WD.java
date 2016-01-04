package spicejet_testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Actions_WD {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
	  Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.linkText("About Us"))).
                                                build().perform();
Thread.sleep(1000);
driver.findElement(By.linkText("Cargo")).click();
a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
Thread.sleep(1000);
a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Desktop Site")).click();

  }

}
