package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DenemePage {
    @FindBy(xpath = "//a[@class='text-decoration-underline']")
    public WebElement sifremiUnuttumButtonu;


    @FindBy ( xpath = "//input[@type='email']")
    public WebElement emailbutonu;

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement sifremiDegistirButton;

    @FindBy  (xpath = "//div[@class='form-group text-center py-3']")
    public WebElement emailAdresineSifirlamaLinkiGonderildiYazisi;
}
