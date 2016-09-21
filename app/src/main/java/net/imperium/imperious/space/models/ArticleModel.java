package net.imperium.imperious.space.models;

/**
 * Created by blaze on 9/20/2016.
 */

public class ArticleModel {
    //push title in an Intent/bundle
    private String[] imageUrls;
    private String[] imageDescriptions;
    private String[] imageCredits;
    private String[] hyperLinks;
    private String content;

    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String[] getImageDescriptions() {
        return imageDescriptions;
    }

    public void setImageDescriptions(String[] imageDescriptions) {
        this.imageDescriptions = imageDescriptions;
    }

    public String[] getImageCredits() {
        return imageCredits;
    }

    public void setImageCredits(String[] imageCredits) {
        this.imageCredits = imageCredits;
    }

    public String[] getHyperLinks() {
        return hyperLinks;
    }

    public void setHyperLinks(String[] hyperLinks) {
        this.hyperLinks = hyperLinks;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
