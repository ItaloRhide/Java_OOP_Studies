public class RestauranteApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");

        Comida pizza = new Comida("Pizza", 35.00);
        Bebida suco = new Bebida("Suco de Laranja", 8.00);

        Pedido pedido = new Pedido(cliente);

        try {
            pedido.adicionarPrato(pizza);
            pedido.adicionarPrato(suco);
            pedido.adicionarPrato(null); 
        } catch (PratoIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        cliente.adicionarPedido(pedido);

        System.out.println("Pedidos de " + cliente.getNome() + ":");
        for (Prato prato : pedido.getPratos()) {
            System.out.println(prato.getDescricao() + " - R$ " + prato.getPreco());
        }

        System.out.println("Total do pedido: R$" + pedido.calcularTotal());
    }
}
