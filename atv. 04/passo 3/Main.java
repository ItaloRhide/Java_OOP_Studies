public class Main {
    public static void main(String[] args) {
        Loja<String> loja = new Loja<>();

        Produto<String> mesa_digitalizadora = new Produto<>("Mesa Digitalizadora", 3500.00, "Eletrônicos");
        Produto<String> bone = new Produto<>("Boné", 50.00, "Roupas");
        Produto<String> maionese = new Produto<>("Maionese", 5.00, "Alimentos");
        Produto<String> mdl = new Produto<>("Palha de Aço", 1500.00, "Material de Limpeza");

        loja.adicionarProduto(mesa_digitalizadora);
        loja.adicionarProduto(bone);
        loja.adicionarProduto(maionese);
        loja.adicionarProduto(mdl);

        Cliente cliente1 = new Cliente("Ana", "ana@example.com");
        Cliente cliente2 = new Cliente("Bruno", "bruno@example.com");

        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        loja.adicionarPedido(cliente1, mesa_digitalizadora);
        loja.adicionarPedido(cliente1, maionese);
        loja.adicionarPedido(cliente2, bone);
        loja.adicionarPedido(cliente2, mdl);

        System.out.println("\nExibindo pedidos:");
        loja.exibirPedidos(cliente1);
        loja.exibirPedidos(cliente2);
    }
}
