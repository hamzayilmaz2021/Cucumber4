package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    @FindBy ( id = "inputUsername")
    public WebElement usernameInput;

    @FindBy ( id = "staticEmail")
    public WebElement emailInput;

    @FindBy ( id = "sifre")
    public WebElement passwordInput;

    @FindBy ( id = "sifreTekrar")
    public WebElement repasswordInput;

    @FindBy ( id = "flexCheckChecked")
    public WebElement rulesCheckbox;

    @FindBy ( xpath = "//button[@type='submit' and contains(text(), 'Kayıt Oluştur')]")
    public WebElement kayitButton;

}
