package hm.automation.demo.gui.patterns;

import com.zebrunner.carina.webdriver.IDriverPool;

import hm.automation.demo.gui.enums.FooterCategory;
import hm.automation.demo.gui.enums.HeaderCategory;
import hm.automation.demo.gui.enums.PageType;
import hm.automation.demo.gui.enums.SocialNetwork;
import hm.automation.demo.gui.pages.HM_AbstractPage;
import hm.automation.demo.gui.pages.HomePage;
import hm.automation.demo.gui.pages.ShoppingBagPage;
import hm.automation.demo.gui.pages.social_networks.FacebookPage;
import hm.automation.demo.gui.pages.social_networks.TwitterPage;
import hm.automation.demo.gui.pages.social_networks.InstagramPage;
import hm.automation.demo.gui.pages.social_networks.YoutubePage;
import hm.automation.demo.gui.pages.social_networks.PinterestPage;

public class PageFactory implements IDriverPool {

    // PAGES - GLOBAL
    public HM_AbstractPage createPage(PageType pageType) {
        HM_AbstractPage page = null;
        switch (pageType) {
            case HOME_PAGE: { page = new HomePage(getDriver()); break; }
            case SHOPPING_BAG_PAGE: { page = new ShoppingBagPage(getDriver()); break; }
        }
        return page;
    }

    // PAGES - SOCIAL NETWORKS
    public HM_AbstractPage createPage(SocialNetwork socialNetwork) {
        HM_AbstractPage page = null;
        switch (socialNetwork) {
            case FACEBOOK: { page = new FacebookPage(getDriver()); break; }
            case TWITTER: { page = new TwitterPage(getDriver()); break; }
            case INSTAGRAM: { page = new InstagramPage(getDriver()); break; }
            case YOUTUBE: { page = new YoutubePage(getDriver()); break; }
            case PINTEREST: { page = new PinterestPage(getDriver()); break; }
        }
        return page;
    }

    // FOOTER
    public HM_AbstractPage createPage(FooterCategory footerCategory) {
        HM_AbstractPage page = null;
        switch (footerCategory) {

            // SHOP
            case WOMEN: { page = new HomePage(getDriver()); break; } // TODO Page
            case DIVIDED: { page = new HomePage(getDriver()); break; } // TODO Page
            case MEN: { page = new HomePage(getDriver()); break; } // TODO Page
            case BABY: { page = new HomePage(getDriver()); break; } // TODO Page
            case KIDS: { page = new HomePage(getDriver()); break; } // TODO Page
            case HM_HOME: { page = new HomePage(getDriver()); break; } // TODO Page
            case BEAUTY: { page = new HomePage(getDriver()); break; } // TODO Page
            case STUDENT_DISCOUNT: { page = new HomePage(getDriver()); break; } // TODO Page
            case SPORT: { page = new HomePage(getDriver()); break; } // TODO Page
            case GIFT_CARDS: { page = new HomePage(getDriver()); break; } // TODO Page

            // CORPORATE INFO
            case CAREER_HM: { page = new HomePage(getDriver()); break; } // TODO Page
            case ABOUT_HM_GROUP: { page = new HomePage(getDriver()); break; } // TODO Page
            case SUSTAINABILITY_HM_GROUP: { page = new HomePage(getDriver()); break; } // TODO Page
            case PRESS: { page = new HomePage(getDriver()); break; } // TODO Page
            case INVESTOR_RELATIONS: { page = new HomePage(getDriver()); break; } // TODO Page
            case CORPORATE_GOVERNANCE: { page = new HomePage(getDriver()); break; } // TODO Page

            // HELP
            case CUSTOMER_SERVICE: { page = new HomePage(getDriver()); break; } // TODO Page
            case MY_ACCOUNT: { page = new HomePage(getDriver()); break; } // TODO Page
            case FIND_STORE: { page = new HomePage(getDriver()); break; } // TODO Page
            case LEGAL_PRIVACY: { page = new HomePage(getDriver()); break; } // TODO Page
            case CONTACT: { page = new HomePage(getDriver()); break; } // TODO Page
            case GIFT_CARD_TERMS_CONDITIONS: { page = new HomePage(getDriver()); break; } // TODO Page
            case CA_SUPPLY_CHAINS_ACT: { page = new HomePage(getDriver()); break; } // TODO Page
            case US_PRIVACY_RIGHTS: { page = new HomePage(getDriver()); break; } // TODO Page
            case NOT_SHARE_PERSONAL_DATA: { page = new HomePage(getDriver()); break; } // TODO Page
            case OUR_COMMITMENT_ACCESSIBILITY: { page = new HomePage(getDriver()); break; } // TODO Page
            case REPORT_SCAM: { page = new HomePage(getDriver()); break; } // TODO Page
            case COOKIE_NOTICE: { page = new HomePage(getDriver()); break; } // TODO Page
        }
        return page;
    }

    // HEADER
    public HM_AbstractPage createPage(HeaderCategory headerCategory) {
        HM_AbstractPage page = null;
        switch (headerCategory) {
            case WOMEN: { page = new HomePage(getDriver()); break; } // TODO Page
            case MEN: { page = new HomePage(getDriver()); break; } // TODO Page
        }
        return page;
    }

}
