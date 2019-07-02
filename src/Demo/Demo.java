package Demo;

import controllers.TestMultipleChoice;
import interfaces.exceptions.TestException;
import views.TestWindow;

/**
 * <h3>ESTG - Escola Superior de Tecnologia e Gestão <br>
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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TestException {

        System.out.println("Inicio de Teste!");

        // Carregar o test
        //Test demoTest = new Test();
        TestMultipleChoice demoTest = new TestMultipleChoice();
        demoTest.loadFromJSONFile("Resources\\data\\teste_A.json");

        // Executar o teste na camada gráfica
        TestWindow t = new TestWindow();
        t.startTest(demoTest);

        // Obter os resultados do teste
        System.out.println("Teste efetuado!");
        System.out.println(demoTest.toString());
    }

}
