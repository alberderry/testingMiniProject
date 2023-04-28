package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.products.*;

public class GetSteps {

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

}
