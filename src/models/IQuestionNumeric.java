/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.models.IQuestionNumeric;

/**
 *
 * @author Cris
 */
public class IQuestionNumeric implements IQuestionNumeric {
    private double Correct_anwser;
    private double User_answer;
    
    public double getCorrect_anwser() {
        return this.Correct_anwser;
        
    }

    public void setCorrect_anwser(double d) {
        this.Correct_anwser = d;
        
    }

    public double getUser_answer() {
        return this.User_answer;
        
    }

    public void setUser_answer(double d) {
        this.User_answer = d;
        
    }
    
}
