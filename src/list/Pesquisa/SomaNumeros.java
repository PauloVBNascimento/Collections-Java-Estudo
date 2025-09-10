package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //!Lembrar de não criar uma classe Numero, Integer já existe!!

    //Primeiro cria o atributo
    private List<Integer> listaNumeros;

    //Depois cria o construtor que receberá uma lista vazia
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                resultado = resultado + n;
            }
        }
        return resultado;
    }

    public int encontrarMaiorValor(){
        int maiorValor = 0;
        if (!listaNumeros.isEmpty()){
            for (Integer n : listaNumeros) {
                if (n > maiorValor) {
                    maiorValor = n;
                }
            }
        }
        return maiorValor;
    }

    public int encontrarMenorValor(){
        int maiorValor = 0;
        if (!listaNumeros.isEmpty()){
            for (Integer n : listaNumeros) {
                if (n < maiorValor) {
                    maiorValor = n;
                }
            }
        }
        return maiorValor;
    }

    public List<Integer> exibirNumeros(){
        List<Integer> listaNova = new ArrayList<>();
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                listaNova.add(n);
            }
        }
        return listaNova;
    }
}
