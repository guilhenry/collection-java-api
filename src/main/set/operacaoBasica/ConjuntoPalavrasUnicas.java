package main.set.operacaoBasica;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> setpalavras;

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "setpalavras=" + setpalavras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(setpalavras, that.setpalavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(setpalavras);
    }

    public ConjuntoPalavrasUnicas() {
        this.setpalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        setpalavras.add(palavra);
    }
    public void removerPalavra(String palavra){
        String palavraPraRemover = null;
        for (String p : setpalavras){
            if (palavra.contains(p)){
                palavraPraRemover = p;
                break;

            }
        }
        setpalavras.remove(palavraPraRemover);
    }
    public void verificarPalavra(String palavra){
        if (setpalavras.contains(palavra)){
            System.out.println(palavra + " esta na lista set");
        }else {
            System.out.println(palavra + " não esta na lista set");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(setpalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("cidade");
        conjuntoPalavrasUnicas.adicionarPalavra("ruasse");
        conjuntoPalavrasUnicas.adicionarPalavra("piscina");
        conjuntoPalavrasUnicas.adicionarPalavra("gui");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("gata");

        conjuntoPalavrasUnicas.removerPalavra("gui");
        conjuntoPalavrasUnicas.verificarPalavra("piscina");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
