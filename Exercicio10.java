public class Exercicio10 {
    public static void executar() {
        /*
         * Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.
         * Casoo usuário digite um valor que não esteja neste intervalo, exibir a
         * mensagem: “Número inválido!”
         */

        int num = Prompt.lerInteiro("Digite um número de 1 a 5");

        switch (num) {
            case 1:
                System.out.println("Um");
                break;

            case 2:
                System.out.println("Dois");
                break;

            case 3:
                System.out.println("Três");
                break;

            case 4:
                System.out.println("Quatro");
                break;

            case 5:
                System.out.println("Cinco");
                break;

            default:
                System.out.println("Número inválido!");
                break;
        }

    }
}
