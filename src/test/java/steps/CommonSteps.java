package steps;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;
import utilities.SeleniumUtility;

import java.time.Duration;

public class CommonSteps extends SeleniumUtility {

    /*
    @Given("open browser")
    public void open_browser() {
        openBrowser();
    }
    */
    @When("navigate to url")
    public void navigate_to_url() {
        navigateURL();
    }
    @Then("get title and validate title is {string}")
    public void get_title_and_validate_title_is(String expectedTitle) {
        String title = getDriver().getTitle();
        Assert.assertEquals(title, expectedTitle);
    }
    @Then("assure that create primary button exists")
    public void assure_that_create_primary_button_exists() {
        System.out.println(getElementText(Page.PRIMARY_BUTTON));
    }

    @Then("click on Create Primary Account")
    public void click_on_create_primary_account() {
        clickElement(Page.PRIMARY_BUTTON);
    }
    @Then("validate {string} appears")
    public void validate_appears(String expectedHeading) {
        String h2Text = getElementTextWait(Page.PRIMARY_ACCOUNT_HEADING, 10);
        Assert.assertEquals(h2Text, expectedHeading);
    }


    /*
      @Then("close browser")
    public void close_browser() {
        closeBrowser();
    }
     */

}
