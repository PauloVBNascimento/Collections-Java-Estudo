package set.Pesquisa;

public class TestarContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Paulo", 1234);
        agendaContatos.adicionarContato("Paulo", 4321);
        agendaContatos.adicionarContato("PauloVB", 43212);
        agendaContatos.adicionarContato("Saulo", 1234);
        agendaContatos.adicionarContato("Renam", 4321);
        agendaContatos.adicionarContato("Marcos", 5678);
        agendaContatos.adicionarContato("Lucas", 8765);
        agendaContatos.adicionarContato("Emerson", 9900);
    
        System.out.println("\nAgenda de Contatos: " + agendaContatos.exibirContatos());

        //System.out.println("\nContatos por Nome: " + agendaContatos.pesquisarPorNome("Paulo"));
    
        System.out.println("\nContato Atualizado: " + agendaContatos.atualizarNumeroContato("Lucas", 54321));
    }
}
