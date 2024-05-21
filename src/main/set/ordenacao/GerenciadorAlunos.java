package main.set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){

        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
               if (a.getMatricula() == matricula){
                   alunoSet.remove(a);
                   break;
               }
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> AlunoPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()){
            AlunoPorNome.addAll(alunoSet);
            return AlunoPorNome;
        }else {
            throw new RuntimeException("o conjunto esta vazio!");
        }
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> AlunoPorNota = new TreeSet<>(new ExibirNota());
        if (!alunoSet.isEmpty()){
            AlunoPorNota.addAll(alunoSet);
            return AlunoPorNota;
        }else {
            throw new RuntimeException("o conjunto esta vazio!");
        }
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("guilherme", 1156L, 25.0);
        gerenciadorAlunos.adicionarAluno("antonio", 956L, 98.0);
        gerenciadorAlunos.adicionarAluno("gab", 364L, 60.0);
        gerenciadorAlunos.adicionarAluno("antoni", 45L, 45.0);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        gerenciadorAlunos.removerAluno(364L);
        gerenciadorAlunos.exibirAlunos();
    }
}
