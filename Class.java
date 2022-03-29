/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Class.java
 * Date Created: 3/27/2022
 */

import java.util.HashSet;
import java.util.Objects;

public class Class {

    private String name;
    private HashSet<Subject> subjectList;

    Class(String n) {
        name = n;
        subjectList = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(HashSet<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class aClass)) return false;
        return Objects.equals(name, aClass.name) && Objects.equals(subjectList, aClass.subjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectList);
    }

    public void addSubject(Subject s) {
        subjectList.add(s);
    }

    public void removeSubject(Subject s) {
        subjectList.remove(s);
    }
}
