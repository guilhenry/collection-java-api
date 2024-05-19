package main.set.pesquisa;

public class Tarefa {
    private String descricaoTarefa;
    private boolean concluidas;


    public Tarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
        this.concluidas = false;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }


    public boolean isConcluidas() {
        return concluidas;
    }



    public void setConcluidas(boolean concluidas) {
        this.concluidas = concluidas;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricaoTarefa='" + descricaoTarefa + '\'' +
                ", concluidas=" + concluidas +
                '}';
    }
}
