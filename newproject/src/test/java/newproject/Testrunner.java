package newproject;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/features",
		glue={"stepdefinitions"},
		dryRun =false,
		monochrome=true,
		tags =" @tag1",
		
		 plugin= {"pretty", "html:target/dsalgo.html"
                }
		
				)
public class Testrunner {

}
