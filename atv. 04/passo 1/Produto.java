public class Produto<T> {
    private String nome;
    private double preco;
    private T categoria;

    public Produto(String nome, double preco, T categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public T getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Categoria: " + categoria;
    }
}
