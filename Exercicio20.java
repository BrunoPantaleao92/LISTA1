public class Exercicio20 {
    public static void executar(){
        /*Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem */

        double tempo = Prompt.lerDecimal("Digite o tempo em horas: ");
        double velmedia = Prompt.lerDecimal("Digite a velocidade média: ");

        Prompt.imprimir("A quantidade de litros gasta em uma viagem com um carro que faz 12km/l é: " + ((tempo * velmedia)/12));


    }
}
