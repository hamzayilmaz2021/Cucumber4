package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US146_StepDef {

    Response response = null;
    RequestSpecification spec = new RequestSpecBuilder().
                                setBaseUri(ConfigurationReader.getProperty("kese_api")).
                                setRelaxedHTTPSValidation().
                                build();

    @Given("user connects to {string} with token to get referenced user list us one hundread fourty five")
    public void userConnectsToWithTokenToGetReferencedUserListUsOneHundreadFourtyFive(String endPoint) {
        response = given()
                .queryParam("secret_token", ConfigurationReader.getProperty("admin_token"))
                .contentType(ContentType.JSON)
                .spec(spec)
                .get(endPoint);

        response.prettyPrint();
    }

    @Then("user verifies the list is sorted us one hundread fourty five")
    public void userVerifiesTheListIsSortedUsOneHundreadFourtyFive() throws ParseException {
        List<LinkedHashMap> list = response.jsonPath().get("$");

        JSONObject json = new JSONObject(list.get(0));
        String oncekiTarihString = json.getString("createdAt");
        SimpleDateFormat oncekiTarihFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date oncekiTarih = oncekiTarihFormat.parse(oncekiTarihString.replaceAll("Z$", "+0000"));

        for(LinkedHashMap o : list){
            JSONObject json1 = new JSONObject(o);
            String suankiTarihString = json1.getString("createdAt");
            SimpleDateFormat suankiTarihFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            Date suankiTarih = suankiTarihFormat.parse(suankiTarihString.replaceAll("Z$", "+0000"));

            if(suankiTarih.getTime() <= oncekiTarih.getTime()){
                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }

            oncekiTarih = suankiTarih;
        }
    }
}
