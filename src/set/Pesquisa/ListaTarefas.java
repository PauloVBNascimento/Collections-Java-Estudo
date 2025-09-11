package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoTarefas.add(new Tarefa(descricao, false));
    }

    public Tarefa removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            conjuntoTarefas.remove(tarefaParaRemover);
        } else{
            System.out.println("Conjunto vazio!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
        return tarefaParaRemover;
    }

    public Set<Tarefa> exibiTarefas(){
        return conjuntoTarefas;
    }

    public int contarTarefas(){
        return conjuntoTarefas.size();
    }
    
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> conjuntoConcluido = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas){
                if (tarefa.isConcluida() == true){
                    conjuntoConcluido.add(tarefa);
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
        return conjuntoConcluido;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> conjuntoPendente = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas){
                if (tarefa.isConcluida() == false){
                    conjuntoPendente.add(tarefa);
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
        return conjuntoPendente;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    if (tarefa.isConcluida() == false) {
                        tarefa.setConcluida(true);
                        break;
                    } else {
                        System.out.println("Está tarefa já está concluida.");
                        break;
                    }

                }
            }
        } else {
            System.out.println("Conjunto Vazio");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!conjuntoTarefas.isEmpty()){
            for (Tarefa tarefa : conjuntoTarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    if (tarefa.isConcluida() == true) {
                        tarefa.setConcluida(false);
                        break;
                    } else {
                        System.out.println("Está tarefa já está pendente.");
                        break;
                    }

                }
            }
        } else {
            System.out.println("Conjunto Vazio");
        }
    }

    public void limparListaTarefas() {
        if (conjuntoTarefas.isEmpty()) {
            System.out.println("O conjunto já está vazio");
        }else {
            /*
            Esse código abaixo funciona, mas vai ser confuso e vai
            iterar sobre todos os elementos, já o clear é claro e
            vai saber como limpar de maneira eficiênte.

            //conjuntoTarefas.removeAll(conjuntoTarefas);

            removeAll deve ser usado apenas quando for remover
            de outra Collection.
            */
            
            conjuntoTarefas.clear();
        }
    }
}
