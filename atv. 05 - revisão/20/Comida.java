public class Comida implements Prato {
    private String nome;
    private double preco;

    public Comida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Comida: " + nome;
    }
}
