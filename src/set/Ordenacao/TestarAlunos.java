package set.Ordenacao;

public class TestarAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Paulo", (long) 1, 10);
        gerenciadorAlunos.adicionarAluno("Saulo", (long) 12, 9);
        gerenciadorAlunos.adicionarAluno("Claudio", (long) 20, 8);
        gerenciadorAlunos.adicionarAluno("Renato", (long) 8, 5);
        gerenciadorAlunos.adicionarAluno("Renam", (long) 10, 17);
        gerenciadorAlunos.adicionarAluno("Lucas", (long) 17, 20);

        //System.out.println("\nConjunto de Alunos: " + gerenciadorAlunos.exibirAlunos());
    
        //gerenciadorAlunos.removerAluno((long) 8);

        //System.out.println("\nConjunto de Alunos após remoção: " + gerenciadorAlunos.exibirAlunos());

        //System.out.println("\nAlunos por Nome: " + gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("\nAlunos por Nota: " + gerenciadorAlunos.exibirAlunosPorNota());
    }


}
