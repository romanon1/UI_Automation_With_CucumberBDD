package Roman.stepsDefinitions;

import Roman.utils.ConfigurationReader;
import Roman.utils.DriverUtil;
import io.cucumber.java.en.Given;

public class homeDepot {
    @Given("the user want to go to HomeDepot website")
    public void the_user_want_to_go_to_home_depot_website() {
        DriverUtil.getDriver().get(ConfigurationReader.getProperties("romanUrl"));
    }

}
