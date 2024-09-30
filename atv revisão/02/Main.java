public class Main{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Robson", 22);
        Professor professor1 = new Professor("Erick", 27, "Análise estratégica de guerra");
        
        pessoa1.apresentar();
        System.out.println("\n");
        professor1.apresentar();
    }
}
