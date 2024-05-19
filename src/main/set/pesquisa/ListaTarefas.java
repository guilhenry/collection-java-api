package main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa>setTarefa;

    public ListaTarefas() {
        this.setTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        setTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if (!setTarefa.isEmpty()){
            setTarefa.removeIf(t -> t.getDescricaoTarefa().equalsIgnoreCase(descricao));
        }else {
            System.out.println("A lista esta vazia");
        }
    }
    public void exibirTarefas(){
        System.out.println(setTarefa);
    }
    public int contarTarefas(){
        return setTarefa.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa>tarefasFeitas = new HashSet<>();

        if (!setTarefa.isEmpty()){
            for (Tarefa t : setTarefa){
                if (t.isConcluidas()){
                    tarefasFeitas.add(t);
                }
            }
        }
        return tarefasFeitas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa>tarefasFeitas = new HashSet<>();

        if (!setTarefa.isEmpty()){
            for (Tarefa t : setTarefa){
                if (!t.isConcluidas()){
                    tarefasFeitas.add(t);
                }
            }

        }
        return tarefasFeitas;
    }

    public void marcarTarefaConcluida(String descricao){

        if (!setTarefa.isEmpty()){
            for (Tarefa t : setTarefa){
                if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                    t.setConcluidas(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        Tarefa tarefaMarcadaPendente = null;
        for (Tarefa t : setTarefa){
            if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                tarefaMarcadaPendente = t;
                break;
            }
        }

        if (tarefaMarcadaPendente != null){
            if (tarefaMarcadaPendente.isConcluidas()){
                tarefaMarcadaPendente.setConcluidas(false);
            }
        }
        else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
       setTarefa.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("teste");
        listaTarefas.adicionarTarefa("teste1");
        listaTarefas.adicionarTarefa("teste2");
        listaTarefas.adicionarTarefa("teste3");
        listaTarefas.adicionarTarefa("teste4");
        listaTarefas.adicionarTarefa("teste5");

        listaTarefas.marcarTarefaConcluida("teste3");
        listaTarefas.obterTarefasPendentes();
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());



        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
