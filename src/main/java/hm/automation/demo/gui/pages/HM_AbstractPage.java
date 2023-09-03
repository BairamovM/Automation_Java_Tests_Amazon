package hm.automation.demo.gui.pages;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class HM_AbstractPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    // COOKIES MODAL
    @FindBy(xpath = "//h2[@id='onetrust-policy-title' and text()='Before you start shopping']")
    private ExtendedWebElement cookieMainTitle;

    @FindBy(xpath = "//p[@id='onetrust-policy-text']")
    private ExtendedWebElement cookiePolicyText;

    @FindBy(xpath = "//p[@id='onetrust-policy-text']//a[contains(text(), 'Cookie Policy')]")
    private ExtendedWebElement cookiePolicyButton;

    @FindBy(xpath = ".//button[@id='onetrust-accept-btn-handler' and text()='Accept all cookies']")
    private ExtendedWebElement acceptAllCookiesButton;

    @FindBy(xpath = ".//button[@id='onetrust-pc-btn-handler' and text()=' Cookie settings']")
    private ExtendedWebElement cookieSettingsButton;

    public HM_AbstractPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCookieMainTitlePresent() {
        return cookieMainTitle.isElementPresent();
    }

    public boolean isCookiePolicyTextPresent() {
        return cookiePolicyText.isElementPresent();
    }

    public boolean isCookiePolicyButtonPresent() {
        return cookiePolicyButton.isElementPresent();
    }

    public boolean isAcceptAllCookiesButtonPresent() {
        return acceptAllCookiesButton.isElementPresent();
    }

    public boolean isCookieSettingsButtonPresent() {
        return cookieSettingsButton.isElementPresent();
    }

    public boolean isAllElementsCookieModalPresent() {
        return isCookieMainTitlePresent() & isCookiePolicyTextPresent() &
                isCookiePolicyButtonPresent() & isAcceptAllCookiesButtonPresent() &
                isCookieSettingsButtonPresent();
    }

    public void closeCookies() {
        if (isAllElementsCookieModalPresent()) {
            acceptAllCookiesButton.click();
            LOGGER.info("Cookie Modal was closed");
        }
    }

}
