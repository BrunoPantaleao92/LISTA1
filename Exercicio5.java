public class Exercicio5 {
    public static void executar(){
        /* 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados. */

        int num1 = Prompt.lerInteiro("Digite o primeiro número: ");
        int num2 = Prompt.lerInteiro("Digite o segundo número: ");

        int aux = num1;


        Prompt.imprimir("O valor da primeira variável é: " + num1);
        Prompt.imprimir("O valor da segunda variável é: " + num2);

        num1 = num2;
        num2 = aux;

        Prompt.imprimir("O valor da primeira variável trocada é: " + num1);
        Prompt.imprimir("O valor da segunda variável trocada é: " + num2);
    }
}
