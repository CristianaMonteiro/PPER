/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import controllers.Test;
import interfaces.exceptions.TestException;
import views.TestWindow;

/**
 *
 * @author Cris
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TestException {

        System.out.println("Inicio de Teste!");

        // Carregar o test
        Test demoTest = new Test();
        demoTest.loadFromJSONFile("Resources\\data\\teste_A.json");

        // Executar o teste na camada gráfica
        TestWindow t = new TestWindow();
        t.startTest(demoTest);

        // Obter os resultados do teste
        System.out.println("Teste efetuado!");
        System.out.println(demoTest.toString());
    }

}
