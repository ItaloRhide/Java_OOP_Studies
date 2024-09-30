import java.util.ArrayList;
import java.util.List;

public class Loja<T> {
    private List<Produto<T>> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto<T> produto) {
        produtos.add(produto);
    }

    public void exibirProdutos() {
        for (Produto<T> produto : produtos) {
            System.out.println(produto);
        }
    }
}
