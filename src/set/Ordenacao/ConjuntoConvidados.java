package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoConvidado;

    public ConjuntoConvidados() {
        this.conjuntoConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        conjuntoConvidado.add(new Convidado(nome, codigoConvite));
    }
    
    public Set<Convidado> exibirConvidados() {
        return conjuntoConvidado;
    }

    public Convidado removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoARemover = null;
        if (!conjuntoConvidado.isEmpty()){
            for (Convidado convidado : conjuntoConvidado) {
                if (convidado.getCodigoConvidado() == codigoConvite) {
                    convidadoARemover = convidado;
                }
            }
            conjuntoConvidado.remove(convidadoARemover);
        } else {
            System.out.println("Conjunto vazio!");
        }
        return convidadoARemover;
    }

    public int contarConvidados() {
        return conjuntoConvidado.size();
    }
}
