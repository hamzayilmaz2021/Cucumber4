package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US96_StepDef {
    Response response = null;
    RequestSpecification request = new RequestSpecBuilder().
                                        setBaseUri("https://kese.nl/api").
                                        setRelaxedHTTPSValidation().
                                        build();

    @Given("user connects to {string} us ninety six")
    public void userConnectsToUsNinetySix(String endPoint) {
        String id = BrowserUtilities.readDataFromIdsFile("room");

        response = given().
                     queryParam("secret_token", ConfigurationReader.getProperty("secret_token")).
                     contentType(ContentType.JSON).
                     spec(request).
                     delete(endPoint + id);
    }

    @Then("user verifies the response status code is {int} us ninety six")
    public void userVerifiesTheResponseStatusCodeIsUsNinetySix(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Then("user verifies the value of deleted count propert is {int}")
    public void userVerifiesTheValueOfDeletedCountPropertIs(int count) {
        int deletedCount = response.jsonPath().getInt("deletedCount");
        Assert.assertEquals(count, deletedCount);
    }

    @Then("user verifies the room is deleted from the database")
    public void userVerifiesTheRoomIsDeletedFromTheDatabase() {
        String id = BrowserUtilities.readDataFromIdsFile("room");

        Response response = given().
                contentType(ContentType.JSON).
                spec(request).
                get("/rooms/" + id);


        Assert.assertTrue(response.getBody().asString().equals("null"));
    }
}
