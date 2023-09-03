package hm.automation.demo.gui.components;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

import hm.automation.demo.gui.enums.FooterCategory;
import hm.automation.demo.gui.enums.SocialNetwork;
import hm.automation.demo.gui.pages.HM_AbstractPage;
import hm.automation.demo.gui.pages.HomePage;
import hm.automation.demo.gui.patterns.PageFactory;

public class FooterMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    // Footer Titles
    @FindBy(xpath = "//h2[@id='SHOP']")
    private ExtendedWebElement shopTitle;

    @FindBy(xpath = "//h2[@id='CORPORATE_INFO']")
    private ExtendedWebElement corporateInfoTitle;

    @FindBy(xpath = "//h2[@id='HELP']")
    private ExtendedWebElement helpTitle;

    @FindBy(xpath = "//h2[@class='wpF0 T818 r0J3 __2JWq']")
    private ExtendedWebElement becomeMemberTitle;


    // Footer category buttons
    @FindBy(xpath = "//a[@class='CGae jm4b vEfo' and contains(text(), '%s')] | " +
            "//div[@class='four modules footer-menu footer-content']//a[contains(text(), '%s')]")
    private ExtendedWebElement footerCategoryButton;

    // Cookie Settings button
    @FindBy(xpath = "//button[@id='ot-sdk-btn' and text()='Cookie Settings']")
    private ExtendedWebElement cookieSettingsButton;


    // BECOME A MEMBER
    @FindBy(xpath = "//section[@data-testid='footer-newsletter']/p")
    private ExtendedWebElement joinNowTitle;

    @FindBy(xpath = "//section[@data-testid='footer-newsletter']//a")
    private ExtendedWebElement readMoreButton;


    // Social Networks links
    @FindBy(xpath = "//a[@class='CGae mYRh __5DXf dYW2' and @title='%s'] | " +
            "//ul[@class='footer-social footer-content']//a[@title='%s']")
    private ExtendedWebElement socialNetworkButton;


    @FindBy(xpath = "//div[@class='OKB_']/p")
    private ExtendedWebElement copyrightProtectedTitle;

    @FindBy(xpath = "//div[@data-testid='footer-logo']/a")
    private ExtendedWebElement footerMainLogo;

    @FindBy(xpath = "//button[@class='CGae jm4b vEfo']")
    private ExtendedWebElement shippingLocationButton;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isShopTitlePresent() {
        return shopTitle.isElementPresent();
    }

    public boolean isCorporateInfoTitlePresent() {
        return corporateInfoTitle.isElementPresent();
    }

    public boolean isHelpTitlePresent() {
        return helpTitle.isElementPresent();
    }

    public boolean isBecomeMemberTitlePresent() {
        return becomeMemberTitle.isElementPresent();
    }

    public boolean isFooterCategoryButtonPresent(FooterCategory footerCategory) {
        return footerCategoryButton.format(footerCategory.getFooterCategory(), footerCategory.getFooterCategory()).isElementPresent();
    }

    public HM_AbstractPage clickFooterButton(FooterCategory footerCategory) {
        footerCategoryButton.format(footerCategory.getFooterCategory(), footerCategory.getFooterCategory()).click();
        PageFactory pageFactory = new PageFactory();
        return pageFactory.createPage(footerCategory);
    }

    public boolean isCookieSettingsButtonPresent() {
        return cookieSettingsButton.isElementPresent();
    }

    public void clickCookieSettingsButton() {
        cookieSettingsButton.click();
    }

    public boolean isJoinNowTitlePresent() {
        return joinNowTitle.isElementPresent();
    }

    public boolean isReadMoreButtonPresent() {
        return readMoreButton.isElementPresent();
    }

    public void clickReadMoreButton() {
        readMoreButton.click();
    }

    public boolean isSocialNetworkButtonPresent(SocialNetwork socialNetwork) {
        return socialNetworkButton.format(socialNetwork.getSocialNetwork(), socialNetwork.getSocialNetwork()).isElementPresent();
    }

    public HM_AbstractPage clickSocialNetworkButton(SocialNetwork socialNetwork) {
        socialNetworkButton.format(socialNetwork.getSocialNetwork(), socialNetwork.getSocialNetwork()).click();
        PageFactory pageFactory = new PageFactory();
        return pageFactory.createPage(socialNetwork);
    }

    public boolean isCopyrightProtectedTitlePresent() {
        return copyrightProtectedTitle.isElementPresent();
    }

    public boolean isFooterMainLogoPresent() {
        return footerMainLogo.isElementPresent();
    }

    public HomePage clickFooterMainLogo() {
        footerMainLogo.click();
        return new HomePage(getDriver());
    }

    public boolean isShippingLocationButtonPresent() {
        return shippingLocationButton.isElementPresent();
    }

    public void clickShippingLocationButton() {
        shippingLocationButton.click();
    }

}
