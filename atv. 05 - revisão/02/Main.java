public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        
        Pessoa professor = new Professor("Carlos", 45, "Matemática");
        
        pessoa.apresentar();
        professor.apresentar();
    }
}

/*
 No caso do objeto pessoa (instância da classe Pessoa), o método apresentar() da própria classe Pessoa é chamado, exibindo apenas o nome e a idade.

No caso do objeto professor (instância da classe Professor), embora ele seja referenciado como Pessoa, o método apresentar() da classe Professor é chamado graças ao polimorfismo. Primeiro, ele chama o método apresentar() da superclasse Pessoa usando super.apresentar(), que imprime o nome e a idade. Em seguida, ele adiciona a impressão da disciplina.
 */