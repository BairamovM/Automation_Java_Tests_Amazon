package hm.automation.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import hm.automation.demo.gui.components.FooterMenu;
import hm.automation.demo.gui.components.HeaderMenu;
import hm.automation.demo.gui.enums.FooterCategory;
import hm.automation.demo.gui.enums.HeaderCategory;
import hm.automation.demo.gui.enums.SocialNetwork;
import hm.automation.demo.gui.pages.HomePage;

public class HeaderMenuTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Muslim Bairamov")
    public void headerMenu() {

        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        pause(5);

        HeaderMenu headerMenu = homePage.getHeaderMenu();

        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.WOMEN), "Women Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.MEN), "Men Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.DIVIDED), "Divided Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.BABY), "Baby Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.KIDS), "Kids Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.HM_HOME), "H&M Home Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.BEAUTY), "Beauty Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.SPORT), "Sport Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.SALE), "Sale Category Button is not Present");
        Assert.assertTrue(headerMenu.isHeaderCategoryButtonPresent(HeaderCategory.SUSTAINABILITY), "Sustainability Category Button is not Present");

        headerMenu.hoverHeaderCategoryButton(HeaderCategory.WOMEN);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.MEN);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.DIVIDED);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.BABY);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.KIDS);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.HM_HOME);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.BEAUTY);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.SPORT);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.SALE);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.SUSTAINABILITY);
        headerMenu.hoverHeaderCategoryButton(HeaderCategory.SUSTAINABILITY);


        headerMenu.clickHeaderCategoryButton(HeaderCategory.MEN);

        pause(5);

        FooterMenu footerMenu = homePage.getFooterMenu();

        homePage.scrollDownToFooter();

        Assert.assertTrue(footerMenu.isFooterCategoryButtonPresent(FooterCategory.WOMEN), "Footer button Women is not present");
        footerMenu.clickFooterButton(FooterCategory.MEN);

       footerMenu.clickSocialNetworkButton(SocialNetwork.FACEBOOK);

        pause(5);

        homePage.scrollUpToHeader();

        pause(5);
    }
}
