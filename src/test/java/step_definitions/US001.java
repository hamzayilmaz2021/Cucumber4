package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Google;
import utilities.Driver;

public class US001 {

    Google page = new Google();

    @Given("kullanici {string}a gider")
    public void kullaniciAGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici {string} ifadesini arama kutusuna yazar")
    public void kullaniciIfadesiniAramaKutusunaYazar(String ifade) {

        page.aramaKutusu.sendKeys(ifade + Keys.ENTER);

    }
}
