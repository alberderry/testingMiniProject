package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.hasSize;


public class invalidGet {
    protected static String url = "https://altashop-api.fly.dev/";

    @Step("I set GET invalid endpoint")
    public String setApiEndpoints(){

        return url + "api/produk";
    }

    @Step("I send invalid GET HTTP request from product")
    public void sendGetHttpRequestFromProduct(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoints());
    }

    @Step("I receive invalid HTTP response code 404 Not Found")
    public void validateResponseCode404(){

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive invalid data all product")
    public void validateDataAllProduct(){

    }
}
