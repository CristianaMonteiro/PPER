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

    public boolean addQuestion(IQuestion iq) throws TestException {
        // aQUI VAI O CODIGO
    }

    public IQuestion getQuestion(int i) throws TestException {
        
    }

    public boolean removeQuestion(int i) {
        
    }

    public boolean removeQuestion(IQuestion iq) {
        
    }

    public int numberQuestions() {
        
    }

    public boolean isComplete() {
        
    }

    public ITestStatistics getTestStatistics() {
        
    }

    public boolean loadFromJSONFile(String string) throws TestException {
        
    }

    public void setScoreStrategy(IScoreStrategy iss) {
        
    }

    public IScoreStrategy getScoreStrategy() {
        
    }

    public String calculateScore() {
        
    }

    public boolean saveTestResults(String string) throws TestException {
        
    }

}
