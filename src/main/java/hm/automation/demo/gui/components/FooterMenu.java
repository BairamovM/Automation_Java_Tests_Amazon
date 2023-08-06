package hm.automation.demo.gui.components;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public class FooterMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


}
