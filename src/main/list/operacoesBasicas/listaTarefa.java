package main.list.operacoesBasicas;

import javax.lang.model.util.SimpleElementVisitor14;
import java.util.ArrayList;
import java.util.List;

public class listaTarefa {

    private List<Tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descicao){
        tarefaList.add(new Tarefa(descicao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa>tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public  int obterNumerosDeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        listaTarefa listaTarefa = new listaTarefa();
        listaTarefa.adicionarTarefas("Tarefa1");
        listaTarefa.adicionarTarefas("Tarefa1");
        listaTarefa.adicionarTarefas("Tarefa2");
        System.out.println("o numero total de elemneto na lista é: "+ listaTarefa.obterNumerosDeTarefas());
        listaTarefa.removerTarefa("Tarefa1");
        listaTarefa.obterDescricoesTarefas();
    }
}
