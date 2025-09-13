package map.OperacoesBasicas;

public class TestarDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Azul", "Cor");
        dicionario.adicionarPalavra("Vermelho", "Outra cor");
        dicionario.adicionarPalavra("Garfo", "Objeto usado para comer");
        dicionario.adicionarPalavra("Celular", "Objeto eletrônico multiuso");

        System.out.println("\nMap de Dicionario: " + dicionario.exibirPalavras());

        dicionario.removerPalavra("Vermelho");

        System.out.println("\nMap de Dicionar sem um Elemento: " + dicionario.exibirPalavras());

        System.out.println("\nDefinição de Palavra Especifica: " + dicionario.pesquisarPorPalavra("Garfo"));
    }
}
