public class TesteFormaGeometrica {
    public static void main(String[] args) {
        FormaGeometrica circulo = new circulo(5.0);
        FormaGeometrica quadrado = new quadrado(4.0);

        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Comprimento do círculo: " + circulo.comprimento());

        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Comprimento do quadrado: " + quadrado.comprimento());
    }
}
