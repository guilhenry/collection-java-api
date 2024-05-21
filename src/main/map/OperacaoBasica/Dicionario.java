package main.map.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Dicionario{" +
                "dicionarioMap=" + dicionarioMap +
                '}';
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisarPalavra = dicionarioMap.get(palavra);
            if (pesquisarPalavra == null) {
                System.out.println("Contato não encontrado na agenda.");

            }
        } else {
                System.out.println("A agenda de contatos está vazia.");
            }
        return pesquisarPalavra;

    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("casa", "lugar onde alguem mora");
        dicionario.adicionarPalavra("piscina", "lugar onde alguem nada");
        dicionario.adicionarPalavra("cachorro", "animal que late");
        dicionario.adicionarPalavra("maça", "fruta");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("maça");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("piscina"));

    }
}
