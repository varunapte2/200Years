/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Definition.java
 * Date Created: 3/27/2022
 */

import java.util.Objects;

public class Definition extends Tag {

    private String term;
    private String def;

    @Override
    public void createTag() {
        term = "";
        def = "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Definition that)) return false;
        return Objects.equals(term, that.term) && Objects.equals(def, that.def);
    }

    @Override
    public int hashCode() {
        return Objects.hash(term, def);
    }

    @Override
    public void modifyTag() {

    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
