package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US12_StepDef {

    LoginPage loginPage = new LoginPage();

    @Given("user goes to {string} page")
    public void userGoesToPage(String url) {
        Driver.getDriver().get("http://test.kese.nl/login");
    }

    @Then("user asserts sifremi unuttum is visible and enabled")
    public void userAssertsSifremiUnuttumIsVisibleAndEnabled() {
        boolean isDisplayed = loginPage.siremiUnuttumLink.isDisplayed();
        boolean isEnabled = loginPage.siremiUnuttumLink.isEnabled();

        Assert.assertTrue(isDisplayed);
        Assert.assertTrue(isEnabled);
    }

    @Then("user asserts sifremi unuttum is underlined")
    public void userAssertsSifremiUnuttumIsUnderlined() {
        String cssValue = loginPage.siremiUnuttumLink.getCssValue("text-decoration");

        Assert.assertTrue(cssValue.contains("underline"));
        // bir elementin css değeri "text-decoration : underline" olarak yazılırsa, yazının altına çizgi ekler.
    }

    @Given("user clicks to the sifremi unuttum")
    public void userClicksToTheSifremiUnuttum() {
        loginPage.siremiUnuttumLink.click();
    }

    @Then("user asserts sifremi unuttum should redirect to the {string}")
    public void userAssertsSifremiUnuttumShouldRedirectToThe(String url) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, url);
    }


}
