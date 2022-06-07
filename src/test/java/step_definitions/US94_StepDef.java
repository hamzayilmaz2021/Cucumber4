package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.DecoderConfig;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

public class US94_StepDef {
    Response response = null;
    RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api")
            .setRelaxedHTTPSValidation()
            .build();

    @Given("user connects to {string} with required datas to create a new room post")
    public void userConnectsToWithRequiredDatasToCreateANewRoomPost(String endPoint) {

        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
        Map<String, Object> datalar = new HashMap<>();
        datalar.put("user", "{\"username\": \"kullanici1\", \"id\" : \"61d22c3189708a2d2aeeda1c\"}");
        datalar.put("address", "{\"label\" : \"London, Birleşik Krallık\", \"list\" : [\"London\", \"Birleşik Krallık\"], \"placeId\" : \"ChIJdd4hrwug2EcRmSrV3Vo6llI\"}");
        datalar.put("available_dates", "[{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]");
        datalar.put("tip",1);
        datalar.put("degisim",1);
        datalar.put("kirala",1);
        datalar.put("membercount",10);
        datalar.put("cinsiyet",1);
        datalar.put("yasaralik", "[1,2,3,4]");
        datalar.put("otobus",0);
        datalar.put("tren",0);
        datalar.put("tramway",0);
        datalar.put("arac",1);
        datalar.put("surface_area",500);
        datalar.put("bedrooms",10);
        datalar.put("bathrooms",5);
        datalar.put("toilets",3);
        datalar.put("salon",1);
        datalar.put("teras",1);
        datalar.put("tv",1);
        datalar.put("wifi",1);
        datalar.put("dishwasher",1);
        datalar.put("dryer",1);
        datalar.put("washing_machine",1);
        datalar.put("microwave_oven",1);
        datalar.put("baby_gear",1);
        datalar.put("computer",1);
        datalar.put("private_garden",1);
        datalar.put("bbq",1);
        datalar.put("ac",1);
        datalar.put("private_parking_space",1);
        datalar.put("private_parking_space_paid",1);
        datalar.put("bicycle_child",1);
        datalar.put("bicycle",1);
        datalar.put("video_game_console",1);
        datalar.put("balcony",1);
        datalar.put("lift",1);
        datalar.put("warehouse",1);
        datalar.put("lunapark",1);
        datalar.put("plaj",1);
        datalar.put("bisiklet",1);
        datalar.put("muzeler",1);
        datalar.put("baliktutma",1);
        datalar.put("kayakyapma",1);
        datalar.put("sporsalonu",1);
        datalar.put("dogayuruyusu",1);
        datalar.put("meydan",1);
        datalar.put("oyunparki",1);
        datalar.put("helalrestorant",1);
        datalar.put("avm",1);
        datalar.put("sinema",1);
        datalar.put("camii",1);
        datalar.put("pet", true);
        datalar.put("cigarette",true);
        datalar.put("plantcare",true);
        datalar.put("room_description", "Deneme bir iki üç");

        response = given().
                   queryParam("secret_token", ConfigurationReader.getProperty("secret_token")).
                   multiPart("photo0", photo0).
                   multiPart("photo1", photo1).
                   multiPart("photo2", photo2).
                   multiPart("photo3", photo3).
                   multiPart("photo4", photo4).
                   formParams(datalar).
                   contentType("multipart/form-data; charset=UTF-8").
                   spec(spec).

                   post(endPoint);

        String id = response.jsonPath().getString("_id");
        BrowserUtilities.writeDataToIdsFile("room",id);
        response.prettyPrint();
        System.out.println(response.getStatusCode());

    }

    @Then("user verifies the response status code is {int}")
    public void userVerifiesTheResponseStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Given("user connects to {string} with required datas to create a new room post negative one")
    public void userConnectsToWithRequiredDatasToCreateANewRoomPostNegativeOne(String endPoint) {
        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
        Map<String, Object> datalar = new HashMap<>();
        datalar.put("user", "{\"username\": \"kullanici1\", \"id\" : \"61d22c3189708a2d2aeeda1c\"}");
        datalar.put("address", "{\"label\" : \"London, Birleşik Krallık\", \"list\" : [\"London\", \"Birleşik Krallık\"], \"placeId\" : \"ChIJdd4hrwug2EcRmSrV3Vo6llI\"}");
        datalar.put("available_dates", "[{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]");
        datalar.put("tip",1);
        datalar.put("degisim",1);
        datalar.put("kirala",1);
        datalar.put("membercount",10);
        datalar.put("cinsiyet",1);
        datalar.put("yasaralik", "[1,2,3,4]");
        datalar.put("otobus",0);
        datalar.put("tren",0);
        datalar.put("tramway",0);
        datalar.put("arac",1);
        datalar.put("surface_area",500);
        datalar.put("bedrooms",10);
        datalar.put("bathrooms",5);
        datalar.put("toilets",3);
        datalar.put("salon",1);
        datalar.put("teras",1);
        datalar.put("tv",1);
        datalar.put("wifi",1);
        datalar.put("dishwasher",1);
        datalar.put("dryer",1);
        datalar.put("washing_machine",1);
        datalar.put("microwave_oven",1);
        datalar.put("baby_gear",1);
        datalar.put("computer",1);
        datalar.put("private_garden",1);
        datalar.put("bbq",1);
        datalar.put("ac",1);
        datalar.put("private_parking_space",1);
        datalar.put("private_parking_space_paid",1);
        datalar.put("bicycle_child",1);
        datalar.put("bicycle",1);
        datalar.put("video_game_console",1);
        datalar.put("balcony",1);
        datalar.put("lift",1);
        datalar.put("warehouse",1);
        datalar.put("lunapark",1);
        datalar.put("plaj",1);
        datalar.put("bisiklet",1);
        datalar.put("muzeler",1);
        datalar.put("baliktutma",1);
        datalar.put("kayakyapma",1);
        datalar.put("sporsalonu",1);
        datalar.put("dogayuruyusu",1);
        datalar.put("meydan",1);
        datalar.put("oyunparki",1);
        datalar.put("helalrestorant",1);
        datalar.put("avm",1);
        datalar.put("sinema",1);
        datalar.put("camii",1);
        datalar.put("pet", true);
        datalar.put("cigarette",true);
        datalar.put("plantcare",true);
        datalar.put("room_description", "Deneme bir iki üç");

        response = given().
                multiPart("photo0", photo0).
                multiPart("photo1", photo1).
                multiPart("photo2", photo2).
                multiPart("photo3", photo3).
                multiPart("photo4", photo4).
                formParams(datalar).
                contentType("multipart/form-data; charset=UTF-8").
                spec(spec).

                post(endPoint);


        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

    @Given("user connects to {string} with required datas without {string} to create a new room post negative two")
    public void userConnectsToWithRequiredDatasWithoutToCreateANewRoomPostNegativeTwo(String endPoint, String data) {
        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
        Map<String, Object> datalar = new HashMap<>();
        if(!data.equals("user")) datalar.put("user", "{\"username\": \"kullanici1\", \"id\" : \"61d22c3189708a2d2aeeda1c\"}");
        if(!data.equals("address")) datalar.put("address", "{\"label\" : \"London, Birleşik Krallık\", \"list\" : [\"London\", \"Birleşik Krallık\"], \"placeId\" : \"ChIJdd4hrwug2EcRmSrV3Vo6llI\"}");
        if(!data.equals("available_dates")) datalar.put("available_dates", "[{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]");
        if(!data.equals("tip")) datalar.put("tip",1);
        if(!data.equals("degisim")) datalar.put("degisim",1);
        if(!data.equals("kirala")) datalar.put("kirala",1);
        if(!data.equals("membercount")) datalar.put("membercount",10);
        if(!data.equals("cinsiyet")) datalar.put("cinsiyet",1);
        if(!data.equals("yasaralik")) datalar.put("yasaralik", "[1,2,3,4]");
        if(!data.equals("otobus")) datalar.put("otobus",0);
        if(!data.equals("tren")) datalar.put("tren",0);
        if(!data.equals("tramway")) datalar.put("tramway",0);
        if(!data.equals("arac")) datalar.put("arac",1);
        if(!data.equals("surface_area")) datalar.put("surface_area",500);
        if(!data.equals("bedrooms")) datalar.put("bedrooms",10);
        if(!data.equals("bathrooms")) datalar.put("bathrooms",5);
        if(!data.equals("toilets")) datalar.put("toilets",3);
        if(!data.equals("salon")) datalar.put("salon",1);
        if(!data.equals("teras")) datalar.put("teras",1);
        if(!data.equals("tv")) datalar.put("tv",1);
        if(!data.equals("wifi")) datalar.put("wifi",1);
        if(!data.equals("dishwasher")) datalar.put("dishwasher",1);
        if(!data.equals("dryer")) datalar.put("dryer",1);
        if(!data.equals("washing_machine")) datalar.put("washing_machine",1);
        if(!data.equals("microwave_oven")) datalar.put("microwave_oven",1);
        if(!data.equals("baby_gear")) datalar.put("baby_gear",1);
        if(!data.equals("computer")) datalar.put("computer",1);
        if(!data.equals("private_garden")) datalar.put("private_garden",1);
        if(!data.equals("bbq")) datalar.put("bbq",1);
        if(!data.equals("ac")) datalar.put("ac",1);
        if(!data.equals("private_parking_space")) datalar.put("private_parking_space",1);
        if(!data.equals("private_parking_space_paid")) datalar.put("private_parking_space_paid",1);
        if(!data.equals("bicycle_child")) datalar.put("bicycle_child",1);
        if(!data.equals("bicycle")) datalar.put("bicycle",1);
        if(!data.equals("video_game_console")) datalar.put("video_game_console",1);
        if(!data.equals("balcony")) datalar.put("balcony",1);
        if(!data.equals("lift")) datalar.put("lift",1);
        if(!data.equals("warehouse")) datalar.put("warehouse",1);
        if(!data.equals("lunapark")) datalar.put("lunapark",1);
        if(!data.equals("plaj")) datalar.put("plaj",1);
        if(!data.equals("bisiklet")) datalar.put("bisiklet",1);
        if(!data.equals("muzeler")) datalar.put("muzeler",1);
        if(!data.equals("baliktutma")) datalar.put("baliktutma",1);
        if(!data.equals("kayakyapma")) datalar.put("kayakyapma",1);
        if(!data.equals("sporsalonu")) datalar.put("sporsalonu",1);
        if(!data.equals("dogayuruyusu")) datalar.put("dogayuruyusu",1);
        if(!data.equals("meydan")) datalar.put("meydan",1);
        if(!data.equals("oyunparki")) datalar.put("oyunparki",1);
        if(!data.equals("helalrestorant")) datalar.put("helalrestorant",1);
        if(!data.equals("avm")) datalar.put("avm",1);
        if(!data.equals("sinema")) datalar.put("sinema",1);
        if(!data.equals("camii")) datalar.put("camii",1);
        if(!data.equals("pet")) datalar.put("pet", true);
        if(!data.equals("cigarette")) datalar.put("cigarette",true);
        if(!data.equals("plantcare")) datalar.put("plantcare",true);
        if(!data.equals("room_description")) datalar.put("room_description", "Deneme bir iki üç");

        response = given().
                queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZDIyYzMxODk3MDhhMmQyYWVlZGExYyIsImVtYWlsIjoia3VsbGFuaWNpMUBnbWFpbC5jb20iLCJyb2wiOiJrdWxsYW5pY2kiLCJrdWxsYW5pY2lfYWRpIjoia3VsbGFuaWNpMSIsImR1cnVtIjoxfSwiaWF0IjoxNjQzOTg1NDk5LCJleHAiOjE2NzU1MjE0OTl9.oioO4xj68vfOOwI-QKk6MkblbpiY7rF2dqk1W8mkmug").
                multiPart("photo0", photo0).
                multiPart("photo1", photo1).
                multiPart("photo2", photo2).
                multiPart("photo3", photo3).
                multiPart("photo4", photo4).
                formParams(datalar).
                contentType("multipart/form-data; charset=UTF-8").
                spec(spec).

                post(endPoint);


        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}
