package set.Ordenacao;

public class TestarConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Paulo", 1);
        conjuntoConvidados.adicionarConvidado("Paulo", 2);
        conjuntoConvidados.adicionarConvidado("Saulo", 9);
        conjuntoConvidados.adicionarConvidado("Marcos", 21);
        conjuntoConvidados.adicionarConvidado("Renato", 15);
        conjuntoConvidados.adicionarConvidado("Renam", 18);

        System.out.println("\nConjuto de Convidados 1: " + conjuntoConvidados.exibirConvidados());

        System.out.println("\nConvidado Removido: " + conjuntoConvidados.removerConvidadoPorCodigoConvite(2));

        System.out.println("\nConjunto de Convidados 2: " + conjuntoConvidados.exibirConvidados());

        System.out.println("\nNúmero de Convidados é: " + conjuntoConvidados.contarConvidados());
    }
}
