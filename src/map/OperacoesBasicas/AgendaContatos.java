package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapContato;

    public AgendaContatos() {
        this.mapContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        mapContato.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!mapContato.isEmpty()) {
            mapContato.remove(nome);
        }
    }

    public Map<String, Integer> exibirContato() {
        return mapContato;
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!mapContato.isEmpty()) {
           numeroPorNome = mapContato.get(nome);
        }
        return numeroPorNome;
    }
}


