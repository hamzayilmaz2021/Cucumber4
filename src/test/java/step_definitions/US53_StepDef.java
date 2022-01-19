package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.NewHomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US53_StepDef {

    NewHomePage newHomePage = new NewHomePage();

    @And("user chooses house type on the new home step one page")
    public void userChoosesHouseTypeOnTheNewHomeStepOnePage() {
        newHomePage.step1_MustakilEvOption.click();
    }

    @And("user clicks to the ilerle button on the new home page")
    public void userClicksToTheIlerleButtonOnTheNewHomePage() {
        newHomePage.ilerleButton.click();
    }

    @And("user chooses an address from the list in new home step two page")
    public void userChoosesAnAddressFromTheListInNewHomeStepTwoPage() {
        newHomePage.step2_AddressInput.sendKeys("London"); // Keys.ENTER
        BrowserUtilities.waitFor(3);
        Driver.getDriver().findElement(By.id("react-select-2-option-0")).click();

        // Bir webelementin içeriği, HTML olarak seleniumda nasıl görüntülenebilir ?
        /*String icerik = newHomePage.step2_AddressList.getAttribute("innerHTML");

        System.out.println(icerik);

        <div class=" css-11unzgr">
                <div class=" css-1n7v3ny-option" id="react-select-2-option-0" tabindex="-1">London, Birleşik Krallık</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-1" tabindex="-1">London, Ontario, Kanada</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-2" tabindex="-1">London, Kentucky, Amerika Birleşik Devletleri</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-3" tabindex="-1">London, Ohio, Amerika Birleşik Devletleri</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-4" tabindex="-1">Londonderry, Birleşik Krallık</div>
        </div>*/
    }

    @And("user clicks to the checkbox on the new home step two page")
    public void userClicksToTheCheckboxOnTheNewHomeStepTwoPage() {
        newHomePage.step2_CheckBox.click();
    }

    @And("user types usage area to the input on the new home step three page")
    public void userTypesUsageAreaToTheInputOnTheNewHomeStepThreePage() {
        newHomePage.step3_UsageAreaInput.sendKeys("120");
    }

    @And("user clicks on the increment buttons on the new home step three page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepThreePage() {
        for(WebElement e : newHomePage.step3_incrementButtons){
            e.click();
        }
    }

    @And("user clicks on the increment button of tek kisilik yatak on the new home step four page")
    public void userClicksOnTheIncrementButtonOfTekKisilikYatakOnTheNewHomeStepFourPage() {
        newHomePage.step4_incrementButtonOfTekKisilikYatak.click();
    }

    @And("user clicks on the tv option on the new home step five page")
    public void userClicksOnTheTvOptionOnTheNewHomeStepFivePage() {
        newHomePage.step5_TvOption.click();
    }

    @And("user types a description to the input on the new home step six page")
    public void userTypesADescriptionToTheInputOnTheNewHomeStepSixPage() {
        newHomePage.step6_DescInput.sendKeys("Merhabalar");
    }

    @And("user clicks to the lunapark on the new home step seven page")
    public void userClicksToTheLunaparkOnTheNewHomeStepSevenPage() {
        newHomePage.step7_LuneparkOption.click();
    }

    @And("user clicks to the all hayir options on the new home step eight page")
    public void userClicksToTheAllHayirOptionsOnTheNewHomeStepEightPage() {
        for(WebElement e : newHomePage.step8_HayirOptions){
            e.click();
        }
    }

    @And("user chooses the date on the new home step nine page")
    public void userChoosesTheDateOnTheNewHomeStepNinePage() {
        newHomePage.step9_FirstDatePickerInput.click();
        newHomePage.step9_TodayOption.click();
        BrowserUtilities.waitFor(1);
        newHomePage.step9_TodayOption.click();
    }

    @Then("user uploads ten photos on the new home step en page")
    public void userUploadsTenPhotosOnTheNewHomeStepEnPage() {
        System.out.println(System.getProperty("user.dir") + "src/test/resources/pictures/1.jpg");
        newHomePage.step10_FileUpload1.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        newHomePage.step10_FileUpload2.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        newHomePage.step10_FileUpload3.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        newHomePage.step10_FileUpload4.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        newHomePage.step10_FileUpload5.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
        newHomePage.step10_FileUpload6.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        newHomePage.step10_FileUpload7.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        newHomePage.step10_FileUpload8.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        newHomePage.step10_FileUpload9.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        newHomePage.step10_FileUpload10.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
    }

    @Then("user uploads five photos on the new home step en page")
    public void userUploadsFivePhotosOnTheNewHomeStepEnPage() {
        newHomePage.step10_FileUpload1.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        newHomePage.step10_FileUpload2.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        newHomePage.step10_FileUpload3.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        newHomePage.step10_FileUpload4.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        newHomePage.step10_FileUpload5.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");
    }

    @Then("user verifies the resimleri kaydet button is clickable")
    public void userVerifiesTheResimleriKaydetButtonIsClickable() {
        boolean isEnabled = newHomePage.step10_ResimleriKaydetButton.isEnabled();
        Assert.assertTrue(isEnabled);
    }
}
