package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        return conjuntoContatos;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;
        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtulizado = contato;
                break;
            }
        }
        return contatoAtulizado;
    }
}
