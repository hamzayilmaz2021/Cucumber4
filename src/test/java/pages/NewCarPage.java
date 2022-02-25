package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCarPage extends BasePage{
    @FindBy ( xpath = "//div[. = 'Taksi']")
    public WebElement step1_taksi;

    @FindBy ( xpath = "//button[. = 'İlerle']")
    public WebElement ilerleButton;

    @FindBy ( xpath = "(//input[@autocapitalize = 'none'])[1]")
    public WebElement step2_baslangicAdres;

    @FindBy ( xpath = "(//input[@autocapitalize = 'none'])[2]")
    public WebElement step2_bitisAdres;

    @FindBy ( xpath = "(//input[@autocapitalize = 'none'])[3]")
    public WebElement step2_gecisNoktaAdres;

    @FindBy ( xpath = "//div[. = 'Farketmez']")
    public WebElement step3_farketmezOption;

    @FindBy (  id="car"  )
    public WebElement step3_carDescriptionInput;

    @FindBy (  xpath =  "(//div[. = 'Farketmez'])[1]")
    public WebElement step4_yasAralikFarketmezOption;

    @FindBy (  xpath =  "(//div[. = 'Farketmez'])[2]")
    public WebElement step4_CinsiyetFarketmezOption;

    @FindBy ( xpath = "//button[. = '+']" )
    public WebElement step4_incrementButton;

    @FindBy ( xpath = "//input[@placeholder = 'Tarih seçmek için tıklayınız']")
    public WebElement step5_chooseDateInput;

    @FindBy ( css = " [class~=react-datepicker__day--today]" )
    public WebElement step5_todayDateButton;

    @FindBy ( xpath = "(//input[@type='text'])[3]")
    public WebElement step5_chooseTimeInput;

    @FindBy ( className = "react-datepicker__time-list-item")
    public WebElement step5_firstTimeOption;


}
