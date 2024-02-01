package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GetSize {
 WebDriver driver;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://primusbank.qedgetech.com/");
  }
  @Test
  public void getSize() {
	  WebElement username = driver.findElement(By.id("txtuId"));
	  Dimension dim = username.getSize();
	  System.out.println("The height of the username text box is: "+dim.getHeight());
	  System.out.println("The width of the username text box is: "+dim.getWidth());
  }
  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
