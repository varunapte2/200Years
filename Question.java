/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Question.java
 * Date Created: 3/27/2022
 */

import java.util.ArrayList;
import java.util.Objects;

public class Question {

    private String questionText;
    private ArrayList<Answer> possibleAnswerList;
    private Answer correctAnswer;
    private Answer submittedAnswer;
    private double pointAmount;
    private Concept connected;

    Question() {
        questionText = "";
        possibleAnswerList = new ArrayList<>();
        correctAnswer = new Answer();
        submittedAnswer = new Answer();
        pointAmount = 0;
        connected = new Concept();
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<Answer> getPossibleAnswerList() {
        return possibleAnswerList;
    }

    public void setPossibleAnswerList(ArrayList<Answer> possibleAnswerList) {
        this.possibleAnswerList = possibleAnswerList;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Answer getSubmittedAnswer() {
        return submittedAnswer;
    }

    public void setSubmittedAnswer(Answer submittedAnswer) {
        this.submittedAnswer = submittedAnswer;
    }

    public double getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Double.compare(question.pointAmount, pointAmount) == 0 && Objects.equals(questionText, question.questionText) && Objects.equals(possibleAnswerList, question.possibleAnswerList) && Objects.equals(correctAnswer, question.correctAnswer) && Objects.equals(submittedAnswer, question.submittedAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionText, possibleAnswerList, correctAnswer, submittedAnswer, pointAmount);
    }

    public Concept getConnected() {
        return connected;
    }

    public void setConnected(Concept connected) {
        this.connected = connected;
    }
}
