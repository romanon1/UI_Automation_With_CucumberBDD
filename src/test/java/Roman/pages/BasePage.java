package Roman.pages;

import Roman.genericLibraries.DriverUtil;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage (){ PageFactory.initElements(DriverUtil.getDriver(),this); }
}
