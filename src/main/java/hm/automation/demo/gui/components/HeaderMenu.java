package hm.automation.demo.gui.components;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public class HeaderMenu extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

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

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
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

    public void hoverWomenCategoryButton() {
        pause(1);
        womenCategoryButton.hover();
    }

    public void hoverMenCategoryButton() {
        pause(1);
        menCategoryButton.hover();
    }

    public void hoverDividedCategoryButton() {
        pause(1);
        dividedCategoryButton.hover();
    }

    public void hoverBabyCategoryButton() {
        pause(1);
        babyCategoryButton.hover();
    }

    public void hoverKidsCategoryButton() {
        pause(1);
        kidsCategoryButton.hover();
    }

    public void hoverHmHomeCategoryButton() {
        pause(1);
        hmHomeCategoryButton.hover();
    }

    public void hoverBeautyCategoryButton() {
        pause(1);
        beautyCategoryButton.hover();
    }

    public void hoverSportCategoryButton() {
        pause(1);
        sportCategoryButton.hover();
    }

    public void hoverSaleCategoryButton() {
        pause(1);
        saleCategoryButton.hover();
    }

    public void hoverSustainabilityCategoryButton() {
        pause(1);
        sustainabilityCategoryButton.hover();
    }

}
