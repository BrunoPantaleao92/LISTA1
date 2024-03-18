public class Exercicio7 {
    public static void executar() {
        /*
         * Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
         * este número está no intervalo entre 100 e 200. Caso o número esteja fora do
         * intervaloo usuário também deverá ser informado.
         */

        int num = Prompt.lerInteiro("Digite um número: ");

        if (num > 100 && num < 200) {
            Prompt.imprimir("O número está entre o intervalo");
        } else {
            Prompt.imprimir("O número não está no intervalo");
        }

    }

}
