/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Link.java
 * Date Created: 3/27/2022
 */

public class Link extends Tag {

    private String linkToWebsite;

    @Override
    public void createTag() {
        linkToWebsite = "";
    }

    @Override
    public void modifyTag() {

    }

    public String getLinkToWebsite() {
        return linkToWebsite;
    }

    public void setLinkToWebsite(String linkToWebsite) {
        this.linkToWebsite = linkToWebsite;
    }
}
