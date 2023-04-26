package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://altashop-api.fly.dev/";

    @Step("I set GET valid endpoint")
    public String setApiEndpoints(){

        return url + "api/products";
    }

    @Step("I send GET HTTP request from product")
    public void sendGetHttpRequestFromProduct(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoints());
    }

    @Step("I receive valid status code 200 OK")
    public void validateResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data all product")
    public void validateDataAllProduct(){
        restAssuredThat(response -> response.body("'ID'", equalTo(6875)));
        restAssuredThat(response -> response.body("'Name'", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("'Description'", equalTo("play has no limits")));
    }
}
