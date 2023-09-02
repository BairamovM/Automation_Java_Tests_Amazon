package hm.automation.demo.gui.pages;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

import hm.automation.demo.gui.components.FooterMenu;
import hm.automation.demo.gui.components.HeaderMenu;

public class HomePage extends HM_AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//header[@class='iFlL']")
    private HeaderMenu headerMenu;

    @FindBy(xpath = "//header[@class='iFlL']")
    private ExtendedWebElement header;

    @FindBy(xpath = "//footer[@class='OfEN']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//footer[@class='OfEN']")
    private ExtendedWebElement footer;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void scrollUpToHeader() {
        header.scrollTo();
        pause(0.5);
    }

    public void scrollDownToFooter() {
        footer.scrollTo();
        pause(0.5);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

}
