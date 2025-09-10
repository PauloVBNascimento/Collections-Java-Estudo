package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumero;

    public OrdenacaoNumeros(){
        this.listaNumero = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nOrdenacaoNumeros | Numero= " + listaNumero + "]";
    }

    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }

    public List<Integer> exibirNumeros(){
        return listaNumero;
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()){
            Collections.sort(listaAscendente);
        }
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()){
            listaDescendente.sort(Collections.reverseOrder());
        }
        return listaDescendente;
    }
}
