package set.Ordenacao;

public class TestarProduto {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Arroz", 10.0, 1);
        cadastroProdutos.adicionarProduto(3, "Feijão", 15.0, 2);
        cadastroProdutos.adicionarProduto(6, "Batata", 6.0, 6);
        cadastroProdutos.adicionarProduto(20, "Carne", 8.0, 2);
        cadastroProdutos.adicionarProduto(7, "Cenoura", 12.0, 1);

        System.out.println("\nConjunto de Produtos por Nome: " + cadastroProdutos.exibirProdutosPorNome());

        System.out.println("\nConjunto de Produtos por Preco: " + cadastroProdutos.exibirProdutosPorPreco());
    }
}
