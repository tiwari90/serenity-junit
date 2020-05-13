package testSuites;

import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Managed public WebDriver driver;

    @Before
    public void openBrowser(){
        driver.manage().window().maximize();

    }
}
