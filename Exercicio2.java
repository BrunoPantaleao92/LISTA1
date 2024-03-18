public class Exercicio2 {
    // 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.

    public static void executar(){
        int num1 = Prompt.lerInteiro("Digite o 1º número");
        int num2 = Prompt.lerInteiro("Digite o 2º número");

        Prompt.imprimir("A soma é: " + (num1 + num2));

    }

}
