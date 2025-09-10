package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        //Lembrar do new para indicar novo objeto
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaPorAltura, new ComparatorPorAltura());
        return listaPorAltura;
    }
}
