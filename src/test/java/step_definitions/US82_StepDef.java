package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US82_StepDef {

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri(ConfigurationReader.getProperty("kese_api"))
            .build();

    @Given("user connects to {string} with post")
    public void userConnectsToWithPost(String endPoint) {

        Faker faker = new Faker();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", faker.internet().emailAddress());
        jsonObject.put("kullanici_adi", faker.name().username());
        jsonObject.put("sifre", faker.internet().password());

        response = given().
                   contentType(ContentType.JSON).
                   spec(request).
                   body(jsonObject.toString()).
                   post(endPoint);
    }

    @Then("user verifies the response includes the sonuc property")
    public void userVerifiesTheResponseIncludesTheSonucProperty() {
        String sonuc = response.jsonPath().get("sonuc").toString();

        Assert.assertNotNull(sonuc);
        Assert.assertEquals( "true", sonuc);
        Assert.assertEquals( 201, response.getStatusCode());

        response.prettyPrint();

    }

    @Given("user connects to {string} with post negative one")
    public void userConnectsToWithPostNegative_(String endPoint) {
        Faker faker = new Faker();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "admin@gmail.com");
        jsonObject.put("kullanici_adi", faker.name().username());
        jsonObject.put("sifre", faker.internet().password());

        response = given().
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                post(endPoint);
    }

    @Then("user verifies the value of sonuc property is {string} negative one")
    public void userVerifiesTheValueOfSonucPropertyIsNegativeOne(String email) {
        String sonuc = response.jsonPath().get("sonuc").toString();

        Assert.assertNotNull(sonuc);
        Assert.assertEquals( email, sonuc);
        Assert.assertEquals( 200, response.getStatusCode());

        response.prettyPrint();
    }

    @Given("user connects to {string} with post negative two")
    public void userConnectsToWithPostNegativeTwo(String endPoint) {
        Faker faker = new Faker();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", faker.internet().emailAddress());
        jsonObject.put("kullanici_adi", "admin");
        jsonObject.put("sifre", faker.internet().password());

        response = given().
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                post(endPoint);
    }

    @Then("user verifies the value of sonuc property is {string} negative two")
    public void userVerifiesTheValueOfSonucPropertyIsNegativeTwo(String hata) {
        String sonuc = response.jsonPath().get("sonuc").toString();

        Assert.assertNotNull(sonuc);
        Assert.assertEquals( hata, sonuc);
        Assert.assertEquals( 200, response.getStatusCode());

        response.prettyPrint();
    }
}
