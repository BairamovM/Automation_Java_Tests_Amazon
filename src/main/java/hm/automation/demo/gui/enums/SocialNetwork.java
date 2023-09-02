package hm.automation.demo.gui.enums;

public enum SocialNetwork {

    FACEBOOK("Facebook"),
    TWITTER("Twitter"),
    INSTAGRAM("Instagram"),
    YOUTUBE("Youtube"),
    PINTEREST("Pinterest");

    private final String socialNetwork;

    SocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }
}
