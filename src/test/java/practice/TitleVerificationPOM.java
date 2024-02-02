package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TitleVerificationPOM {
	WebDriver driver;
//	By username = By.id("txtuId");
//	By pw = By.id("txtPword");
//	By login = By.id("login");
 @BeforeTest
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://primusbank.qedgetech.com/");
 }
  @Test
  public void titlePOM() throws InterruptedException {
	  PageObjects obj = new PageObjects();
	  driver.findElement(obj.username).sendKeys("Admin");
	  driver.findElement(obj.pw).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(obj.login).click();
  }
  @AfterTest
  public void tearDown() {
	driver.close();
  }

}
