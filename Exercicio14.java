public class Exercicio14 {
    public static void executar() {
        /*
         * A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
         * Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo
         * termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva
         * um algoritmo que encontre o n-ésimo termo de uma progressão aritmética.
         * Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28
         */

        int a = Prompt.lerInteiro("Digite o valor de a: ");
        int n = Prompt.lerInteiro("Digite o valor de n: ");
        int r = Prompt.lerInteiro("Digite o valor de r");

        System.out.println("a1 + (n - 1) * r = " + (a + (n - 1) * r));

    }
}
