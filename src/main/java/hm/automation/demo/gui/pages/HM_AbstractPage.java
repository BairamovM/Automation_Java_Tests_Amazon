package hm.automation.demo.gui.pages;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class HM_AbstractPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public HM_AbstractPage(WebDriver driver) {
        super(driver);
    }

    public void closeCookies() {

    }

}
