package map.OperacoesBasicas;

public class TestarAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Paulo", 1234);
        agendaContatos.adicionarContato("Saulo", 4321);
        agendaContatos.adicionarContato("Claudio", 5678);
        agendaContatos.adicionarContato("Renam", 8765);
        agendaContatos.adicionarContato("Renato", 9900);
        agendaContatos.adicionarContato("Raul", 9901);

        System.out.println("\nMap de Contatos: " + agendaContatos.exibirContato());

        System.out.println("\nMap de Contato por Nome: " + agendaContatos.pesquisarPorNome("Saulo"));
    }
}
