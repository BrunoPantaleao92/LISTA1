public class Exercicio17 {
    public static void executar(){
        /* 17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:

        Média ponderada =
        (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)

        Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
        Média ponderada = 8.25 */

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");
        double peso3 = Prompt.lerDecimal("Digite o peso da terceira nota: ");

        Prompt.imprimir("A média ponderada é: " + (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3));
    }
}
