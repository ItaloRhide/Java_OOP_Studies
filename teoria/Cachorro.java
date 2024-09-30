package teoria;
public class Cachorro extends Ser{
    
    String dono;
    
    public Cachorro(String nome, int idade, String dono){
        super(nome, idade);
        this.dono = dono;
    }

    @Override
    public String saudacao(){
        return "BARK BARK";
    }
}
