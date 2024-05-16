package main.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

     private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer>ordenarAscendente(){

        List<Integer>listaAscendete = new ArrayList<>(numerosList);

        if (!numerosList.isEmpty()){
            Collections.sort(listaAscendete);
            return listaAscendete;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer>ordenarDescendente(){
        List<Integer>listdescendente = new ArrayList<>(numerosList);

        if (!numerosList.isEmpty()){
            listdescendente.sort(Collections.reverseOrder());
            return  listdescendente;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }

    }public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(15251);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(665);
        ordenacaoNumeros.adicionarNumero(178);
        ordenacaoNumeros.adicionarNumero(-5);
        ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
