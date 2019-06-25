/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestion;
import interfaces.models.IQuestionMetadata;

/**
 *
 * @author Cris
 */
public class IQuestion implements IQuestion {
    
    public String getTitle() {
        
    }

    public void setTitle(String string) throws QuestionException {
        
    }

    public String getQuestion_description() {
        
    }

    public void setQuestion_description(String string) throws QuestionException {
        
    }

    public IQuestionMetadata getQuestion_metadata() {
        
    }

    public void setQuestion_metadata(IQuestionMetadata iqm) {
        
    }

    public boolean isDone() {
        
    }

    public void setDone(boolean bln) {
        
    }

    public void answer(String string) {
        
    }

    public boolean evaluateAnswer() {
        
    }

    public void setMark(float f) {
        
    }

    public float getMark() {
        
    }
    
}
