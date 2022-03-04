package step_definitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.HomeStatus;
import pojos.LoginPojo;
import pojos.UserPojo;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Login {
    Response response = null;
    RequestSpecification spec = new RequestSpecBuilder().setRelaxedHTTPSValidation().
            setBaseUri(ConfigurationReader.getProperty("kese_api")).build();
    LoginPojo loginPojo = new LoginPojo("kullanici1@gmail.com", "1234");
    UserPojo userPojo = null;

    @Given("user log in with api")
    public void userLogInWithApi() throws IOException {

        ObjectMapper loginMapper = new ObjectMapper();
        String loginInfo = loginMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginPojo);

        response = given().
                contentType(ContentType.JSON).
                spec(spec).
                body(loginInfo).
                post("/user/account/login");

        ObjectMapper userMapper = new ObjectMapper();
        userPojo = userMapper.readValue(response.jsonPath().prettyPrint(), UserPojo.class);

        System.out.println("token : " +userPojo.getToken());
        System.out.println("kullanici_adi : " +userPojo.getKullanici_adi());
        System.out.println("rol : " +userPojo.getRol());
        System.out.println("_id : " +userPojo.get_id());

    }
}
