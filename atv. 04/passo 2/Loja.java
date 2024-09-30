import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Loja<T> {
    private List<Produto<T>> produtos;
    private Set<Cliente> clientes;

    public Loja() {
        produtos = new ArrayList<>();
        clientes = new HashSet<>();
    }

    public void adicionarProduto(Produto<T> produto) {
        produtos.add(produto);
    }

    public void exibirProdutos() {
        for (Produto<T> produto : produtos) {
            System.out.println(produto);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if (clientes.add(cliente)) {
            System.out.println("Cliente adicionado: " + cliente);
        } else {
            System.out.println("Cliente duplicado não adicionado: " + cliente);
        }
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
