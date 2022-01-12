package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//*[@role='tabpanel'][1]//a")
    public List<WebElement> evDegisimiPopulerIlanLinkleri;

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//*[@role='tabpanel'][4]//a")
    public List<WebElement> odaKiralaPopulerIlanLinkleri;

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//*[@role='tabpanel'][5]//a")
    public List<WebElement> bedBreakfastPopulerIlanLinkleri;

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//ul/li[1]")
    public WebElement popularIlanlarEvDegisimiButon;

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//ul/li[2]")
    public WebElement popularIlanlarOdaKiralaButon;

    @FindBy (xpath = "//*[@class='tabs-block tab-v1  ']//ul/li[3]")
    public WebElement popularIlanlarBedAndBreakfastButon;
}
