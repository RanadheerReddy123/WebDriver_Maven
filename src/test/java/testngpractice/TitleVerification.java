package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;

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
	  String expectedTitle = "PrimusBank";
	  String actualTitle = driver.getTitle();
	  //Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching");
	  if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		  System.out.println("Titles are matching");
	  }else {
		  System.out.println("Titles are not matching");
	  }
  }
  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
