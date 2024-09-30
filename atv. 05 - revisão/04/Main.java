public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoDinheiro = new Dinheiro();

        pagamentoCartao.pagar(200.00);
        pagamentoDinheiro.pagar(150.00);
    }
}
