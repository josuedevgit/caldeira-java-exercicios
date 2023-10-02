package exercicio02;

public class Principal {

    public static void main(String[] args) {
        FormaGeometrica[] listaFormas = new FormaGeometrica[5];
        String[] nomesFormas = new String[5];

        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica triangulo = new Triangulo(6, 8);
        FormaGeometrica circulo = new Circulo(8);
        FormaGeometrica retangulo = new Retangulo(8, 4);
        FormaGeometrica losango = new Losango(4, 12);

        listaFormas[0] = quadrado;
        listaFormas[1] = triangulo;
        listaFormas[2] = circulo;
        listaFormas[3] = retangulo;
        listaFormas[4] = losango;

        nomesFormas[0] = "Área do Quadrado: ";
        nomesFormas[1] = "Área do Triangulo: ";
        nomesFormas[2] = "Área do Circulo: ";
        nomesFormas[3] = "Área do Retangulo: ";
        nomesFormas[4] = "Área do Losango: ";

        for(int i = 0; i < listaFormas.length; i++) {
            double area = listaFormas[i].cacularArea();
            String areaFormatada = String.format("%.2f", area);

            System.out.print(nomesFormas[i]);
            System.out.println(areaFormatada);
        }
    }
}
