package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.ForgotPasswordPage;
import pages.NewHomePage;

public class US31_StepDef {
    NewHomePage newHomePage = new NewHomePage();

    @And("user verifies step status is {string}")
    public void userVerifiesStepStatusIs(String step) {
        String text = newHomePage.stepStatus.getText();

        Assert.assertEquals(step, text);
    }
}
