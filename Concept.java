/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Concept.java
 * Date Created: 3/27/2022
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Concept {

    private String name;
    private HashSet<Concept> linkedConcepts;
    private ArrayList<Quiz> quizzesTaken;
    private ArrayList<Note> notes;
    private double percentage;

    Concept() {
        name = "";
        linkedConcepts = new HashSet<>();
        quizzesTaken = new ArrayList<>();
        notes = new ArrayList<>();
        percentage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Concept> getLinkedConcepts() {
        return linkedConcepts;
    }

    public void setLinkedConcepts(HashSet<Concept> linkedConcepts) {
        this.linkedConcepts = linkedConcepts;
    }

    public ArrayList<Quiz> getQuizzesTaken() {
        return quizzesTaken;
    }

    public void setQuizzesTaken(ArrayList<Quiz> quizzesTaken) {
        this.quizzesTaken = quizzesTaken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Concept concept)) return false;
        return Double.compare(concept.percentage, percentage) == 0 && Objects.equals(name, concept.name) && Objects.equals(linkedConcepts, concept.linkedConcepts) && Objects.equals(quizzesTaken, concept.quizzesTaken) && Objects.equals(notes, concept.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, linkedConcepts, quizzesTaken, notes, percentage);
    }

    public void createConceptLink(Concept c) {
        linkedConcepts.add(c);
        c.linkedConcepts.add(this);
    }

    public void removeConceptLink(Concept c) {
        for (Concept co : linkedConcepts) {
            if (c.equals(co)) {
                linkedConcepts.remove(c);
                c.linkedConcepts.remove(this);
            }
        }
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
