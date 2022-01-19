package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewHomePage extends BasePage{
    @FindBy (xpath = "//*[text() = 'Müstakil Ev']")
    public WebElement step1_MustakilEvOption;

    @FindBy (xpath = "//*[@id='next' and contains(text(), 'İlerle')]")
    public WebElement ilerleButton;

    @FindBy (id = "react-select-2-input")
    public WebElement step2_AddressInput;

    @FindBy (xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy (id = "flexRadioDefault2")
    public WebElement step2_CheckBox;

    @FindBy (id = "size")
    public WebElement step3_UsageAreaInput;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy (xpath = "//button[text() = '+']")
    public WebElement step4_incrementButtonOfTekKisilikYatak;

    @FindBy (xpath = "//*[text() = 'TV']")
    public WebElement step5_TvOption;

    @FindBy (id = "home")
    public WebElement step6_DescInput;

    @FindBy (xpath = "//*[text() = 'Lunapark']")
    public WebElement step7_LuneparkOption;

    @FindBy (xpath = "//*[text() = 'Hayır']")
    public List<WebElement> step8_HayirOptions;

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



}
