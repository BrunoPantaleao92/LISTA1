public class Exercicio18 {
    public static void executar(){

        /*Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica */
        
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        Prompt.imprimir("A média harmônica é: " + (3/((1/nota1) + (1/nota2) + (1/nota3))));
    }
}
