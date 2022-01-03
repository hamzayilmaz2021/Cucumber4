package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KielHomePage extends BasePage {

    @FindBy ( xpath = "//a[@href='/add_ilan']")
    public WebElement ilanEkleButon;

    @FindBy ( xpath = "//a[@href='/login']")
    public WebElement girisYapButon;

}