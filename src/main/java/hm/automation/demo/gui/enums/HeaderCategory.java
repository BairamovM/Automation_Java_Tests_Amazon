package hm.automation.demo.gui.enums;

public enum HeaderCategory {

    ENGLISH("Women"),
    SPANISH("Men"),
    ARABIC("Divided"),
    GERMAN("Baby"),
    HEBREW("Kids"),
    KOREAN("H&M HOME"),
    PORTUGUESE("Beauty"),
    CHINESE("Sport"),
    CHINESE_TAIWAN("Sale"),
    SUSTAINABILITY("Sustainability");

    private final String headerCategory;

    HeaderCategory(String headerCategory) {
        this.headerCategory = headerCategory;
    }

    public String getHeaderCategory() {
        return headerCategory;
    }

}
