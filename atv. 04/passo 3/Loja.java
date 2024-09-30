import java.util.*; // Importando HashMap, List, etc.

public class Loja<T> {
    private List<Produto<T>> produtos;
    private Set<Cliente> clientes;
    private Map<Cliente, List<Produto<?>>> pedidos;

    public Loja() {
        produtos = new ArrayList<>();
        clientes = new HashSet<>();
        pedidos = new HashMap<>();
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

    public void adicionarPedido(Cliente cliente, Produto<?> produto) {
        pedidos.putIfAbsent(cliente, new ArrayList<>());
        pedidos.get(cliente).add(produto);
        System.out.println("Pedido adicionado para " + cliente.getNome() + ": " + produto.getNome());
    }

    public void exibirPedidos(Cliente cliente) {
        List<Produto<?>> produtosDoCliente = pedidos.get(cliente);
        if (produtosDoCliente != null) {
            System.out.println("Pedidos de " + cliente.getNome() + ":");
            for (Produto<?> produto : produtosDoCliente) {
                System.out.println("- " + produto);
            }
        } else {
            System.out.println(cliente.getNome() + " não fez nenhum pedido.");
        }
    }
}
