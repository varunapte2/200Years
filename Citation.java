/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Citation.java
 * Date Created: 3/27/2022
 */

import java.util.Objects;

public class Citation extends Tag {

    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citation citation)) return false;
        return Objects.equals(text, citation.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public void createTag() {
        text = "";
    }

    @Override
    public void modifyTag() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
