public class Main {
    public static void main(String[] args) {
        Loja<String> loja = new Loja<>();

        loja.adicionarProduto(new Produto<>("Mesa digitalizadora", 3500.00, "Eletrônicos"));
        loja.adicionarProduto(new Produto<>("boné", 50.00, "Roupas"));
        loja.adicionarProduto(new Produto<>("Palha de Aço", 20.00, "Material de Limpeza"));

        System.out.println("Lista de produtos:");
        loja.exibirProdutos();

        Cliente cliente1 = new Cliente("Ana", "ana@gmail.com");
        Cliente cliente2 = new Cliente("Bruno", "bruno@outlook.com");
        Cliente cliente3 = new Cliente("Carlos", "carlos@laxlogtransportes.com");
        Cliente clienteDuplicado = new Cliente("Ana", "ana@gmail.com");

        System.out.println("\nAdicionando clientes:");
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);
        loja.adicionarCliente(cliente3);
        loja.adicionarCliente(clienteDuplicado);

        System.out.println("\nLista de clientes:");
        loja.exibirClientes();
    }
}
