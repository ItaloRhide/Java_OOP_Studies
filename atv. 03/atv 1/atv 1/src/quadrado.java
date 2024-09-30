public class quadrado implements FormaGeometrica {
    private double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double comprimento() {
        return 4 * lado;
    }
}