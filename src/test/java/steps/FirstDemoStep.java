package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstDemoStep {

    @Given("say hello")
    public void say_hello() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello!");
    }
    @When("say how are you")
    public void say_how_are_you() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("How are you?");
    }
    @Then("say Goodbye")
    public void say_goodbye() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Goodbye!");
    }

}
