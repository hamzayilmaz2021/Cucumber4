package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewHomePage extends BasePage{
    @FindBy (xpath = "//*[text() = 'Müstakil Ev']/../../div")
    public WebElement step1_MustakilEvOption;

    @FindBy (xpath = "//*[text() = 'Apartaman Dairesi']/../../div")
    public WebElement step1_ApartmanDairesiOption;

    @FindBy (xpath = "//*[text() = 'Stüdyo Daire']/../../div")
    public WebElement step1_StudyoDaireOption;

    @FindBy (xpath = "//*[@id='next' and contains(text(), 'İlerle')]")
    public WebElement ilerleButton;

    @FindBy(xpath = "//button[text() = 'Geri']")
    public WebElement geriButton;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;

    @FindBy (xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy (xpath = "(//input[@type='number'])[1]")
    public WebElement step2_EvOtobusInput;

    @FindBy (xpath = "(//input[@type='number'])[2]")
    public WebElement step2_EvTrenInput;

    @FindBy (xpath = "(//input[@type='number'])[3]")
    public WebElement step2_EvTramwayInput;

    @FindBy (id = "flexRadioDefault2")
    public WebElement step2_CheckBox;

    @FindBy (id = "size")
    public WebElement step3_UsageAreaInput;

    @FindBy(className = "input-number-value")
    public List<WebElement> step3_AllNumbers;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy (xpath = "//button[text() = '+']")
    public WebElement step4_incrementButtonOfTekKisilikYatak;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step4_incrementButtons;

    @FindBy(className = "input-number-value")
    public List<WebElement> step4_AllNumbers;

    @FindBy (xpath = "//*[text() = 'TV']")
    public WebElement step5_TvOption;

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step5_AllOptions;

    @FindBy (id = "home")
    public WebElement step6_DescInput;

    @FindBy (xpath = "//*[text() = 'Lunapark']")
    public WebElement step7_LuneparkOption;

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step7_AllOptions;

    @FindBy (xpath = "//*[text() = 'Hayır']")
    public List<WebElement> step8_HayirOptions;

    @FindBy (xpath = "//*[text() = 'Evet']")
    public List<WebElement> step8_EvetOptions;

    @FindBy (xpath = "//input[@placeholder = 'Tarih seçmek için tıklayınız'][1]")
    public WebElement step9_FirstDatePickerInput;

    @FindBy (css = " [class~=react-datepicker__day--today]")
    public WebElement step9_TodayOption;

    @FindBy (id = "file-upload1")
    public WebElement step10_FileUpload1;

    @FindBy (id = "file-upload2")
    public WebElement step10_FileUpload2;

    @FindBy (id = "file-upload3")
    public WebElement step10_FileUpload3;

    @FindBy (id = "file-upload4")
    public WebElement step10_FileUpload4;

    @FindBy (id = "file-upload5")
    public WebElement step10_FileUpload5;

    @FindBy (id = "file-upload6")
    public WebElement step10_FileUpload6;

    @FindBy (id = "file-upload7")
    public WebElement step10_FileUpload7;

    @FindBy (id = "file-upload8")
    public WebElement step10_FileUpload8;

    @FindBy (id = "file-upload9")
    public WebElement step10_FileUpload9;

    @FindBy (id = "file-upload10")
    public WebElement step10_FileUpload10;

    @FindBy (xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement step10_ResimleriKaydetButton;

    public WebElement getStep5Option(String text){
        for(WebElement e : step5_AllOptions){
            if(e.getText().equalsIgnoreCase(text)){
                return e;
            }
        }

        return null;
    }

    public WebElement getStep7Option(String text){
        for(WebElement e : step7_AllOptions){
            if(e.getText().equalsIgnoreCase(text)){
                return e;
            }
        }

        return null;
    }
}
