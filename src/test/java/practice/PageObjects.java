package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	
		WebDriver driver;
		By username = By.id("txtuId");
		By pw = By.id("txtPword");
		By login = By.id("login");
		//Constructor to use browser
//		PageObjects(WebDriver driver){
//			WebDriver d = new ChromeDriver();
//			driver = d;
//			//PageFactory.initElements(d, this);
//		}
		

	}


