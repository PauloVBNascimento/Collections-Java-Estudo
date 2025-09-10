package list.Ordenacao;

public class TestarPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Paulo", 20, 1.90);
        ordenacaoPessoas.adicionarPessoa("Joao", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Alex", 19, 1.67);
        ordenacaoPessoas.adicionarPessoa("Zeus", 50, 2.20);

        System.out.println("\nPor altura: " + ordenacaoPessoas.ordenarPorAltura());
        System.out.println("\nPor idade: " + ordenacaoPessoas.ordenarPorIdade());
    }
}
