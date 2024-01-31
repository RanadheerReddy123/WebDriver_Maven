package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PrintTitleUrl {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
	}
	@Test(priority=0)
	public void printTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("The title of the given website is: "+pageTitle);
		System.out.println("The length of the given website title is: "+pageTitle.length());
	}
	@Test(priority=1)
	public void printUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println("The title of the given website is: "+pageUrl);
		System.out.println("The length of the given website title is: "+pageUrl.length());
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
