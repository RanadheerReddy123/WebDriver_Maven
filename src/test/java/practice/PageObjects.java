package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	
		WebDriver driver;
		By RegLink = By.linkText("Register");
		By FirstName = By.name("full name");
		//Constructor to use browser
		PageObjects(WebDriver driver){
			WebDriver d = new ChromeDriver();
			driver = d;
			//PageFactory.initElements(d, this);
		}
		public void get(String string) {
			// TODO Auto-generated method stub
			
		}

	}


