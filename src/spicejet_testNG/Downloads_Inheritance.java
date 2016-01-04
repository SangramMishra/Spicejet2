package spicejet_testNG;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Downloads_Inheritance extends Selenium4Links{
  @Test
  public void verifyDownloads() throws Exception {
	  driver.findElement(By.linkText("Downloads")).click();
	  takeScreenShot("dloads");
  }
}
