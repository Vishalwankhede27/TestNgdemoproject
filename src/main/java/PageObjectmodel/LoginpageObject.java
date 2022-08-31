package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageObject {

	public WebDriver driver;
	//driver.findelements(by.xpath("")).sendkeys();
	//We have achieve encapsulation here
	 private By username=By.xpath("//input[@id='username']");
	 private By password=By.xpath("//input[@id='password']");
	 private By Loginbutton=By.xpath("//input[@id='Login']");
	 
	 public WebElement Enterusername()
	 {
		 return driver.findElement(username);
		 //driver.findelement(By.xpath("//input[@id='username']");)
	 }
	 public WebElement Enterpassword()
	 {
		 return driver.findElement(password);
		 //driver.findelement(By.xpath("//input[@id='password']");)
	 }
	 public WebElement Clicklogin()
	 {
		 return driver.findElement(Loginbutton);
		 //driver.findelement(By.xpath("//input[@id='Login']");)
	 }
}

