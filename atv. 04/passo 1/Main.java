public class Main {
    public static void main(String[] args) {
        Loja<String> loja = new Loja<>();

        loja.adicionarProduto(new Produto<>("Mesa Digitalizadora", 3500.00, "Eletrônicos"));
        loja.adicionarProduto(new Produto<>("Boné", 50.00, "Roupas"));
        loja.adicionarProduto(new Produto<>("Palha de Aço", 20.00, "Material de Limpeza"));
        
        loja.adicionarProduto(new Produto<>("Notebook", 2500.00, "Eletrônicos"));
        loja.adicionarProduto(new Produto<>("Calça", 100.00, "Roupas"));
        loja.adicionarProduto(new Produto<>("Coca-cola", 10.00, "Alimentos"));
        
        loja.adicionarProduto(new Produto<>("Celular", 1500.00, "Eletrônicos"));
        loja.adicionarProduto(new Produto<>("Blusão de frio", 200.00, "Roupas"));
        loja.adicionarProduto(new Produto<>("Maionese", 5.00, "Alimentos"));

        loja.exibirProdutos();
    }
}
