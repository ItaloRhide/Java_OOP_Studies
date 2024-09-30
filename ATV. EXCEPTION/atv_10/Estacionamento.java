//Crie uma classe Estacionamento para armazenar dados de um estacionamento. Os
//atributos devem representar a placa e modelo do carro além da hora de entrada e
//saída do estacionamento. Utilize dois objetos da classe Tempo criada no exercício
//anterior. Crie métodos para:
//a. Funcionar como getter e setter;
//b. Inicializar os dados com vazio ou zero;
//c. Imprimir os dados de um carro estacionado;
//d. Calcular e retornar o valor a ser pago pelo carro estacionado. Considere o
//preço de R$1,50 por hora. Utilize o método da classe Tempo.

public class Estacionamento {
    private String placa;
    private String modelo;
    private Tempo entrada;
    private Tempo saida;

    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.entrada = new Tempo();
        this.saida = new Tempo();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getEntrada() {
        return entrada;
    }

    public void setEntrada(Tempo entrada) {
        this.entrada = entrada;
    }

    public Tempo getSaida() {
        return saida;
    }

    public void setSaida(Tempo saida) {
        this.saida = saida;
    }

    public void imprimirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.print("Entrada: ");
        entrada.imprimirHorario();
        System.out.print("Saída: ");
        saida.imprimirHorario();
    }

    public double calcularValor() {
        Tempo tempoPermanencia = saida.somarEretornar(entrada);
        
        int horasTotais = tempoPermanencia.getHoras();
        int minutos = tempoPermanencia.getMinutos();
        
        if (minutos > 0) {
            horasTotais++;
        }
        
        double valor = horasTotais * 1.5;
        
        return valor;
    }
}
