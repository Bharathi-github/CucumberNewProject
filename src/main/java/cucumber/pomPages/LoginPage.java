package cucumber.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.util.TestBaseutil;

public class LoginPage extends TestBaseutil{

	@FindBy(name= "username")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath= "//*[text()='Log in']")
	WebElement LoginButton;
	
	@FindBy(xpath= "//*[@class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--W3Tqk ']")
	WebElement LoginCredentials;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginCredentials.click();
	}
	
	
}
