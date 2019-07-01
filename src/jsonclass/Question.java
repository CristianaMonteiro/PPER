/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonclass;

/**
 *
 * @author Cris
 */
public class Question {

    private String title;
    private int score;
    private float mark;
    private String question_description;
    private String options[];
    private String correct_answer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getQuestionDescription() {
        return question_description;
    }

    public void setQuestionDescription(String questionDescription) {
        this.question_description = questionDescription;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] Options) {
        this.options = Options;
    }

    public String getCorrectAnswer() {
        return correct_answer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correct_answer = correctAnswer;
    }

}
