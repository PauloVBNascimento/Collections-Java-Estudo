package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        this.conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        conjuntoProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        //HashSet não consegue organizar, então em situações onde queremos
        //uma ordem, utilizamos TreeSet
        Set<Produto> conjuntoOrdenadoPorNome = new TreeSet<>(conjuntoProdutos);
        return conjuntoOrdenadoPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> conjuntoOrdenadoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        conjuntoOrdenadoPorPreco.addAll(conjuntoProdutos);
        return conjuntoOrdenadoPorPreco;
    }
}
