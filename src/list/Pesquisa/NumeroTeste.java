package list.Pesquisa;

public class NumeroTeste {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(-22);
        somaNumeros.adicionarNumero(55);
        somaNumeros.adicionarNumero(10);

        System.out.println(somaNumeros.calcularSoma());

        System.out.println("\nmaior valor da lista: " + somaNumeros.encontrarMaiorValor());

        System.out.println("\nmenor valor da lista: " + somaNumeros.encontrarMenorValor());

        System.out.println("\nnumeros da lista: " + somaNumeros.exibirNumeros());
    }
}
