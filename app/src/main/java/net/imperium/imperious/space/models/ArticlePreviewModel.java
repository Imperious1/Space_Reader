package net.imperium.imperious.space.models;

/**
 * Created by blaze on 9/20/2016.
 */

public class ArticlePreviewModel {
    private String title;
    private String date;
    private String type;
    private String content;
    private int id;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public ArticlePreviewModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ArticlePreviewModel setDate(String date) {
        this.date = date;
        return this;
    }

    public String getType() {
        return type;
    }

    public ArticlePreviewModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ArticlePreviewModel setContent(String content) {
        this.content = content;
        return this;
    }

    public int getId() {
        return id;
    }

    public ArticlePreviewModel setId(int id) {
        this.id = id;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArticlePreviewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
