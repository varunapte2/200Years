/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Equation.java
 * Date Created: 3/27/2022
 */

import java.util.Objects;

public class Equation extends Tag {

    private String name;
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equation equation)) return false;
        return Objects.equals(name, equation.name) && Objects.equals(text, equation.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text);
    }

    @Override
    public void createTag() {
        name = "";
        text = "";
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
