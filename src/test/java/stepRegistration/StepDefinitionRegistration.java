package stepRegistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionRegistration {

	static WebDriver driver=new ChromeDriver();
	
	
	@Given("user is on ServiceNow Free trail screen")
	public void user_is_on_servicenow_free_trail_screen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Project_set_up/chromedriver.exe" );
		driver.get("https://www.servicenow.com/");
		driver.manage().window().maximize();
	}
	

	@When("the screen itle is Start your free trial")
	public void the_screen_itle_is_start_your_free_trial() throws InterruptedException {
	String title= 	driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//*[@id='naas-header-v2\']/div[2]/div/div[2]/a")).click();
	driver.findElement(By.id("truste-consent-button")).click();
	//driver.manage().addCookie();
	//driver.wait(1000);
	Thread.sleep(1000);
	}
	
	@Then("user enters First name and Last name")
	public void user_enters_first_name_and_last_name() {
		driver.findElement(By.xpath("//input[@id='field8']")).sendKeys("bharathi.gangaraju@jadeglobal.com");
		driver.findElement(By.xpath("//*[@id='field6']")).sendKeys("Bharathi");
		driver.findElement(By.xpath("//*[@id='field7']")).sendKeys("Test");
		
	}
	
	@And("^user enters Company$")
	public void enter_organization() {
		driver.findElement(By.id("field9")).sendKeys("Jade Global Solutions"); 

	}
	@And("^user enters Phone$")
	public void enterContactDetails() {
		driver.findElement(By.id("field13")).sendKeys("9876543219"); 		
	}
	@And("^user enters JobLevel, Department, Job Function$")
	public void enterJobDetails() throws InterruptedException {
		WebElement jobLevel = driver.findElement(By.id("field10"));	
		handleDropdown(jobLevel, "Developer/Engineer");
		Thread.sleep(2000);
		WebElement department= driver.findElement(By.id("field11"));
		handleDropdown(department, "Facilities");
		Thread.sleep(2000);
		WebElement jobFunction= driver.findElement(By.id("field12")); 
		handleDropdown(jobFunction, "Facilities Operations");
	}
	@And("^user enters additional details$")
	public void enterAdditionalDetails() throws InterruptedException {
		WebElement country = driver.findElement(By.id("field14"));	
		handleDropdown(country, "IN");
		WebElement iWouldLikeTo = driver.findElement(By.xpath("//*[@id='form1091']/ul/li[11]/select"));	
		handleDropdown(iWouldLikeTo, "Learn more about specific ServiceNow applications");
		WebElement interest = driver.findElement(By.id("field30"));	
		handleDropdown(interest, "Automating cloud processes");
		
	}
	
	@And("^user clicks on Contact Sales button$")
	public void contactSales() {
		driver.findElement(By.xpath("//*[@class='uf-submit-form']")).click();
		String confirmation = driver.getTitle();
	}
	
	@Then("^user is on Thank you for reaching out$")
	public void thankyou() {
		System.out.println("Thank you for reaching out.\r\n"
				+ "One of our experts will be in touch soon.");
	}
	
	public static void handleDropdown(WebElement element, String Value) throws InterruptedException {
		  Select dropdown = new Select(element);
		  dropdown.selectByValue(Value);
			driver.wait(1000);
		}
	
}
