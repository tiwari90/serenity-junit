package testSuites;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.LoginPageSteps;

@RunWith(SerenityRunner.class)

public class LoginTests extends BaseTest {

    @Steps LoginPageSteps loginPageSteps;

    @Test public void verifyLoginPageElements() {
        loginPageSteps.open("http://thedemosite.co.uk/savedata.php");
        loginPageSteps.shouldSeeUserNameEnabled();
        loginPageSteps.enterUserName();
        loginPageSteps.enterPassword().landingPage.moveMouseToLogo();
        loginPageSteps.shouldSeeSubmitButtonEnabled();
    }
}
