package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ListofItems {
	WebDriver driver;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","C:\\RR\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://primusbank.qedgetech.com/");
  }
  @Test
  public void listItems() {
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));  
	System.out.println("number of links are: "+alllinks.size());
	for(WebElement each: alllinks) {
		System.out.println(each.getText());	
		System.out.println(each.getAttribute("href"));
	}
  }
  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
