package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy ( linkText = "Şifremi Unuttum")
    public WebElement siremiUnuttumLink;

}
