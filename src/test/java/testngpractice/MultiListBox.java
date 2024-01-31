package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MultiListBox {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\RR\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ranad/Downloads/Selenium/MultiListbox.html/");
	}
	@Test
	public void multiListBox() {
		Select element = new Select(driver.findElement(By.name("multiSelection")));
		boolean flag = element.isMultiple();
		System.out.println(flag);
		element.selectByIndex(0);
		element.selectByIndex(1);
		//get collection of items which are selected
		List<WebElement> selecteditems =element.getAllSelectedOptions();
		System.out.println(selecteditems.size());
		//print name of each item selected
		for (WebElement each : selecteditems) {
			System.out.println(each.getText());
		}
		element.deselectByIndex(0);
		//get collection of items which are selected
		List<WebElement> selecteditems2 =element.getAllSelectedOptions();
		System.out.println(selecteditems2.size());

	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
