package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.NewCarPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US134_StepDef {

    NewCarPage page = new NewCarPage();

    @Given("user goes to the fifth step on the new car page")
    public void userGoesToTheFifthStepOnTheNewCarPage() {
        page.step1_taksi.click();
        BrowserUtilities.waitFor(3);
        page.ilerleButton.click();
        page.step2_baslangicAdres.sendKeys("Frankfurt");
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.cssSelector("[id$='-option-0']")).click();

        page.step2_bitisAdres.sendKeys("Paris");
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.cssSelector("[id$='-option-0']")).click();

        BrowserUtilities.waitFor(1);
        page.ilerleButton.click();
        page.step3_farketmezOption.click();
        page.step3_carDescriptionInput.sendKeys("Açıklama");
        BrowserUtilities.waitFor(1);
        page.ilerleButton.click();
        page.step4_CinsiyetFarketmezOption.click();
        page.step4_yasAralikFarketmezOption.click();
        page.step4_incrementButton.click();
        BrowserUtilities.waitFor(1);
        page.ilerleButton.click();
    }

    @And("user verifies the ilerle button is visible on the new car page")
    public void userVerifiesTheIlerleButtonIsVisibleOnTheNewCarPage() {
        Assert.assertTrue(page.ilerleButton.isDisplayed());
    }

    @And("user clicks to the ilerle button on the new car page")
    public void userClicksToTheIlerleButtonOnTheNewCarPage() {
        page.ilerleButton.click();
    }

    @And("user chooses date and time on the new car page")
    public void userChoosesDateAndTimeOnTheNewCarPage() {
        page.step5_chooseDateInput.click();
        page.step5_todayDateButton.click();
        BrowserUtilities.waitFor(1);
        page.step5_todayDateButton.click();

        page.step5_chooseTimeInput.click();
        page.step5_firstTimeOption.click();
    }
}
