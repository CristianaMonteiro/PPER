/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITest;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;

/**
 *
 * @author Cris
 */
public class ITest implements ITest {
    private static int count = 0;
    private boolean Question;
    private IQuestion IQuestion; 
    
    private boolean removeQuestion;
    private int numberQuestions;
    private boolean Complete;
    private ITestStatistics TestStatistics;
    private boolean loadFromJSONFile;
    private IScoreStrategy ScoreStrategy;
    private String Score;
    private boolean saveTestResults;

    public boolean addQuestion(IQuestion iq) throws TestException {
        // aQUI VAI O CODIGO
    }

    public IQuestion getQuestion(int i) throws TestException {
        return this.IQuestion;
    }

    public boolean removeQuestion(int i) {
        for (int k = i ; k < ITest.count - 1; k++) {
            this.Question[k] = this.Question[k+1];
        }
    }
        
    }

    public boolean removeQuestion(IQuestion iq) {
        
    }

    public int numberQuestions() {
        
    }

    public boolean isComplete() {
        
    }

    public ITestStatistics getTestStatistics() { 
        return this.TestStatistics;
        
    }

    public boolean loadFromJSONFile(String string) throws TestException {
        
    }

    public void setScoreStrategy(IScoreStrategy iss) {
        this.ScoreStrategy = iss;

    public IScoreStrategy getScoreStrategy() {
        return this.ScoreStrategy;
    }
        

    public String calculateScore() {
        
    }

    public boolean saveTestResults(String string) throws TestException {
        
    }

}
