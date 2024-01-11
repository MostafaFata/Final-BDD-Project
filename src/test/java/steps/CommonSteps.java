package steps;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    String email = "john.doe.123@company.com";
    @Then("fill the Create Primary Account form")
    public void fill_the_create_primary_account_form() {
        setElementData(Page.EMAIL, email);
        clickElement(Page.TITLE);
        setElementData(Page.FIRSTNAME, "John");
        setElementData(Page.LASTNAME, "Doe");
        clickElement(Page.GENDER);
        clickElement(Page.MARITAL_STATUS);
        setElementData(Page.EMPLOYMENT_STATUS, "Employed");
        setElementData(Page.DATE_OF_BIRTH, "11/11/1999");
        clickElement(Page.DATE_OF_BIRTH);
    }
    @Then("submit the form")
    public void submit_the_form() {
        clickElement(Page.CREATE_ACCOUNT_BUTTON);
    }
    @Then("validate {string} appears and verify email")
    public void validate_appears_and_verify_email(String expectedHeading) {
        String signUpHeading = getElementTextWait(Page.SIGNUP_ACCOUNT_HEADING, 10);
        Assert.assertEquals(signUpHeading, expectedHeading);

        String verifyEmail = getElementText(Page.VERIFY_EMAIL);
        Assert.assertEquals(verifyEmail, email);
    }

    @Then("verify error {string} appears")
    public void verify_error_appears(String expectedError) {
        String error = getElementTextWait(Page.ACCOUNT_EXISTS_ERROR, 10);
        Assert.assertEquals(error, expectedError);
    }


    /*
      @Then("close browser")
    public void close_browser() {
        closeBrowser();
    }
     */

}
