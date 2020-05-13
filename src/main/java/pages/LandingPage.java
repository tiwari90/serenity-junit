package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandingPage extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(LandingPage.class);

    @FindBy(xpath = "//strong[text()='3. Add a User']") private WebElementFacade addUserText;

    public void moveMouseToLogo() {
        LOGGER.info("Hover Started, test case stops here if there is an exception");
        withAction().moveToElement(addUserText).build().perform();
        LOGGER.info("Hover Ended");
    }
}
