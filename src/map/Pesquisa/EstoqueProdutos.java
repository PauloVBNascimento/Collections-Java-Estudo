package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto (Long cod, String nome, double preco, int quantidade) {
        produtosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public Map<Long, Produto> exibirProdutos() {
        return produtosMap;
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!produtosMap.isEmpty()) {
            for (Produto produto : produtosMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        } else {
            System.out.println("Map vazio!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
            if (!produtosMap.isEmpty()) {
                for (Produto produto : produtosMap.values()) {
                    if (produto.getPreco() > maiorPreco) {
                        maiorPreco = produto.getPreco();
                        produtoMaisCaro = produto;
                    }
                }
            } else {
                System.out.println("Map vazio!");
            }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
            if (!produtosMap.isEmpty()) {
                for (Produto produto : produtosMap.values()) {
                    if (produto.getPreco() < menorPreco) {
                        menorPreco = produto.getPreco();
                        produtoMaisBarato = produto;
                    }
                }
            } else {
                System.out.println("Map vazio!");
            }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisCaroPorValorTotal = null;
        double maiorPreco = Double.MIN_VALUE;
            if (!produtosMap.isEmpty()) {
                for (Produto produto : produtosMap.values()) {
                    if ((produto.getPreco() * produto.getQuantidade()) > maiorPreco) {
                        maiorPreco = (produto.getPreco() * produto.getQuantidade());
                        produtoMaisCaroPorValorTotal = produto;
                    }
                }
            } else {
                System.out.println("Map vazio!");
            }
        return produtoMaisCaroPorValorTotal;
    }

    //Bonus
    public Produto obterProdutoMenorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisBaratoPorValorTotal = null;
        double menorPreco = Double.MAX_VALUE;
            if (!produtosMap.isEmpty()) {
                for (Produto produto : produtosMap.values()) {
                    if ((produto.getPreco() * produto.getQuantidade()) < menorPreco) {
                        menorPreco = (produto.getPreco() * produto.getQuantidade());
                        produtoMaisBaratoPorValorTotal = produto;
                    }
                }
            } else {
                System.out.println("Map vazio!");
            }
        return produtoMaisBaratoPorValorTotal;
    }
}
