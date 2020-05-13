package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

import pages.LandingPage;
import pages.LoginPage;

public class LoginPageSteps extends ScenarioSteps {

    private LoginPage onLoginPage() {
        return pages().get(LoginPage.class);
    }

    @Steps
    public LandingPage landingPage;

    @Step public void open(String url) {
        onLoginPage().openUrl(url);
    }

    @Step public LoginPageSteps shouldSeeUserNameEnabled() {
        assertThat(onLoginPage().isUserNameEnabled()).isTrue();
        return this;
    }

    @Step public LoginPageSteps enterUserName() {
        onLoginPage().enterUserName();
        return this;
    }

    @Step public LoginPageSteps enterPassword() {
        onLoginPage().enterPassword();
        return this;
    }

    @Step public LoginPageSteps shouldSeeSubmitButtonEnabled() {
        assertThat(onLoginPage().isSubmitButtonEnabled()).isTrue();
        return this;
    }
}
