package atv2;

public class carro extends Veiculo{
    private int quant_portas;
    public carro(int quant_portas, String marca, String modelo){
        super(marca, modelo);
        this.quant_portas = quant_portas;
    }

    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }
}
