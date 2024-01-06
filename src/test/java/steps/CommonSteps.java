package steps;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonSteps extends Setup {

    @Given("open browser")
    public void open_browser() {
        openBrowser();
    }
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
        By primarybtn = By.xpath("//a[@href='/add-primary-account']");
        WebElement button = getDriver().findElement(primarybtn);
        System.out.println(button.getText());
    }
    @Then("close browser")
    public void close_browser() {
        closeBrowser();
    }


}
