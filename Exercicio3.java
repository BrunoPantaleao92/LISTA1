public class Exercicio3 {

    public static void executar(){
        /* 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida. */

        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");

        if (a > b){
            Prompt.imprimir("Primeiro número é maior");
        } else if(a < b){
            Prompt.imprimir("Segundo número é maior");
        } else{
            Prompt.imprimir("Sequencia de números informados é inválida.");
        }
    }
}
