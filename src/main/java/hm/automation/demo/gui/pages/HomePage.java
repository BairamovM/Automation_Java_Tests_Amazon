package hm.automation.demo.gui.pages;

import hm.automation.demo.gui.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePage extends HM_AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//header[@class='iFlL']")
    private HeaderMenu headerMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }


}
