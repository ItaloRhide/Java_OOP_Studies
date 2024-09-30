import java.util.ArrayList;

public class ExemploGenerics {
    public static void main(String[] args) {
        ArrayList<Professor> listaDeProfessores = new ArrayList<>();

        listaDeProfessores.add(new Professor("João", "Matemática"));
        listaDeProfessores.add(new Professor("Maria", "História"));
        listaDeProfessores.add(new Professor("Carlos", "Física"));

        for (Professor professor : listaDeProfessores) {
            System.out.println("Nome: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        }
    }
}

/*
A segurança de tipos é garantida porque, ao usar generics, o tipo dos objetos na lista é explicitamente declarado como Professor. Assim, o compilador impede que outros tipos de dados sejam adicionados à lista, evitando erros em tempo de execução.
Durante a iteração sobre a lista (for (Professor professor : listaDeProfessores)), sabemos que cada item da lista é do tipo Professor, então podemos acessar os métodos dessa classe diretamente sem necessidade de conversão ou verificação de tipo.
*/