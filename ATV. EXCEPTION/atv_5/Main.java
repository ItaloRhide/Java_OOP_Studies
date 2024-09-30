public class Main {
    public static void main(String[] args) throws Exception {
        Aluno[] alunos = new Aluno[15];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno(); 
            alunos[i].setNome("Aluno " + (i + 1));
            alunos[i].setSerie(i + 1);
            alunos[i].setGrau("Grau " + (i + 1)); 
        }

        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
            System.out.println();
        }

        System.out.println("Número total de objetos Aluno criados: " + Aluno.getContador());
    }
}
