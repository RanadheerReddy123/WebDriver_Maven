package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TitleVerificationPOM {
 
  @Test
  public void titlePOM() {
	  System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  PageObjects obj = new PageObjects(driver);
	  obj.get("http://primusbank.qedgetech.com/");
  }
  @AfterTest
  public void tearDown() {
	  WebDriver driver = new ChromeDriver();
	driver.close();
  }

}
