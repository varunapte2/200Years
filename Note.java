/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Note.java
 * Date Created: 3/27/2022
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Note {

    private String name;
    private LocalDate dateCreated;
    private LocalDate dateLastModified;
    private String text;
    private ArrayList<Tag> tagList;

    Note() {
        name = "";
        dateCreated = LocalDate.now();
        text = "";
        tagList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(LocalDate dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(ArrayList<Tag> tagList) {
        this.tagList = tagList;
    }

    public void addTag(Tag t) {
        tagList.add(t);
    }

    public void removeTag(Tag t) {
        tagList.remove(t);
    }
}
