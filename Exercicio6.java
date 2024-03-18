public class Exercicio6 {
    public static void executar(){
        /* 6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:*/

        double temperatura = Prompt.lerDecimal("Digite a temperatura em graus Celcius: ");

        Prompt.imprimir("O valor da temperatura em Fahrenheit é: " + (temperatura * 1.8 + 32));
        Prompt.imprimir("A formula é: Celcius * 1.8 + 32");
    }

}
