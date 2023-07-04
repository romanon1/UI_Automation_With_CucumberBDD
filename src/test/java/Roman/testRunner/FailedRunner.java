package Roman.testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "stepsDefinitions",
        dryRun = false,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"
        }

)

public class FailedRunner {
}

