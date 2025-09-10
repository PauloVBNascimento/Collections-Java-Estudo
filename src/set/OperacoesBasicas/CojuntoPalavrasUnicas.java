package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class CojuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public CojuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    @Override
    public String toString() {
        return "CojuntoPalavrasUnicas | palavra = " + conjuntoPalavras;
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }
    
    public Set<String> exibirPalavrasUnicas(){
        return conjuntoPalavras;
    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavras.isEmpty()) {
            if (conjuntoPalavras.contains(palavra)) {
                conjuntoPalavras.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        } else {
            System.out.println("Conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavras.contains(palavra);
    }
}