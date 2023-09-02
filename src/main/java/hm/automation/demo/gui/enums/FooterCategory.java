package hm.automation.demo.gui.enums;

public enum FooterCategory {

    // SHOP
    WOMEN("Women"),
    DIVIDED("Divided"),
    MEN("Men"),
    BABY("Baby"),
    KIDS("Kids"),
    HM_HOME("H&M HOME"),
    BEAUTY("Beauty"),
    STUDENT_DISCOUNT("Student Discount"),
    SPORT("Sport"),
    GIFT_CARDS("Gift cards"),

    // CORPORATE INFO
    CAREER_HM("Career at H&M"),
    ABOUT_HM_GROUP(" About H&M group"),
    SUSTAINABILITY_HM_GROUP("Sustainability H&M Group"),
    PRESS("Press"),
    INVESTOR_RELATIONS("Investor Relations"),
    CORPORATE_GOVERNANCE("Corporate Governance"),

    // HELP
    CUSTOMER_SERVICE("Customer Service"),
    MY_ACCOUNT("My Account"),
    FIND_STORE("Find a Store"),
    LEGAL_PRIVACY("Legal & Privacy"),
    CONTACT("Contact"),
    GIFT_CARD_TERMS_CONDITIONS("Gift Card Terms and Conditions"),
    CA_SUPPLY_CHAINS_ACT("CA Supply Chains Act"),
    US_PRIVACY_RIGHTS("California, Colorado, and Virginia Privacy Rights"),
    NOT_SHARE_PERSONAL_DATA("Do Not Sell Or Share My Personal Data"),
    OUR_COMMITMENT_ACCESSIBILITY("Our Commitment to Accessibility"),
    REPORT_SCAM("Report a scam"),
    COOKIE_NOTICE("Cookie Notice");

    private final String footerCategory;

    FooterCategory(String footerCategory) {
        this.footerCategory = footerCategory;
    }

    public String getFooterCategory() {
        return footerCategory;
    }

}
