package Roman.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) // We are integrating JUnit to run with Cucumber's feature files
// Integrate the JUnit Assertions and scenarios of Cucumber
@CucumberOptions(
        features = "src/test/resources/features",               // location of your .feature files (copy content root)
        glue = "steps",                                  // location of your step definitions (copy source root)
        tags = "@RomanTest",                         // Which tags will this file run?
        dryRun = true,                                                 // we will not run undefined steps
        plugin = {
                "pretty",                                                               // This will help us to have a more understandable console output
                "html:target/default-cucumber-reports.html",    // We use this to generate HTML reports after each run
                "json:target/cucumber.json",                             //We use this to generate JSON reports after each run
                "rerun:target/rerun.txt"

        }
)
public class TestRunner {
}

