package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features"},
glue= {"StepsDefinitions"},
plugin= {"pretty","html:target/htmlReports/htmlreport.html"}
)

public class LoginPageTestRunner extends AbstractTestNGCucumberTests{

}
