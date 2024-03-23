public class Exercicio16 {
    public static void executar() {
    /*16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

    double nota1 = Prompt.lerDecimal("Insira a primeira nota: ");
    double nota2 = Prompt.lerDecimal("Insira a segunda nota: ");
    double nota3 = Prompt.lerDecimal("Insira a terceira nota: ");

    System.out.println("A média aritimética do aluno é: " + ((nota1 + nota2 + nota3)/3));
}
}
