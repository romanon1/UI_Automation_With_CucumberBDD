package Roman.stepsDefinitions;

import Roman.genericLibraries.DriverUtil;
import Roman.genericLibraries.Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Utilities {
    @Before
    public void launchEnvironment(){
        DriverUtil.getDriver().manage().window().maximize();
        initializePageObjects();
    }


    @After
    public void terminateDriver(Scenario scenario){
        System.out.println("Scenario status = " + scenario.getStatus());
        if(scenario.isFailed()){
            byte [] data = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
        DriverUtil.closeDriver();
    }
}
