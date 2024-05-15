package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> listaDeNumeros;

    public SomaDeNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public void calcularSoma(){
        int soma= 0;

        if (!listaDeNumeros.isEmpty()){
            for (Integer i : listaDeNumeros ) {
                soma += i;
            }
            System.out.println("a soma dos numeros da lista é "+ soma);
        }else{
            System.out.println("lista esta vazia");
        }


    }

    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;

        if (!listaDeNumeros.isEmpty()){
            for (Integer i : listaDeNumeros){
                if (i >= maiorNumero){
                    maiorNumero = i;
                }
            }
            System.out.println("o maior numero é "+ maiorNumero);
        }
    }

    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;

        if (!listaDeNumeros.isEmpty()){
            for (Integer i : listaDeNumeros){
                if (i <= menorNumero){
                    menorNumero = i;
                }
            }
            System.out.println("o menor numero é "+ menorNumero);
        }
    }

    public void exibirNumeros(){
        System.out.println(listaDeNumeros);
    }

    public static void main(String[] args) {
       SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumero(552);
        somaDeNumeros.adicionarNumero(4);
        somaDeNumeros.adicionarNumero(99);
        somaDeNumeros.adicionarNumero(1000);
        somaDeNumeros.adicionarNumero(52);
        somaDeNumeros.exibirNumeros();
        somaDeNumeros.calcularSoma();
        somaDeNumeros.encontrarMaiorNumero();
        somaDeNumeros.encontrarMenorNumero();
    }
}
