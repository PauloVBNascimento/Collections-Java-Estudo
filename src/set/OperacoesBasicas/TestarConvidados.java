package set.OperacoesBasicas;

public class TestarConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Paulo", 10);
        conjuntoConvidados.adicionarConvidado("Saulo", 20);
        conjuntoConvidados.adicionarConvidado("Joao", 5);
        conjuntoConvidados.adicionarConvidado("Renato", 9);
        conjuntoConvidados.adicionarConvidado("Marcos", 12);
        conjuntoConvidados.adicionarConvidado("Lucas", 16);

        System.out.println("\nConjunto de Convidados: " + conjuntoConvidados.exibirConvidados());
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);

        System.out.println("\nNovo Conjunto de Convidados: " + conjuntoConvidados.exibirConvidados());
        System.out.println("\nNúmero de Convidados: " + conjuntoConvidados.contarConvidados());
    }
}
