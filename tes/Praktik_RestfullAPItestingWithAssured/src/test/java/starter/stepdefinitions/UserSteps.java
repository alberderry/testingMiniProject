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

    @Steps
    GetById getById;

    @Steps
    Post post;

    @Steps
    PutById putByid;

    @Steps
    DeleteById deleteById;

    @Given("I set GET endpoint")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request from user")
    public void sendGetHttpRequestUser(){

        get.sendGetHttpRequestFromUser();
    }

    @Then("I receive valid HTTP response code 200 OK")
    public void validateHttpResponseCode200Ok(){
        get.validateResponseCode200();
    }

    @And("I receive valid data all user")
    public void receiveValidDataAllUser(){
        get.validateDataAllUser();
    }

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){

        getById.setApiEndpoint();
      }

      @When("I send GET HTTP request")
    public void sendGetHttpRequest(){

        getById.sendGetHttpRequest();
     }

     @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){

        getById.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){

        getById.validateDataDetailUser();
    }

    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }

    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        putByid.setPutEndpoint();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        putByid.sendPutHttpRequest();

    }

    @And("I receive valid data for existing user")
    public void validateDataForExistingUser(){
        putByid.ValidateDataForExistingUser();

    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        deleteById.setDeleteEndpoint();


    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        deleteById.sendDeleteHttpRequest();

    }

    @Then("I receive valid HTTP response code 204")
    public void validHttpResponseCode200(){
        deleteById.validHttpresponseCode200();

    }
}

