package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double nota;
    
    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nAluno | nome=" + nome + ", matricula=" + matricula + ", nota=" + nota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno aluno) {
        //retorno da variavel comparada a recebida.
        return nome.compareTo(aluno.getNome());
    }
    
}
class ComparatorMaiorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
       return Double.compare(aluno1.getNota(), aluno2.getNota());
    }

}
