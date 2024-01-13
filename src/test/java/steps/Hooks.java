package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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

    @AfterStep
    public void takeScreenshotsAfterStep(Scenario scenario){
       byte[] shots = takeScreenshots();
       scenario.attach(shots, "image/png", "Screenshot");
    }


}
