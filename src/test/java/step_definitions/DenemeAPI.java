package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.io.File;

import static io.restassured.RestAssured.given;

public class DenemeAPI {

    Response response = null; // bağlantıdan (request) gelen cevap
    RequestSpecification request = new RequestSpecBuilder()
                                    .setBaseUri("http://localhost:5002/api")
                                    .build();

    @Given("user connects to {string}")
    public void userConnectsToWith(String endPoint) {
        response = given().
                   queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZDIyYzMxODk3MDhhMmQyYWVlZGExYyIsImVtYWlsIjoia3VsbGFuaWNpMUBnbWFpbC5jb20iLCJyb2wiOiJrdWxsYW5pY2kiLCJrdWxsYW5pY2lfYWRpIjoia3VsbGFuaWNpMSIsImR1cnVtIjoxfSwiaWF0IjoxNjQzMzk4MTU4LCJleHAiOjE2NzQ5MzQxNTh9.iMhXsQxv9ZqMVbRndKjzvsz7uJIhXaywBZ-PCBIRil0").
                   contentType(ContentType.JSON).
                   spec(request).
                   get(endPoint);
    }

    @Then("user verifies the status code is {int}")
    public void userVerifiesTheStatusCodeIs(int statusCode) {
        int gelenCevap = response.getStatusCode();

        Assert.assertEquals(gelenCevap, statusCode);
    }

    @Then("user verifies the response includes the proterties")
    public void userVerifiesTheResponseIncludesTheProterties() {
        //{
        //    "sonuc": true,
        //    "kullanici_adi": "kullanici1",
        //    "id": "61d22c3189708a2d2aeeda1c",
        //    "rol": "kullanici",
        //    "email": "kullanici1@gmail.com",
        //    "durum": 1
        //}

        String sonucDegeri = response.jsonPath().get("sonuc").toString();
        Assert.assertTrue( sonucDegeri != null );

        String idDegeri = response.jsonPath().get("id").toString();
        Assert.assertTrue( idDegeri != null );

        String rolDegeri = response.jsonPath().get("rol").toString();
        Assert.assertTrue( rolDegeri != null );

        String kulllaniciAdiDegeri = response.jsonPath().get("kullanici_adi").toString();
        Assert.assertTrue( kulllaniciAdiDegeri != null );

        String emailDegeri = response.jsonPath().get("email").toString();
        Assert.assertTrue( emailDegeri != null );

        String durumDegeri = response.jsonPath().get("durum").toString();
        Assert.assertTrue( durumDegeri != null );



    }


    @Given("send photo")
    public void sendPhoto() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("deneme", "asdf");
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
        response = given().
                multiPart("photo0", file).
                formParam("deneme","aaaaaaasdf").
                queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZDIyYzMxODk3MDhhMmQyYWVlZGExYyIsImVtYWlsIjoia3VsbGFuaWNpMUBnbWFpbC5jb20iLCJyb2wiOiJrdWxsYW5pY2kiLCJrdWxsYW5pY2lfYWRpIjoia3VsbGFuaWNpMSIsImR1cnVtIjoxfSwiaWF0IjoxNjQzMzk4MTU4LCJleHAiOjE2NzQ5MzQxNTh9.iMhXsQxv9ZqMVbRndKjzvsz7uJIhXaywBZ-PCBIRil0").
                contentType("multipart/form-data").
                spec(request).
                post("/homes");
        System.out.println(response.getStatusCode());
        response.prettyPrint();
    }

    @When("POST a new cargo ad")
    public void postNewCargoAd() {

        given()
                .relaxedHTTPSValidation()
//                .cookies(cookies)
                .log().all()
                .queryParam("secret_token", ConfigurationReader.getProperty("secret_token"))
                .formParam("user", "{\"username\": \"kullanici1\", \"id\" : \"61d22c3189708a2d2aeeda1c\"}")
                .formParam("baslangic_address"," {\"label\" : \"Lorton, Virginia, Amerika Birleşik Devletleri\", \"list\" : [\"Lorton\",\"Virginia\" ,\"Amerika Birleşik Devletleri\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}")
                .formParam("bitis_address", "{\"label\" : \"Amsterdam, Hollanda\", \"list\" : [\"Amsterdam\",\"Hollanda\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}")
                .formParam("available_dates", " [{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]")
                .formParam("tip", "[1,2,3]")
                .formParam("saat", "14:30")
                .formParam("destination_list","[ { \"label\": \"Utrecht, Hollanda\", \"list\": [ \"Utrecht\", \"Hollanda\" ], \"placeId\": \"ChIJNy3TOUNvxkcR6UqvGUz8yNY\", \"lat\": 52.09073739999999, \"lng\": 5.1214201 }, { \"label\": \"Arnhem, Hollanda\", \"list\": [ \"Arnhem\", \"Hollanda\" ], \"placeId\": \"ChIJcyKbzpG6x0cR18pz-eBaHBY\", \"lat\": 51.9851034, \"lng\": 5.898729599999999 } ]")
                .formParam("car_description", "Lory")
//                .contentType("application/json; charset=utf-8")
                .when()
                .contentType("multipart/form-data; charset=UTF-8")
                .post("https://kese.nl/api/cargos")
                .then()
                .log().all().
                statusCode(202)
        ;
    }
}

