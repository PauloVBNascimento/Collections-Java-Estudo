package list.Pesquisa;

public class LivroTeste {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Programação", "Paulo", 2025);
        catalogoLivros.adicionarLivro("Java", "Paulo", 2022);
        catalogoLivros.adicionarLivro("Python", "Marcos", 2020);
        catalogoLivros.adicionarLivro("SQL", "Matheus", 2019);
        catalogoLivros.adicionarLivro("Programação", "Paulo", 2024);

        System.out.println("\nLivros por autor: " + catalogoLivros.pesquisarPorAutor("Paulo"));

        System.out.println("\nLivros por anos: " + catalogoLivros.pesquisarPorIntervaloAnos(2020, 2025));

        System.out.println("\nPrimeiro Livro por titulo: " + catalogoLivros.pesquisarPorTitulo("Programação"));

    }
}
