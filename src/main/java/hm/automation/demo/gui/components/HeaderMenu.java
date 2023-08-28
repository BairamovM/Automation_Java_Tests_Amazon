package hm.automation.demo.gui.components;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

import hm.automation.demo.gui.pages.HomePage;

public class HeaderMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//header//a[@class='CGae mYRh __5DXf dYW2']")
    private ExtendedWebElement hmLogo;

    @FindBy(xpath = "//a[@class='CGae mYRh vEfo' and contains(text(), 'Customer Service')]")
    private ExtendedWebElement customerServiceButton;

    @FindBy(xpath = "//a[@class='CGae mYRh vEfo' and contains(text(), 'Students get 20% off')]")
    private ExtendedWebElement studentsGet20Button;

    @FindBy(xpath = "//a[@class='CGae mYRh vEfo' and contains(text(), 'Find a store')]")
    private ExtendedWebElement findStoreButton;

    @FindBy(xpath = "//button[@id='header-service-menu-dropdown-button']")
    private ExtendedWebElement headerServiceButton;

    @FindBy(xpath = "//ul[@id='header-service-menu-dropdown']//a[contains(text(), 'Newsletter')]")
    private ExtendedWebElement newsLetterButton;

    @FindBy(xpath = "//ul[@id='header-service-menu-dropdown']//a[contains(text(), 'Download iOS')]")
    private ExtendedWebElement downloadIOSButton;

    @FindBy(xpath = "//ul[@id='header-service-menu-dropdown']//a[contains(text(), 'Download Android')]")
    private ExtendedWebElement downloadAndroidButton;

    @FindBy(xpath = "//button[@class='CGae mYRh vEfo __5DXf']")
    private ExtendedWebElement singInButton;

    @FindBy(xpath = "//a[@id='nav-favourites']")
    private ExtendedWebElement favoritesButton;

    @FindBy(xpath = "//a[@id='nav-mini-cart']")
    private ExtendedWebElement shoppingBagButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Women')]")
    private ExtendedWebElement womenCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Men')]")
    private ExtendedWebElement menCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Divided')]")
    private ExtendedWebElement dividedCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Baby')]")
    private ExtendedWebElement babyCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Kids')]")
    private ExtendedWebElement kidsCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'H&M HOME')]")
    private ExtendedWebElement hmHomeCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Beauty')]")
    private ExtendedWebElement beautyCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Sport')]")
    private ExtendedWebElement sportCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Sale')]")
    private ExtendedWebElement saleCategoryButton;

    @FindBy(xpath = "//a[contains(@class, 'CGae __9y2v vEfo') and contains(text(), 'Sustainability')]")
    private ExtendedWebElement sustainabilityCategoryButton;

    @FindBy(xpath = "(//div[@class='mRTT']//input[@placeholder='Search products'])[1]")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "(//div[@class='mRTT']//button[@class='CGae mYRh __5DXf dYW2 k4Km'])[1]")
    private ExtendedWebElement searchButton;

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isHMLogoPresent() {
        return hmLogo.isElementPresent();
    }

    public boolean isCustomerServiceButtonPresent() {
        return customerServiceButton.isElementPresent();
    }

    public boolean isStudentsGet20ButtonPresent() {
        return studentsGet20Button.isElementPresent();
    }

    public boolean isFindStoreButtonPresent() {
        return findStoreButton.isElementPresent();
    }

    public boolean isHeaderServiceButtonPresent() {
        return headerServiceButton.isElementPresent();
    }

    public boolean isSingInButtonPresent() {
        return singInButton.isElementPresent();
    }

    public boolean isFavoritesButtonPresent() {
        return favoritesButton.isElementPresent();
    }

    public boolean isShoppingBagButtonPresent() {
        return shoppingBagButton.isElementPresent();
    }

    public boolean isWomenCategoryButtonPresent() {
        return womenCategoryButton.isElementPresent();
    }

    public boolean isMenCategoryButtonPresent() {
        return menCategoryButton.isElementPresent();
    }

    public boolean isDividedCategoryButtonPresent() {
        return dividedCategoryButton.isElementPresent();
    }

    public boolean isBabyCategoryButtonPresent() {
        return babyCategoryButton.isElementPresent();
    }

    public boolean isKidsCategoryButtonPresent() {
        return kidsCategoryButton.isElementPresent();
    }

    public boolean isHmHomeCategoryButtonPresent() {
        return hmHomeCategoryButton.isElementPresent();
    }

    public boolean isBeautyCategoryButtonPresent() {
        return beautyCategoryButton.isElementPresent();
    }

    public boolean isSportCategoryButtonPresent() {
        return sportCategoryButton.isElementPresent();
    }

    public boolean isSaleCategoryButtonPresent() {
        return saleCategoryButton.isElementPresent();
    }

    public boolean isSustainabilityCategoryButtonPresent() {
        return sustainabilityCategoryButton.isElementPresent();
    }

    public boolean isSearchTextFieldPresent() {
        return searchTextField.isElementPresent();
    }

    public boolean isSearchButtonPresent() {
        return searchButton.isElementPresent();
    }

    public HomePage clickHMLogo() {
        hmLogo.click();
        return new HomePage(getDriver());
    }

    public void clickCustomerServiceButton() {
        customerServiceButton.click();
    }

    public void clickStudentsGet20Button() {
        studentsGet20Button.click();
    }

    public void clickFindStoreButton() {
        findStoreButton.click();
    }

    public void clickHeaderServiceButton() {
        headerServiceButton.click();
    }

    public void clickSingInButton() {
        singInButton.click();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }

    public void clickShoppingBagButton() {
        shoppingBagButton.click();
    }

    public void hoverWomenCategoryButton() {
        pause(0.5);
        womenCategoryButton.hover();
    }

    public void hoverMenCategoryButton() {
        pause(0.5);
        menCategoryButton.hover();
    }

    public void hoverDividedCategoryButton() {
        pause(0.5);
        dividedCategoryButton.hover();
    }

    public void hoverBabyCategoryButton() {
        pause(0.5);
        babyCategoryButton.hover();
    }

    public void hoverKidsCategoryButton() {
        pause(0.5);
        kidsCategoryButton.hover();
    }

    public void hoverHmHomeCategoryButton() {
        pause(0.5);
        hmHomeCategoryButton.hover();
    }

    public void hoverBeautyCategoryButton() {
        pause(0.5);
        beautyCategoryButton.hover();
    }

    public void hoverSportCategoryButton() {
        pause(0.5);
        sportCategoryButton.hover();
    }

    public void hoverSaleCategoryButton() {
        pause(0.5);
        saleCategoryButton.hover();
    }

    public void hoverSustainabilityCategoryButton() {
        pause(0.5);
        sustainabilityCategoryButton.hover();
    }

    public HeaderMenu typeSearchProduct(String product) {
        searchTextField.type(product);
        return this;
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void searchProduct(String product) {
        typeSearchProduct(product);
        clickSearchButton();
    }

}
