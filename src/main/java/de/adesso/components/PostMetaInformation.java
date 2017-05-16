package de.adesso.components;

import java.util.Arrays;
import java.util.Map;

/**
 * This class creates an Object containing the meta information (header) of the blog post
 * that was created using markdown language of jekyll.
 */
public class PostMetaInformation {

    private int id;
    private String layout;
    private String title;
    private String[] categories;
    // TODO: check correct date format or change to a date object
    private String date;
    // TODO: check correct date format or change to a date object
    private String modifiedDate;
    private String author;
    private String[] tags;
    private boolean comments;
    private boolean ads;
    private Map<String, String> image;

    public int getId() {
        return id;
    }

    public String getLayout() {
        return layout;
    }

    public String getTitle() {
        return title;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getDate() {
        return date;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getTags() {
        return tags;
    }

    public boolean isComments() {
        return comments;
    }

    public boolean isAds() {
        return ads;
    }

    public Map<String, String> getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(boolean comments) {
        this.comments = comments;
    }

    public void setAds(boolean ads) {
        this.ads = ads;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PostMetaInformation{" +
                "id=" + id +
                ", layout='" + layout + '\'' +
                ", title='" + title + '\'' +
                ", categories=" + Arrays.toString(categories) +
                ", date='" + date + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                ", ads=" + ads +
                ", image=" + image +
                '}';
    }
}
