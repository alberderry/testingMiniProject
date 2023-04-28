package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;


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
        restAssuredThat(response -> response.body("data.ID[0]", equalTo(11276)));
        restAssuredThat(response -> response.body("data.Name[0]", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("data.Description[0]", equalTo("play has no limits")));
        restAssuredThat(response -> response.body("data.Price[0]", equalTo(299)));
        restAssuredThat(response -> response.body("data.Ratings[0]", equalTo(1)));
        restAssuredThat(response -> response.body("data.Categories[0]", hasSize(0)));
    }
}
