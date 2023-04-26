package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {

    @Steps
    Get get;

    @Given("I set GET valid endpoint")
    public void setGetApiEndpoints() {
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request from product")
    public void sendGetHttpRequestProduct() {

        get.sendGetHttpRequestFromProduct();
    }

    @Then("I receive valid status code 200 OK")
    public void validateHttpResponseCode200Ok() {
        get.validateResponseCode200();
    }

    @And("I receive valid data all product")
    public void receiveValidDataAllProduct() {
        get.validateDataAllProduct();
    }

//    @Given("I set GET invalid endpoint")
//    public void setGetInvalidApiEndpoints() {
//        get.setApiEndpoints();
//    }
//
//    @When("I send invalid GET HTTP request from product")
//    public void sendGetInvalidHttpRequestProduct() {
//
//        get.sendGetHttpRequestFromProduct();
//    }
//
//    @Then("I receive invalid HTTP response code 404 Not Found")
//    public void validateHttpInvalidResponseCode200Ok() {
//        get.validateResponseCode200();
//    }
//
//    @And("I receive invalid data all product")
//    public void receiveInvalidDataAllProduct() {
//        get.validateDataAllProduct();
//    }

}

