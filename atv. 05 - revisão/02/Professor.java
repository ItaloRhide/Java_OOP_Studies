public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Disciplina: " + disciplina);
    }
}