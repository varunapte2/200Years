/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Subject.java
 * Date Created: 3/27/2022
 */

import java.util.*;
import java.util.stream.Collectors;

public class Subject {

    private String name;
    private LinkedHashSet<Concept> conceptList;

    Subject(String n) {
        name = n;
        conceptList = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Concept> getConceptList() {
        return conceptList;
    }

    public void setConceptList(LinkedHashSet<Concept> conceptList) {
        this.conceptList = conceptList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject)) return false;
        return Objects.equals(name, subject.name) && Objects.equals(conceptList, subject.conceptList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conceptList);
    }

    public void addConcept(Concept c) {
        conceptList.add(c);
    }

    public void removeConcept(Concept c) {
        conceptList.remove(c);
    }

    public ArrayList<Concept> searchByTag(Tag t) {

        ArrayList<Concept> list = new ArrayList<>();

        for (Concept c : conceptList) {
            for (Note n : c.getNotes()) {
                if (n.getTagList().contains(t)) {
                    list.add(c);
                }
            }
        }

        return list;
    }

    public Concept searchByName(String n) {
        Concept c = new Concept();
        c.setName(n);
        if (conceptList.contains(c)) {
            return c;
        }
        return null;
    }

    public void sortA() {

    }

    public void sortZ() {

    }

    public void favorite(Concept c) {

    }
}
