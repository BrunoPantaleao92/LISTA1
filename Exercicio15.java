public class Exercicio15 {
    public static void executar() {
        /*
         * Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e
         * P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal
         * cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10,
         * 20). Distancia: 18,03
         */

        int x1 = Prompt.lerInteiro("Digite o valor de x do primeiro ponto: ");
        int y1 = Prompt.lerInteiro("Digite o valor de y do primeiro ponto: ");

        int x2 = Prompt.lerInteiro("Digite o valor de x do segundo ponto: ");
        int y2 = Prompt.lerInteiro("Digite o valor de y do segundo ponto: ");

        System.out.println("A distancia entre os pontos é: " + Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

    }
}