package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignupPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.sql.Time;
import java.util.Date;
import java.util.Random;

public class US27_StepDef {

    SignupPage signupPage = new SignupPage();
    LoginPage loginPage = new LoginPage();
    Date date = new Date();

    @And("user types {string} to the username input on the signup page")
    public void userTypesToTheUsernameInputOnTheSignupPage(String username) {
        signupPage.usernameInput.sendKeys(username + date.getTime());
    }

    @And("user types {string} to the email input on the signup page")
    public void userTypesToTheEmailInputOnTheSignupPage(String email) {
        signupPage.emailInput.sendKeys(date.getTime() + email);
    }

    @And("user types {string} to the password input on the signup page")
    public void userTypesToThePasswordInputOnTheSignupPage(String password) {
        signupPage.passwordInput.clear();
        signupPage.passwordInput.sendKeys(password);
    }

    @And("user types {string} to the repassword input on the signup page")
    public void userTypesToTheRepasswordInputOnTheSignupPage(String password) {
        signupPage.repasswordInput.clear();
        signupPage.repasswordInput.sendKeys(password);
    }


    @And("user clicks to the checkbox on signup page")
    public void userClicksToTheCheckboxOnSignupPage() {
        signupPage.rulesCheckbox.click();
    }

    @And("user clicks to the kayit ol button on the signup page")
    public void userClicksToTheKayitOlButtonOnTheSignupPage() {
        signupPage.kayitButton.click();
    }

    @And("user types {string} to the email input on the login page")
    public void userTypesToTheEmailInputOnTheLoginPage(String email) {
        loginPage.emailInput.sendKeys(date.getTime() + email);
    }

    @And("user types {string} to the password input on the login page")
    public void userTypesToThePasswordInputOnTheLoginPage(String password) {
        loginPage.sifreInput.sendKeys(password);
    }

    @And("user clicks to the giris yap button one the login page")
    public void userClicksToTheGirisYapButtonOneTheLoginPage() {
        loginPage.girisYapButton.click();
        BrowserUtilities.waitFor(5);
    }

    @Then("user verifies the page url is {string}")
    public void userVerifiesThePageUrlIs(String url) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, url);
    }

}
