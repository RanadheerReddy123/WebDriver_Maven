package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TitleVerification {
  WebDriver driver;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
  }
  @Test
  public void verifyTitle() {
	  String expectedTitle = "Primus BANK";
	  String actualTitle = driver.getTitle();
	  //Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle), "Titles are not matching");
	  Assert.assertEquals(expectedTitle, actualTitle, "Title doesn't match the expected title.");
//	  if(actualTitle.equalsIgnoreCase(expectedTitle)) {
//		  System.out.println("Titles are matching");
//	  }else {
//		  System.out.println("Titles are not matching");
//	  }
  }
  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
