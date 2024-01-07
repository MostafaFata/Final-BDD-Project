package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Before
    public void openBrowserStep() {
        openBrowser();
    }

    @After
    public void closeBrowserStep() {
        closeBrowser();
    }


}
