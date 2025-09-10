package list.OperacoesBasicas;

public class Item {
    
    private String nome;
    private double preco;
    private int quantidade;

    //Lembrar de criar o construtor com os itens a serem adicionados.
    public Item(String nome, double preco, int quantidade) {
        //Lembrar de colocar o this.variavel = variavel
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItem - nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + "";
    }

}
