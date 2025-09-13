package map.Pesquisa;

public class TestarProduto {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        
        estoqueProdutos.adicionarProduto(1l, "Carne", 20.0, 1);
        estoqueProdutos.adicionarProduto(2l, "Frango", 10.0, 3);
        estoqueProdutos.adicionarProduto(6l, "Arroz", 5.0, 2);
        estoqueProdutos.adicionarProduto(5l, "Feijão", 7.0, 1);
        estoqueProdutos.adicionarProduto(8l, "Batata", 2.0, 6);

        System.out.println("\nEstoque de Produtos: " + estoqueProdutos.exibirProdutos());
    
        System.out.println("\nValor Total do Estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("\nProduto Mais Caro: " + estoqueProdutos.obterProdutoMaisCaro());
    
        System.out.println("Produto Mais Barato: " + estoqueProdutos.obterProdutoMaisBarato());
    
        System.out.println("Produto Mais Caro Por Quantidade: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    
        System.out.println("Produto Mais Barato Por Quantidade: " + estoqueProdutos.obterProdutoMenorQuantidadeValorTotalNoEstoque());
        
    }

}
