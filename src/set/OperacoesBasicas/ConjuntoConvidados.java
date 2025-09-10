package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }
    
    public Set<Convidado> exibirConvidados(){
        return conjuntoConvidados;
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : conjuntoConvidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        conjuntoConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados () {
        return conjuntoConvidados.size();
    }
}
