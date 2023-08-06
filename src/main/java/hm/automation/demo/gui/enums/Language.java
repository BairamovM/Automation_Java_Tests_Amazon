package hm.automation.demo.gui.enums;

public enum Language {

    ENGLISH("en_US"),
    SPANISH("es_US"),
    ARABIC("ar_AE"),
    GERMAN("de_DE"),
    HEBREW("he_IL"),
    KOREAN("ko_KR"),
    PORTUGUESE("pt_BR"),
    CHINESE("zh_CN"),
    CHINESE_TAIWAN("zh_TW");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
