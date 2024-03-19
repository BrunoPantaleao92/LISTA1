public class Exercicio11 {
    public static void executar() {

        /*
         * Escreva um algoritmo que leia três valores inteiros distintos e escreva-os
         * emordem crescente
         */

        int num1 = Prompt.lerInteiro("Digite o primeiro número");
        int num2 = Prompt.lerInteiro("Digite o segundo número");
        int num3 = Prompt.lerInteiro("Digite o terceiro número");

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }

        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }

        } else if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }

        }

    }
}
