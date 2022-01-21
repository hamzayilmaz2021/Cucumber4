package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NewHomePage;

public class US55_StepDef {

    NewHomePage newHomePage = new NewHomePage();

    @Given("user chooses {string} as house type on the new home step one page")
    public void userChoosesAsHouseTypeOnTheNewHomeStepOnePage(String tip) {
        if(tip.equalsIgnoreCase("Müstakil Ev")){
            newHomePage.step1_MustakilEvOption.click();
        }else if(tip.equalsIgnoreCase("Apartman Dairesi")){
            newHomePage.step1_ApartmanDairesiOption.click();
        }else{ //Stüdyo Daire
            newHomePage.step1_StudyoDaireOption.click();
        }
    }

    @And("user verifies the geri button is enabled")
    public void userVerifiesTheGeriButtonIsEnabled() {
        boolean isEnabled = newHomePage.geriButton.isEnabled();

        Assert.assertTrue(isEnabled);
    }

    @And("user clicks to the geri button")
    public void userClicksToTheGeriButton() {
        newHomePage.geriButton.click();
    }

    @And("user verifies {string} is selected on the new home step one page")
    public void userVerifiesIsSelectedOnTheNewHomeStepOnePage(String tip) {
        if(tip.equalsIgnoreCase("Müstakil Ev")){
            String classDegerleri = newHomePage.step1_MustakilEvOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }else if(tip.equalsIgnoreCase("Apartman Dairesi")){
            String classDegerleri = newHomePage.step1_ApartmanDairesiOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }else{ //Stüdyo Daire
            String classDegerleri = newHomePage.step1_StudyoDaireOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }
    }

    @And("user types {string} to the ev otobus input on the new home step two page")
    public void userTypesToTheEvOtobusInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvOtobusInput.clear();
        newHomePage.step2_EvOtobusInput.sendKeys(mesafe);
    }

    @And("user types {string} to the ev tren input on the new home step two page")
    public void userTypesToTheEvTrenInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTrenInput.clear();
        newHomePage.step2_EvTrenInput.sendKeys(mesafe);
    }

    @And("user types {string} to the ev tramway input on the new home step two page")
    public void userTypesToTheEvTramwayInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTramwayInput.clear();
        newHomePage.step2_EvTramwayInput.sendKeys(mesafe);
    }

    @And("user verifies the variable of ev otobus input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvOtobusInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvOtobusInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the variable of ev tren input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTrenInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTrenInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the variable of ev tramway input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTramwayInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTramwayInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the checkbox is checked on the new home step two page")
    public void userVerifiesTheCheckboxIsCheckedOnTheNewHomeStepTwoPage() {
        boolean isChecked = newHomePage.step2_CheckBox.isSelected();
        Assert.assertTrue(isChecked);
    }

    @And("user verifies that the numbers are {int} {int} {int} {int} on the new home step three page")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepThreePage(int sayi1, int sayi2, int sayi3, int sayi4) {
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(0).getText(), sayi1+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(1).getText(), sayi2+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(2).getText(), sayi3+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(3).getText(), sayi4+"");
    }

    @And("user verifies the value of usage area input is {string} on the new home step three page")
    public void userVerifiesTheValueOfUsageAreaInputIsOnTheNewHomeStepThreePage(String deger) {
        String value = newHomePage.step3_UsageAreaInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks on the increment buttons on the new home step four page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepFourPage() {
        for(WebElement e : newHomePage.step4_incrementButtons){
            e.click();
        }
    }

    @And("user verifies that the numbers are {int} {int} {int} {int} {int} {int} {int} {int} on the new home step four page")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepFourPage(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5, int sayi6, int sayi7, int sayi8) {
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(0).getText(), sayi1+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(1).getText(), sayi2+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(2).getText(), sayi3+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(3).getText(), sayi4+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(4).getText(), sayi5+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(5).getText(), sayi6+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(6).getText(), sayi7+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(7).getText(), sayi8+"");
    }

    @And("user clicks to the all options on the new home step five page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepFivePage() {
        for(WebElement e : newHomePage.step5_AllOptions){
            e.click();
        }
    }

    @And("user verifies the all options are selected on the new home step five page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepFivePage() {
        for(WebElement e : newHomePage.step5_AllOptions){
            Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @And("user verifies the value of description input is same with {string} on the new home step six page")
    public void userVerifiesTheValueOfDescriptionInputIsSameWithOnTheNewHomeStepSixPage(String deger) {
        String value = newHomePage.step6_DescInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks to the all options on the new home step seven page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepSevenPage() {
        for(WebElement e : newHomePage.step7_AllOptions){
            e.click();
        }
    }

    @And("user verifies the all options are selected on the new home step seven page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepSevenPage() {
        for(WebElement e : newHomePage.step7_AllOptions){
            Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @And("user verifies the all hayir options are selected on the new home step eight page")
    public void userVerifiesTheAllHayirOptionsAreSelectedOnTheNewHomeStepEightPage() {
        for(WebElement e : newHomePage.step8_HayirOptions){
            Assert.assertTrue(e.getAttribute("class").contains("bg-warning"));
        }
    }
}
