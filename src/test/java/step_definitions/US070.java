package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US070 {

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder().setBaseUri("http://environment.kielmarketplace.nl/api").build();

    @Given("kullanici {string} sayfasina post tipinde email {string} ve sifre {string} bilgileri ile baglanir")
    public void kullaniciSayfasinaPostTipindeEmailVeSifreBilgileriIleBaglanir(String endPoint, String email, String password) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", email);
        jsonObject.put("sifre", password);

        response = given().
                   contentType(ContentType.JSON).
                   spec(request).
                   body(jsonObject.toString()).
                   post(endPoint);

    }

    @Then("kullanici gelen cevabin durum kodunun {int} oldugunu dogrular")
    public void kullaniciGelenCevabinDurumKodununOldugunuDogrular(int statusCode) {
        Assert.assertTrue(response.statusCode() == statusCode);
    }

    @Then("kullanici gelen cevap icerisinde kullaniciya ait verilerin bulundugunu dogrular")
    public void kullaniciGelenCevapIcerisindeKullaniciyaAitVerilerinBulundugunuDogrular() {
        String sonuc    = response.jsonPath().getString("sonuc");    // null
        String id       = response.jsonPath().getString("_id");      // null
        String username = response.jsonPath().getString("username"); // null
        String rol      = response.jsonPath().getString("rol");      // null

        Assert.assertNotNull(sonuc);
        Assert.assertNotNull(id);
        Assert.assertNotNull(username);
        Assert.assertNotNull(rol);
    }

    @Then("kullanici gelen cevap icerisinde sonuc ozelliginin var oldugunu dogrular")
    public void kullaniciGelenCevapIcerisindeSonucOzelligininVarOldugunuDogrular() {
        String sonuc    = response.jsonPath().getString("sonuc");    // null
        Assert.assertNotNull(sonuc);
        Assert.assertTrue(response.getStatusCode() == 200);
    }
}
