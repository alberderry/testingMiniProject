package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.products.*;
public class invalidGetSteps {
    @Steps
    invalidGet get;

    @Given("I set GET invalid endpoint")
    public void setGetInvalidApiEndpoints() {
        get.setApiEndpoints();
    }

    @When("I send invalid GET HTTP request from product")
    public void sendGetInvalidHttpRequestProduct() {

        get.sendGetHttpRequestFromProduct();
    }

    @Then("I receive invalid HTTP response code 404 Not Found")
    public void validateHttpInvalidResponseCode404NotFound() {
        get.validateResponseCode404();
    }

    @And("I receive invalid data all product")
    public void receiveInvalidDataAllProduct() {
        get.validateDataAllProduct();
    }

}


