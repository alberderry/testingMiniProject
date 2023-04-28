package starter.products;

import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;


public class Post {
    protected static String url = "https://altashop-api.fly.dev/";

    @Step("I set POST valid endpoint")
    public String setApiEndpoints(){

        return url + "api/products";
    }
    @Step("I send POST request")
    public void sendPostRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "tesdr22");
        requestBody.put("description", "tesdrbisa2");
        requestBody.put("price", 6969);


        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setApiEndpoints());
    }
    @Step("I receive valid status code 200 OK")
    public void validateResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data all product")
    public void validatePostDataAllProduct(){
        restAssuredThat(response -> response.body("data.Name[0]", equalTo("tesdr22")));
        restAssuredThat(response -> response.body("data.Description[0]", equalTo("tesdrbisa2")));
        restAssuredThat(response -> response.body("data.Price[0]", equalTo(6969)));



    }
}
