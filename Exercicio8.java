public class Exercicio8 {
    public static void executar() {
        /*
         * 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso
         * estenúmero seja maior ou igual a 50, outra se ele for menor que 50.
         */
        int num = Prompt.lerInteiro("Digite um número: ");

        if (num >= 50) {
            System.out.println("Número maior ou igual a 50");

        } else {
            System.out.println("Número menor que 50");
        }

    }
}
