package atv2;

public class SistemaDeVeiculo {
    public static void main(String[] args) {
        carro carroTeste = new carro(4, "Honda", "Civic");
        moto motoTeste = new moto("Suzuki", "Hayabusa", true);

        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = carroTeste;
        veiculos[1] = motoTeste;

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
        }
    }
}