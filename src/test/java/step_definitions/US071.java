package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US071 {

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder().setBaseUri("http://environment.kielmarketplace.nl/api").build();

    @Given("kullanici {string} sayfasina get tipinde baglanir")
    public void kullaniciSayfasinaGetTipindeBaglanir(String adres) {
        response = given().
                    contentType(ContentType.JSON).
                    spec(request).
                    get(adres);
    }

    @Then("kullanici durum kodunun {int} oldugunu dogrular")
    public void kullaniciDurumKodununOldugunuDogrular(int durumKodu) {
        Assert.assertEquals(response.getStatusCode(),durumKodu);
    }

    @Then("kullanici gelen cevap icerisinde sonuc ozelliginin degerinin true oldugunu dogrular")
    public void kullaniciGelenCevapIcerisindeSonucOzelligininDegerininTrueOldugunuDogrular() {
        boolean gelenCevap = response.jsonPath().getBoolean("sonuc");
        Assert.assertEquals(true,gelenCevap);
    }
}
