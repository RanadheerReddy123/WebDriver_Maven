package testngpractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\RR\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		Thread.sleep(3000);
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(3000);
		driver.quit();
	}

}
