package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

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
}
