package set.Pesquisa;

public class TestarTarefa {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Andar");
        listaTarefas.adicionarTarefa("Correr");
        listaTarefas.adicionarTarefa("Exercitar");
        listaTarefas.adicionarTarefa("Trabalhar");
        listaTarefas.adicionarTarefa("Comer");
        listaTarefas.adicionarTarefa("Jogar");
        listaTarefas.adicionarTarefa("Pular");

        //System.out.println("\nPrimeiro Conjunto de Tarefas: " + listaTarefas.exibiTarefas());

        listaTarefas.removerTarefa("Pular");
        System.out.println("\nSegundo Conjunto de Tarefas: " + listaTarefas.exibiTarefas());

        //System.out.println("\nTotal de Itens no Conjunto: " + listaTarefas.contarTarefas());
    
        //System.out.println("\nTarefas Pendentes: " + listaTarefas.obterTarefasPendentes());
        
        /* listaTarefas.marcarTarefaConcluida("Comer");
        listaTarefas.marcarTarefaConcluida("Exercitar");
        listaTarefas.marcarTarefaConcluida("Comer");
        System.out.println("\nTerceiro Conjunto de Tarefas: " + listaTarefas.exibiTarefas());

        listaTarefas.marcarTarefaPendente("Comer");
        listaTarefas.marcarTarefaPendente("Comer");
        System.out.println("\nQuarto Conjunto de Tarefas: " + listaTarefas.exibiTarefas()); */

        listaTarefas.limparListaTarefas();
        System.out.println("\nQuinto Conjunto de Tarefas: " + listaTarefas.exibiTarefas());
    }
}
