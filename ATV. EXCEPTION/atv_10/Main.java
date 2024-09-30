public class Main {
    public static void main(String[] args) throws Exception {
        Tempo entrada = new Tempo(10, 30, 0);  // 10:30:00
        Tempo saida = new Tempo(13, 45, 0);    // 13:45:00

        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setPlaca("ABC-1234");
        estacionamento.setModelo("Honda Civic");
        estacionamento.setEntrada(entrada);
        estacionamento.setSaida(saida);

        estacionamento.imprimirDados();

        double valor = estacionamento.calcularValor();
        System.out.printf("Valor a ser pago: R$%.2f\n", valor);
    }
}
