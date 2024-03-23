public class Exercicio13 {
    public static void executar() {

        /*
         * Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
         * operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
         * de A por B se o operador aritmético for válido; caso contrário deve ser
         * impresso uma mensagem de operador não definido. Tratar erro de divisão por
         * zero.
         */

        int a = Prompt.lerInteiro("Digite o primeiro número");
        int b = Prompt.lerInteiro("Digite o segundo número");
        String operador = Prompt.lerLinha("Digite o operador(+,-,*,/): ");

        switch (operador) {
            case "+":
                System.out.println("Soma:" + (a + b));
                break;
            case "-":
                System.out.println("Subtração:" + (a - b));
                break;
            case "*":
                System.out.println("Multiplicação:" + (a * b));
                break;
            case "/":
                System.out.println("Divisão:" + (a / b));
                break;

            default:
                System.out.println("Operador inválido");
                break;
        }

    }
}
