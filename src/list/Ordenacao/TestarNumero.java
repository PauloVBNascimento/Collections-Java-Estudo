package list.Ordenacao;

public class TestarNumero {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(40);
        ordenacaoNumeros.adicionarNumero(24);

        System.out.println("\nLista de Números: " + ordenacaoNumeros.exibirNumeros());
        System.out.println("\nLista de Números Ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("\nLista de Números Descendente: " + ordenacaoNumeros.ordenarDescendente());

        
    }
}
