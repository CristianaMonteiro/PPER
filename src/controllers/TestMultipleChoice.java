/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import interfaces.controller.ITest;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import models.QuestionMultipleChoice;

/**
 *
 * @author Cris
 */
public class TestMultipleChoice extends Test implements ITest {

    @Override
    public boolean addQuestion(IQuestion question) throws TestException {

        if (question instanceof QuestionMultipleChoice) {
            return questions.addObject(question);
        } else {
            throw new TestException("Só aceitável testes de múltipla escolha!!!");
        }

    }

}
