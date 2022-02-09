package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class US93_StepDef {

    Response response = null; // bağlantıdan (request) gelen cevap
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri("https://kese.nl/api")
            .build();

    @Given("user connects to {string} us ninety three")
    public void userConnectsToUsNinetyThree(String endPoint) {
        response = given().
                   contentType(ContentType.JSON).
                   spec(request).
                   get(endPoint);

        response.prettyPrint();
    }

    @Then("user verifies the response status code is {int} us ninety three")
    public void userVerifiesTheResponseStatusCodeIsUsNinetyThree(int code) {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("user verifies the list is sorted us ninety three")
    public void userVerifiesTheListIsSortedUsNinetyThree() {
        //List<Object> list = response.jsonPath().get("$");
        List<Integer> list = response.jsonPath().get("okunmasayisi");

        int onceki = list.get(0);
        for(Integer o : list){
            System.out.println("Okunma sayısı : " + o);
            Assert.assertTrue(o <= onceki);
            onceki = o;
        }
    }

    @Then("user verifies the size of list is lower than or equal eight us ninety three")
    public void userVerifiesTheSizeOfListIsLowerThanOrEqualEightUsNinetyThree() {
        List<Object> list = response.jsonPath().get("$");
        Assert.assertTrue(list.size() <= 8);

    }
}
