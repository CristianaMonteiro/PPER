package controllers;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico de Porto <br>
 * LEI - Licenciatura em Engenharia Informática <br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 *
 * Autor: Cristiana Ferreira Monteiro Número Mecanográfico: 8150489
 * <p>
 */
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Question;

public class TestStatistics implements interfaces.controller.ITestStatistics {

    private double meanTimePerAnswer;
    private double standardDeviationTimePerAnsewer;
    private double correctAnswerPecentage;
    private double incorrectAnswerPecentage;
    private int correctAnswer;
    private int incorrectAnswer;
    private IQuestion[] incorrectAnswers;
    private IQuestion[] correctAnswers;
    private Test test;

    /**
     *
     * @param test
     */
    public TestStatistics(Test test) {
        this.test = test;
    }

    /**
     *
     * @return
     */
    @Override
    public double meanTimePerAnswer() {

        long totalTime = 0;
        long mean = 0;
        try {
            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                long start = q.getQuestion_metadata().getTimestamp_start();
                long finish = q.getQuestion_metadata().getTimestamp_finish();
                long timeAnswer = finish - start;

                totalTime += timeAnswer;
            }

            mean = totalTime / test.numberQuestions();

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mean;
    }

    /**
     *
     * @return
     */
    @Override
    public double standardDeviationTimePerAnsewer() {

        double desviopadrao = 0;

        try {
            double mean = meanTimePerAnswer();
            int totalAnswers = test.numberQuestions();

            double numerador = 0;

            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                long start = q.getQuestion_metadata().getTimestamp_start();
                long finish = q.getQuestion_metadata().getTimestamp_finish();
                long timeAnswer = finish - start;

                numerador += Math.pow(timeAnswer - mean, 2);

            }

            double fracao = numerador / totalAnswers;

            desviopadrao = Math.sqrt(fracao);

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return desviopadrao;

    }

    /**
     *
     * @return
     */
    @Override
    public double correctAnswerPecentage() {
        return (double) correctAnswer() / (double) test.numberQuestions() * 100;
    }

    /**
     *
     * @return
     */
    @Override
    public double incorrectAnswerPecentage() {
        return (double) incorrectAnswer() / (double) test.numberQuestions() * 100;
    }

    /**
     *
     * @return
     */
    @Override
    public int correctAnswer() {

        int totalCorrect = 0;

        try {
            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                boolean correct = q.evaluateAnswer();

                if (correct) {
                    totalCorrect++;
                }
            }

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return totalCorrect;
    }

    /**
     *
     * @return
     */
    @Override
    public int incorrectAnswer() {
        int totalIncorrect = 0;

        try {
            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                boolean incorrect = !q.evaluateAnswer();

                if (incorrect) {
                    totalIncorrect++;
                }
            }

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return totalIncorrect;
    }

    /**
     *
     * @return
     */
    @Override
    public IQuestion[] incorrectAnswers() {
        Question[] incorrectQuestions = new Question[incorrectAnswer()];
        int j = 0; // posição do correctAnswer

        try {
            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                boolean incorrect = !q.evaluateAnswer();

                if (incorrect) {
                    incorrectQuestions[j] = q;
                    j++;
                }

            }

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return incorrectQuestions;
    }

    /**
     *
     * @return
     */
    @Override
    public IQuestion[] correctAnswers() {

        Question[] correctQuestions = new Question[correctAnswer()];
        int j = 0; // posição do correctAnswer

        try {
            for (int i = 0; i < test.numberQuestions(); i++) {

                Question q = (Question) test.getQuestion(i);
                boolean correct = q.evaluateAnswer();

                if (correct) {
                    correctQuestions[j] = q;
                    j++;
                }

            }

        } catch (TestException ex) {
            Logger.getLogger(TestStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return correctQuestions;
    }

    @Override
    public String toString() {
        return "{\"TestStatistics\":{" + "\"meanTimePerAnswer\":" + meanTimePerAnswer() + ", \"standardDeviationTimePerAnsewer\":" + standardDeviationTimePerAnsewer() + ", \"correctAnswerPecentage\":" + correctAnswerPecentage() + ", \"incorrectAnswerPecentage\":" + incorrectAnswerPecentage() + ", \"correctAnswer\":" + correctAnswer() + ", \"incorrectAnswer\":" + incorrectAnswer() + "}}";
    }

}
