
import java.util.Scanner;

public class Contador {

    /**
     * *Vamos exercitar todo o conteúdo apresentado no módulo de Controle de
     * Fluxo codificando o seguinte cenário.

     *      *O sistema deverá receber dois parâmetros via terminal que representarão
     * dois números inteiros, com estes dois números você deverá obter a
     * quantidade de interações (for) e realizar a impressão no console
     * (System.out.print) dos números incrementados, exemplo:

     *      *Se você passar os números 12 e 30, logo teremos uma interação (for) com
     * 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número
     * 1", "Imprimindo o número 2" e assim por diante.

     *      *Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá
     * lançar a exceção customizada chamada de ParametrosInvalidosException com
     * a segunda mensagem:      *
     * "O segundo parâmetro deve ser maior que o primeiro"

     *      *Crie o projeto DesafioControleFluxo Dentro do projeto, crie a classe
     * Contador.java para realizar toda a codificação do nosso programa. Dentro
     * do projeto, crie a classe ParametrosInvalidosException que representará a
     * exceção de negócio no sistema. **
     */
    public static void main(String[] args) throws Exception {

        Scanner dados = new Scanner(System.in);

        System.out.println("Informe Primeiro Valor: ");
        int primeiroValor = dados.nextInt();

        System.out.println("Informe Segundo Valor: ");
        int segundoValor = dados.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException excessao) {
            System.out.println(excessao.getMessage());

        }

    }

    static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
        if (primeiroValor > segundoValor) {
            throw new ParametrosInvalidosException("O Segundo Valor deve ser maior que o Primeiro!! ");
        }

        int resultado = segundoValor - primeiroValor;

        for (int i = 1; i <= resultado; i++) {

            System.out.println("Numero: " + i);
        }
    }

}
