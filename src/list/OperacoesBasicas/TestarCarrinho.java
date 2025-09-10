package list.OperacoesBasicas;

public class TestarCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Abacate", 20.0, 2);
        carrinho.adicionarItem("Chocolate", 10.0, 1);
        carrinho.adicionarItem("Cenoura", 5.0, 4);
        
        carrinho.exibirItens();

        //carrinho.removerItem("Chocolate");

        carrinho.exibirItens();

        System.out.println("Valor total do Carrinho é: " + carrinho.calcularValorTotal());
    }

}
