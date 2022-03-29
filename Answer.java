/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Answer.java
 * Date Created: 3/27/2022
 */

import java.util.Objects;

public class Answer {

    private String answerText;

    Answer() {
        answerText = "";
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer answer)) return false;
        return Objects.equals(answerText, answer.answerText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerText);
    }
}
