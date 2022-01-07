package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{
    @FindBy ( xpath = "//input[@type='email']")
    public WebElement emailInput;

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement sifremiDegistirButton;

    /*
    @FindBy ( xpath = "//*[contains(text(), 'Girmiş olduğunuz email adresine sıfırlama linki gönderildi')]")
    public WebElement mailGonderildiText;

    @FindBy ( xpath = "//*[contains(text(), 'Böyle bir kullanıcı bulunamadı.')]")
    public WebElement kullaniciBulunamadiText;
    */
}
