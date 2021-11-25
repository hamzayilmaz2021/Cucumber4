package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KielHomePage;
import utilities.Driver;

public class US008 {

    KielHomePage page = new KielHomePage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici ilan ekle linkinin aktif oldugunu dogrular")
    public void kullaniciIlanEkleLinkininAktifOldugunuDogrular() {
        boolean durum = page.ilanEkleButon.isEnabled();
        Assert.assertTrue(durum);
    }

    @Then("kullanici ilan ekle linkinin arkaplan renginin {string} oldugunu dogrular")
    public void kullaniciIlanEkleLinkininArkaplanRengininOldugunuDogrular(String renkKodu) {
        String arkaplanRengi = page.ilanEkleButon.getCssValue("background-color");

        Assert.assertEquals(arkaplanRengi, renkKodu);
    }
}
