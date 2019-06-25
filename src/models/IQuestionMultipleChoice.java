/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.models.IQuestionMultipleChoice;

/**
 *
 * @author Cris
 */
public class IQuestionMultipleChoice implements IQuestionMultipleChoice {
    private String[] Options;
    private String Correct_answer;
    private String User_answer;
    
    public String[] getOptions() {
        return this.Options;
        
    }

    public void setOptions(String[] strings) {
        this.Options = strings;
        
    }

    public String getCorrect_answer() {
        return this.Correct_answer;
        
    }

    public void setCorrect_answer(String string) {
        this.Correct_answer = string;
        
    }

    public String getUser_answer() {
        return this.User_answer;
        
    }

    public void setUser_answer(String string) {
        this.User_answer = string;
        
    }
    
}
