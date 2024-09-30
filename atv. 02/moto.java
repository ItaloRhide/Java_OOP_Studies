package atv2;

public class moto extends Veiculo{
    private boolean TemCarenagem;
    public moto (String marca, String modelo, boolean TemCarenagem){
        super(marca, modelo);
        this.TemCarenagem = TemCarenagem;
    }
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }
}
