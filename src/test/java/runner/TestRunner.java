package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, // feature folder path
		glue = { "steps", "hooks" }, // step definition, hooks folder name
		tags = { "@TestDropdown" },
// 		tags = {"@TestFile1 or @TestFile2 or @TestFile3"},
		strict = true,
		//dryRun = true,//to check feature vs step definition mapping is correct
		monochrome = true, // to see console output in a clean manner
		plugin = { "pretty", "html:target/cucumberReports", "json:target/cucumberReports.json", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"de.monochromata.cucumber.report.PrettyReports:target"
				})

public class TestRunner {
	

}
