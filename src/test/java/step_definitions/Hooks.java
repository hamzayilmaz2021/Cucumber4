package step_definitions;

import utilities.BrowserUtilities;
import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before("@ui")
    public void setUp(){

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After("@ui")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", scenario.getName()+"_screenshot");

        }
        BrowserUtilities.waitFor(3);
        Driver.closeDriver();
    }
}