package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listaParaRemover = new ArrayList<>();

        for(Tarefa tarefa: tarefaList) {
            if(tarefa.getDescricao().equals(descricao)) {
                listaParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(listaParaRemover);
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("O número de tarefas é: " + tarefaList.size());
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefa = new ListaTarefas();
        listaTarefa.obterNumeroTotalTarefas();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.obterNumeroTotalTarefas();

        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.obterNumeroTotalTarefas();

        listaTarefa.obterDescricoesTarefas();

    }
}
