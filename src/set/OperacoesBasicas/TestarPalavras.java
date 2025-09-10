package set.OperacoesBasicas;

public class TestarPalavras {
    public static void main(String[] args) {
        CojuntoPalavrasUnicas cojuntoPalavrasUnicas = new CojuntoPalavrasUnicas();

        cojuntoPalavrasUnicas.adicionarPalavra("Arroz");
        cojuntoPalavrasUnicas.adicionarPalavra("Feijão");
        cojuntoPalavrasUnicas.adicionarPalavra("Cebola");
        cojuntoPalavrasUnicas.adicionarPalavra("Carne");
        cojuntoPalavrasUnicas.adicionarPalavra("Batata");
        cojuntoPalavrasUnicas.adicionarPalavra("Macarrão");

        System.out.println("\nConjunto de Palavras: " + cojuntoPalavrasUnicas.exibirPalavrasUnicas());
        
        cojuntoPalavrasUnicas.removerPalavra("Macarrão");

        System.out.println("\nConjunto de Palavras Novas: " + cojuntoPalavrasUnicas.exibirPalavrasUnicas());
    
        System.out.println(cojuntoPalavrasUnicas.verificarPalavra("Arroz"));
    }
}
