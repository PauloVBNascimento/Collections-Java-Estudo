package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> conjuntoAlunos;

    public GerenciadorAlunos() {
        this.conjuntoAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        conjuntoAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Long matricula) {
        Aluno alunoParaRemover = null;
        if (!conjuntoAlunos.isEmpty()) {
            for (Aluno aluno : conjuntoAlunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
        } else {
            System.out.println("Conjuto de Alunos está Vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
        conjuntoAlunos.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunos() {
        return conjuntoAlunos;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(conjuntoAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorMaiorNota());
        alunosPorNota.addAll(conjuntoAlunos);
        return alunosPorNota;
    }
}
