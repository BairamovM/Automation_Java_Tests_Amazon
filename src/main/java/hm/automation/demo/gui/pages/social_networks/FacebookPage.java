package hm.automation.demo.gui.pages.social_networks;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hm.automation.demo.gui.pages.HM_AbstractPage;

public class FacebookPage extends HM_AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public FacebookPage(WebDriver driver) {
        super(driver);
    }
}
