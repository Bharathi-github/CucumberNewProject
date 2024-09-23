package testRunnerRegistration;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C://Users//bharathi.gangaraju//OneDrive - Jade Global Software Pvt Ltd//Desktop//AUto//Java_Selenium_BDD_Framework//src//test//java//stepRegistration//FeatureBdd.feature",
    glue = {"stepRegistration"},
   // format = {"pretty", " html:test-outout"},
    monochrome = true,
    plugin = { "pretty", "html:target/HtmlReports/reports.html" }
    //plugin = { "pretty", "json:target/jsonReports/report.json" }
    //plugin = { "pretty", "junit:target/JunitReports/report.xml" }
)

public class TestRunnerRegistration {
	
}
