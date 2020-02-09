package projectorangeHrm.com;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/main/resources" }, glue = {
		"projectorangeHrm.com" }, monochrome = true, tags = "@ab")
public class ProjectRunner extends AbstractTestNGCucumberTests {

}
