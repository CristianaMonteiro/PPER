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
    
    private int id;
    private static int count = 0;
    private String Title;
    private String Question_description;
    private IQuestionMetadata Question_metadata;
    private boolean Done;
    private String answer;
    private boolean evaluateAnswer;
    private float Mark;
    
    //Construtor por defeito q incremente o count e associa esse count ao ID
    {
        this.id = IQuestion.count++;
    }
    
       
    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String string) throws QuestionException {
        this.Title = string;
        
    }

    public String getQuestion_description() {
        return this.Question_description;
        
    }

    public void setQuestion_description(String string) throws QuestionException {
        this.Question_description = string;
        
    }

    public IQuestionMetadata getQuestion_metadata() {
        return this.Question_metadata;
        
    }

    public void setQuestion_metadata(IQuestionMetadata iqm) {
        this.Question_metadata = iqm;
        
    }

    public boolean isDone() {
        return this.Done;
        
    }

    public void setDone(boolean bln) {
        this.Done = bln;
        
    }

    public void answer(String string) {
        this.answer = string;
        
    }

    public boolean evaluateAnswer() {
        
        
    }

    public void setMark(float f) {
        this.Mark = f;
        
    }

    public float getMark() {
        return this.Mark;
        
    }
    
}
