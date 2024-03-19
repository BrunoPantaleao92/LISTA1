public class Exercicio9 {
    public static void executar() {

        /*
         * Leia dois números nas variáveis A e B e identifique se os valores são iguais
         * ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são
         * iguais.Caso sejam diferentes, informe que são diferentes e qual número é o
         * maior
         */

        int num1 = Prompt.lerInteiro("Digite o primeiro numero: ");
        int num2 = Prompt.lerInteiro("Digite o segundo numero: ");

        if (num1 == num2) {
            System.out.println("os valores são iguais");
        } else {
            System.out.println("os números sao diferentes");
            if (num1 > num2) {
                System.out.println("O número " + num1 + " é maior");
            } else {
                System.out.println("O número " + num2 + " é maior");
            }
        }
    }
}
