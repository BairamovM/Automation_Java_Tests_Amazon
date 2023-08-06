package hm.automation.demo.gui.enums;

public enum HeaderCategory {

    WOMEN("Women"),
    MEN("Men"),
    DIVIDED("Divided"),
    BABY("Baby"),
    KIDS("Kids"),
    HM_HOME("H&M HOME"),
    BEAUTY("Beauty"),
    SPORT("Sport"),
    SALE("Sale"),
    SUSTAINABILITY("Sustainability");

    private final String headerCategory;

    HeaderCategory(String headerCategory) {
        this.headerCategory = headerCategory;
    }

    public String getHeaderCategory() {
        return headerCategory;
    }

}
