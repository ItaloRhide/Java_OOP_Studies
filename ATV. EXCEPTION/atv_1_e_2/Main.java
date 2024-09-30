public class Main {
    public static void main(String[] args) {
        NotaFiscal primeiraNota = new NotaFiscal();

        int pecas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        primeiraNota.setDescricaoPeca("Metalon");
        primeiraNota.setNumeroPeca("12345");
        primeiraNota.setPreco(30.90);
        primeiraNota.setQuantidadeComprada(pecas);

        primeiraNota.getDescricaoPeca();
        primeiraNota.getNumeroPeca();
        primeiraNota.getPreco();
        primeiraNota.getQuantidadeComprada();

        primeiraNota.getTotalNota();
    }
}
