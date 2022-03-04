package step_definitions;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.HomeStatus;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US170_StepDef {
    Response response = null;
    RequestSpecification spec = new RequestSpecBuilder().setRelaxedHTTPSValidation().setBaseUri(ConfigurationReader.getProperty("kese_api")).build();
    HomeStatus homeStatus = new HomeStatus("6200fc8cc4b2f939e448f5ac", true);

    @Given("user connects to {string} us one hundred seventy one")
    public void userConnectsToUsOneHundredSeventyOne(String endPoint) {

        response = given().
                   queryParam("secret_token",ConfigurationReader.getProperty("secret_token")).
                   contentType(ContentType.JSON).
                   spec(spec).
                   body(homeStatus).
                   patch(endPoint);

        response.prettyPrint();
    }

}
