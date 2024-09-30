package teoria;
public class Ser {
    String nome;
    int idade;
    String sobrenome;

    public Ser (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    public String saudacao(){
        return null;
    }

}

class Pessoa extends Ser{
    public Pessoa (String nome, int idade, String sobrenome){
        super(nome, idade);
        this.sobrenome = sobrenome;
    }

    public String saudacao(){
        return "Olá, eu sou " + this.nome;
    }
}