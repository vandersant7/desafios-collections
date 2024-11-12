package com.vandersant.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa  listaTarefa = new ListaTarefa();

        System.out.println("O tamanho da lista de tarefas é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O tamanho da lista de tarefas é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefas("Tarefa 1");

        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefa();
    }
}