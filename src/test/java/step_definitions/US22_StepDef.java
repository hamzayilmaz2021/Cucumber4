package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ForgotPasswordPage;
import utilities.Driver;

public class US22_StepDef {

    ForgotPasswordPage page = new ForgotPasswordPage();

    @And("user types {string} to the email input on the forgot password page")
    public void userTypesToTheEmailInputOnTheForgotPasswordPage(String mail) {
        page.emailInput.sendKeys(mail);
    }

    @And("user clicks to the sifremi degistir button on the forgot password page")
    public void userClicksToTheSifremiDegistirButtonOnTheForgotPasswordPage() {
        page.sifremiDegistirButton.click();
    }

    @Then("user verifies {string} is visible")
    public void userVerifiesIsVisible(String text) {
        WebElement yazi = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        Assert.assertTrue(yazi.isDisplayed());
    }
}
