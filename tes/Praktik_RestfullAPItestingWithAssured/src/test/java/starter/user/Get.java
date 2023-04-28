package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET endpoints")
    public String setApiEndpoints(){

        return url + "posts";
    }

    @Step("I send GET HTTP request from user")
    public void sendGetHttpRequestFromUser(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void validateResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data all user")
    public void validateDataAllUser(){
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}
