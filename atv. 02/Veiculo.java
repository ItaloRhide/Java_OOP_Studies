/*Classe Base
Crie uma classe chamada Veiculo com os seguintes atributos e métodos:
Atributos:

    marca (String): A marca do veículo.
    modelo (String): O modelo do veículo.

Métodos:

    acelerar(): Um método que imprime "O veículo está acelerando."
----------------------------------------------------------------------*/

package atv2;

public class Veiculo {
    private String marca;
    private String modelo;
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void acelerar(){
        System.out.println("O veículo está acelerando");
    }
}
