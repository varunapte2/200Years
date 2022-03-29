/*
 * Author: Mia Gortney
 * Project Name: Note Tag
 * File Name: Quiz.java
 * Date Created: 3/27/2022
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Quiz implements ActionListener {

    private LocalDate dateTaken;
    private double score;
    private ArrayList<Question> questionList;
    private int numberOfQuestions;

    JFrame frame;
    JLabel question;
    JRadioButton option1, option2, option3, option4;
    JButton save,submit;
    String[][] pa = new String[numberOfQuestions][1];
    ButtonGroup options;
    public static int i = 0;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;

    public Quiz() {
        dateTaken = LocalDate.now();
        score = 0;
        questionList = new ArrayList<>();
        numberOfQuestions = (int) (Math.random() % 20);
    }

    public void beginQuiz() {
        for (int i = 0; i < numberOfQuestions; i++) {

        }
    }

    public LocalDate getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(LocalDate dateTaken) {
        this.dateTaken = dateTaken;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quiz quiz)) return false;
        return Double.compare(quiz.score, score) == 0 &&
                Objects.equals(dateTaken, quiz.dateTaken) &&
                Objects.equals(questionList, quiz.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTaken, score, questionList);
    }

    public void compareAnswers(Question q) {
        if (q.getSubmittedAnswer().equals(q.getCorrectAnswer())) {
            score += q.getPointAmount();
        }
    }

    public void displayQuiz() {
        frame = new JFrame();
        question = new JLabel();
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();
        save = new JButton("Save & Next");
        submit = new JButton("Submit");
        question.setBounds(10, 10, 200, 50);
        option1.setBounds(10, 60, 200, 50);
        option2.setBounds(10, 110, 200, 50);
        option3.setBounds(10, 160, 200, 50);
        option4.setBounds(10, 210, 200, 50);
        save.setBounds(40, 260, 80, 40);
        submit.setBounds(140, 260, 80, 40);
        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        try {

            PreparedStatement ps = con.prepareStatement("select * from question");

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {

                System.out.print("i " + i);
                Questions[i][0] = rs.getString(2);
                Questions[i][1] = rs.getString(3);
                Questions[i][2] = rs.getString(4);
                Questions[i][3] = rs.getString(5);
                Questions[i][4] = rs.getString(6);
                Answers[i][0] = rs.getString(7);
                i = i + 1;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        save.addActionListener(this);
        submit.addActionListener(this);
        frame.add(question);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);
        frame.add(save);
        frame.add(submit);

        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setTitle("Question");
        start(0);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == save){

            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            if(count == (numberOfQuestions-2)){
                save.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int ii =0 ; ii < pa.length ; ii++){
                System.out.println(ii);
                if(pa[ii][0].equals(Answers[ii][0])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            System.out.println(score);
            frame.setVisible(false);
        }
    }

    public void start(int count){
       /*for(int i =0;i<10;i++)
       {
           System.out.println("Question " + Questions[i][0]);
                        System.out.println("Option1 "+Questions[i][1]);
                        System.out.println("Option2 "+Questions[i][2]);
                        System.out.println("Option3 "+Questions[i][3]);
                        System.out.println("Option4 "+Questions[i][4]);
                        System.out.println("Answer "+Answers[i][0]);
       }*/
        //qno.setText("" + (count + 1) + ". ");
        question.setText(Questions[count][0]);
        option1.setText(Questions[count][1]);
        option1.setActionCommand(Questions[count][1]);
        option2.setText(Questions[count][2]);
        option2.setActionCommand(Questions[count][2]);
        option3.setText(Questions[count][3]);
        option3.setActionCommand(Questions[count][3]);
        option4.setText(Questions[count][4]);
        option4.setActionCommand(Questions[count][4]);
        options.clearSelection();

    }

    public void displayGradedQuiz() {

    }
}
