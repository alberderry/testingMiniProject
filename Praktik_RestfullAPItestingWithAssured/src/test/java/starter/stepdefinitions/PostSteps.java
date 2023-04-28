package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.products.*;

public class PostSteps {

    @Steps
    Post post;

    @Given("I set POST valid endpoint")
    public void setPostApiEndpoints() {
        post.setApiEndpoints();
    }
    @Given("I send POST request")
    public void sendPostApiRequest(){

        post.sendPostRequest();
    }
//    @When("I send valid POST HTTP request from product")
//    public void sendPostHttpRequestProduct() {
//
//        post.sendPostHttpRequestFromProduct();
//    }

    @Then("I receive valid POST status code 200 OK")
    public void validateHttpResponseCode200Ok() {
        post.validateResponseCode200();
    }

    @And("I receive valid POST data")
    public void receivePostValidDataAllProduct() {
        post.validatePostDataAllProduct();
    }

}
