package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KielAddIlanPage extends BasePage {

    @FindBy ( name = "country" )
    public WebElement ulkelerDropdown;

}
