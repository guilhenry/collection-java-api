package main.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);

    }

    public void removerPalavra(String palavra){
        if(!contagemMap.isEmpty()){
            contagemMap.remove(palavra);

        }else{
            System.out.println("Lista map esta vazia.");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemMap);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
        int maiorContagem = 0;
        Map.Entry<String, Integer> palavraFrequente = null;

        if (!contagemMap.isEmpty()){
            for (Map.Entry<String, Integer> p : contagemMap.entrySet()){
                if (p.getValue() > maiorContagem){
                    maiorContagem = p.getValue();
                    palavraFrequente = p;
                }
            }

        }
        return palavraFrequente;
    }






    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("rua", 3);
        contagemPalavras.adicionarPalavra("casa", 1);
        contagemPalavras.adicionarPalavra("nada", 30);
        contagemPalavras.adicionarPalavra("cao", 5);

        contagemPalavras.removerPalavra("nada");

       contagemPalavras.exibirContagemPalavras();
        System.out.println( contagemPalavras.encontrarPalavraMaisFrequente());

    }
}
