package teoria;
public class Teste {
    String teste;
    int numeral;

    /*void DeclaraNome(){
        teste = "Robson";
    }

    String getNome(){
        return teste;
    }*/
    
    public Teste(String teste, int numeral){
        this.teste = teste;
        this.numeral = numeral;
    }
    
    void DeclaraNumero(){
        Teste numberTeste = new Teste("Robson", 22);
        System.out.println(numberTeste);
    }
}
