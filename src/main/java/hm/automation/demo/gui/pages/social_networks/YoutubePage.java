package hm.automation.demo.gui.pages.social_networks;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hm.automation.demo.gui.pages.HM_AbstractPage;

public class YoutubePage extends HM_AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public YoutubePage(WebDriver driver) {
        super(driver);
    }
}
