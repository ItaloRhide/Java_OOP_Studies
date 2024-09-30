//Crie uma classe Aluno com atributos que armazenem o nome, a série que cursa e o
//grau. Crie um getter e um setter, além de uma variável static que conte a quantidade
//de objetos criados, a ser utilizada no construtor e no finalizador. Crie um vetor com
//15 objetos desta classe e preencha os dados através do setter.

public class Aluno {
    private String nome;
    private int serie;
    private String grau;
    
    private static int contador = 0;

    public Aluno() {
        contador++;
    }

    // Finalizador
    @Override
    protected void finalize() throws Throwable {
        try {
            contador--;
        } finally {
            super.finalize();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getSerie() {
        return serie;
    }

    public String getGrau() {
        return grau;
    }

    public void setNome(String nomeInput) {
        this.nome = nomeInput;
    }

    public void setSerie(int serieInput) {
        this.serie = serieInput;
    }

    public void setGrau(String grauInput) {
        this.grau = grauInput;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Série: " + this.serie);
        System.out.println("Grau: " + this.grau);
    }

    public static int getContador() {
        return contador;
    }
}
