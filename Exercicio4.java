public class Exercicio4 {
    public static void executar(){
        /* 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos. */

        double num1 = Prompt.lerDecimal("Digite o primeiro número: ");

        double num2 = Prompt.lerDecimal("Digite o segundo número: ");

        Prompt.imprimir("Soma: " + (num1 + num2) + "\n");
        Prompt.imprimir("Subtração: " + (num1 - num2) + "\n");
        Prompt.imprimir("Multiplicação: " + (num1 * num2) + "\n");
        Prompt.imprimir("Divisão: " + (num1 / num2) + "\n");

   }

}
