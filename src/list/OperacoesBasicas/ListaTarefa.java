package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa  = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(listaTarefa);
    }
}
