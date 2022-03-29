/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Diagram.java
 * Date Created: 3/27/2022
 */

import java.util.Objects;

public class Diagram extends Tag {

    private String name;
    private String linkToPicture;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diagram diagram)) return false;
        return Objects.equals(name, diagram.name) && Objects.equals(linkToPicture, diagram.linkToPicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, linkToPicture);
    }

    @Override
    public void createTag() {
        name = "";
        linkToPicture = "";
    }

    @Override
    public void modifyTag() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkToPicture() {
        return linkToPicture;
    }

    public void setLinkToPicture(String linkToPicture) {
        this.linkToPicture = linkToPicture;
    }
}
