package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google extends BasePage {

    @FindBy ( name = "q" )
    public WebElement aramaKutusu;

}
