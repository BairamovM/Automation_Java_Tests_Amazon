package hm.automation.demo;

import hm.automation.demo.gui.components.FooterMenu;
import hm.automation.demo.gui.components.HeaderMenu;
import hm.automation.demo.gui.enums.FooterCategory;
import hm.automation.demo.gui.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;


public class HeaderMenuTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Muslim Bairamov")
    public void headerMenu() {

        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        pause(5);

        HeaderMenu headerMenu = homePage.getHeaderMenu();

        Assert.assertTrue(headerMenu.isWomenCategoryButtonPresent(), "Women Category Button is not Present");
        Assert.assertTrue(headerMenu.isMenCategoryButtonPresent(), "Men Category Button is not Present");
        Assert.assertTrue(headerMenu.isDividedCategoryButtonPresent(), "Divided Category Button is not Present");
        Assert.assertTrue(headerMenu.isBabyCategoryButtonPresent(), "Baby Category Button is not Present");
        Assert.assertTrue(headerMenu.isKidsCategoryButtonPresent(), "Kids Category Button is not Present");
        Assert.assertTrue(headerMenu.isHmHomeCategoryButtonPresent(), "H&M Home Category Button is not Present");
        Assert.assertTrue(headerMenu.isBeautyCategoryButtonPresent(), "Beauty Category Button is not Present");
        Assert.assertTrue(headerMenu.isSportCategoryButtonPresent(), "Sport Category Button is not Present");
        Assert.assertTrue(headerMenu.isSaleCategoryButtonPresent(), "Sale Category Button is not Present");
        Assert.assertTrue(headerMenu.isSustainabilityCategoryButtonPresent(), "Sustainability Category Button is not Present");

        headerMenu.hoverWomenCategoryButton();
        headerMenu.hoverMenCategoryButton();
        headerMenu.hoverDividedCategoryButton();
        headerMenu.hoverBabyCategoryButton();
        headerMenu.hoverKidsCategoryButton();
        headerMenu.hoverHmHomeCategoryButton();
        headerMenu.hoverBeautyCategoryButton();
        headerMenu.hoverSportCategoryButton();
        headerMenu.hoverSaleCategoryButton();
        headerMenu.hoverSustainabilityCategoryButton();

        pause(5);

        FooterMenu footerMenu = homePage.getFooterMenu();

        homePage.scrollDownToFooter();
       // footerMenu.clickFooterButton(FooterCategory.WOMEN);
        pause(5);

        homePage.scrollUpToHeader();

        pause(5);
    }
}
