testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (features= ".//Features/AcctCreation.feature",
         glue="stepDefinations",
         dryRun =false ,
         tags = {"@ExtentReport"}
        // monochrome=true,
         //plugin= {"pretty","html:test-output"}
        )

public class Testrun {

}
