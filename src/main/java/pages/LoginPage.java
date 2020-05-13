package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(name = "username") private WebElementFacade userName;

    //Intentionally made changes to locator to reproduce the scenario.
    @FindBy(name = "password123") private WebElementFacade password;

    @FindBy(name = "FormsButton2") private WebElementFacade submitButton;

    public boolean isUserNameEnabled() {
        LOGGER.info("Checking Username Enabled");
        return userName.isEnabled();
    }

    public void enterUserName() {
        LOGGER.info("Enter Username");
        userName.type("test@test.com");
    }

    public void enterPassword() {
        LOGGER.info("Entering Password ");
        password.type("12345");
    }

    public boolean isSubmitButtonEnabled() {
        LOGGER.info("Checking Submit Button Enabled");
        return submitButton.isEnabled();
    }
}
