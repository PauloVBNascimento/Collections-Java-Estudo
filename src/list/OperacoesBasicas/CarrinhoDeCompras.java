package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Implementado uma List com generics do objeto Item chamado lista compras;
    private List<Item> listaCompras;

    /* Ao criar o construtor, ele vem assim:

    public CarrinhoDeCompras(List<Item> listaCompras) {
        this.listaCompras = listaCompras;
    }*/
    
    // mas queremos criar uma lista que vem vazia, sendo assim:
    // vamos criar um construtor que recebe uma nova ArrayList<>();

    // construtor em que listacompras vai receber um ArrayList vazio
    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    //Metodo para adicionar um Item em compra (necessário construtor na classe Item)
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaCompras.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome) {
        /*Como a lista pode ter itens repetidos, é necessário
        criar uma nova lista que receba os itens repetidos e
        então remova todos baseado nessa nova lista.
        */

        //Objeto List com generics indicando que receberá objetos do tipo Item chamado itemsParaRemover
        //Recebe um novo ArrayList
        List<Item> itemsParaRemover = new ArrayList<>();
        //Um for each que percorre todos os itens de listaCompras e joga cada Item na variavel i
        for(Item i : listaCompras) {
            //Para cada Item, compara se o nome encontrado é igual ao nome solicitado
            if(i.getNome().equalsIgnoreCase(nome)){
                //Se encontrar, adiciona a nova lista itemsParaRemover
                itemsParaRemover.add(i);
            }
        }
        //Após adicionar todas as ocorrências na nova lista, utiliza removeAll para remove-las.
        listaCompras.removeAll(itemsParaRemover);
    }

    //Como já aprendi a mapear, o resto são as operações
    public double calcularValorTotal(){
        //criação de variavel dentro do metodo para receber o valor total das compras
        double valorTotal = 0;
        //For each de cada objeto Item dentro de listaCompras
        for (Item i : listaCompras) {
            //O valorTotal recebe ele mesmo + o preço * quantidade do item em questão
            //o for garante que cada item será visto
            valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
        }
        //Após terminar, retorna o valorTotal
        return valorTotal;
    }

    //Metodo mais simples para exibir os itens.
    public void exibirItens(){
        System.out.println("Lista de compras: \n" + listaCompras);
    }
}
