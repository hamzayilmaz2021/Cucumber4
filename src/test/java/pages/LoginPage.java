package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy ( linkText = "Şifremi Unuttum")
    public WebElement siremiUnuttumLink;

    @FindBy ( name = "email" )
    public WebElement emailInput;

    @FindBy ( name = "sifre")
    public WebElement sifreInput;

    @FindBy ( xpath = "//button[@type='submit' and contains(text(), 'Giriş Yap')]")
    public WebElement girisYapButton;

}
