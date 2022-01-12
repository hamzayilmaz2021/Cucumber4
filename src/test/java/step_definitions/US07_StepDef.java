package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.List;

public class US07_StepDef {

    HomePage homePage = new HomePage();

    @Then("user verifies popular posts section titles are visible")
    public void userVerifiesPopularPostsSectionTitlesAreVisible() {
        Assert.assertTrue(  homePage.popularIlanlarEvDegisimiButon.isDisplayed()  );
        Assert.assertTrue(  homePage.popularIlanlarOdaKiralaButon.isDisplayed()  );
        Assert.assertTrue(  homePage.popularIlanlarBedAndBreakfastButon.isDisplayed()  );
    }

    @Then("user verifies popular posts section titles are clickable")
    public void userVerifiesPopularPostsSectionTitlesAreClickable() {
        Assert.assertTrue(  homePage.popularIlanlarEvDegisimiButon.isEnabled()  );
        Assert.assertTrue(  homePage.popularIlanlarOdaKiralaButon.isEnabled()  );
        Assert.assertTrue(  homePage.popularIlanlarBedAndBreakfastButon.isEnabled()  );
    }

    @And("user clicks to the {string} button in popular posts section")
    public void userClicksToTheButtonInPopularPostsSection(String type) {
        if(type.equals("Ev Değişimi")){
            homePage.popularIlanlarEvDegisimiButon.click();
        }else if(type.equals("Oda Kirala")){
            homePage.popularIlanlarOdaKiralaButon.click();
        }else if(type.equals("Bed & Breakfast")){
            homePage.popularIlanlarBedAndBreakfastButon.click();
        }
    }

    @Then("user verifies {string} posts contain {string} text in url")
    public void userVerifiesPostsContainTextInUrl(String type, String url) {
        if(type.equals("Ev Değişimi")){
            List<WebElement> list = homePage.evDegisimiPopulerIlanLinkleri;
            for(WebElement link : list){
                Assert.assertTrue(link.getAttribute("href").contains( url ));
            }
        }else if(type.equals("Oda Kirala")){
            List<WebElement> list = homePage.odaKiralaPopulerIlanLinkleri;
            for(WebElement link : list){
                Assert.assertTrue(link.getAttribute("href").contains( url ));
            }
        }else if(type.equals("Bed & Breakfast")){
            List<WebElement> list = homePage.bedBreakfastPopulerIlanLinkleri;
            for(WebElement link : list){
                Assert.assertTrue(link.getAttribute("href").contains( url ));
            }
        }
    }
}
