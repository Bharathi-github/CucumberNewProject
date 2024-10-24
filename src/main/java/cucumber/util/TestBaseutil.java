package cucumber.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseutil {

	
		public static WebDriver driver;
		static Properties prop;
		
	 public TestBaseutil() {
			try {
				prop = new Properties();
				FileInputStream fi= new FileInputStream("C:/Users/bharathi.gangaraju/eclipse-workspace1/"
						+ "Java_Selenium_BDD_POM/src/main/java/cucumber/config");
				prop.load(fi);
			}catch (IOException e) {
				e.getMessage();
			}
	 }
	
			public static void initialization() {
				String browserName = prop.getProperty("browser");
				
					System.setProperty("webdriver.chrome.driver","D:/Project_set_up/chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.get(prop.getProperty("url"));
				
			}
				

	
}
