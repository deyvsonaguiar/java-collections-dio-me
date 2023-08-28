package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item item: listaItens) {
            if(item.getNome().equals(nome)) {
                itensParaRemover.add(item);
            }
        }
        listaItens.removeAll(itensParaRemover);

    }

    public Double calcularValorTotal() {
        double total = 0.0;
        if(!listaItens.isEmpty()) {
            for(Item item: listaItens) {
                double subtotal = item.getPreco() * item.getQuantidade();
                total += subtotal;
            }
            return total;
        } else {
            throw new RuntimeException("O carrinho está vazio!");
        }
    }

    public void exibirItens() {
        if(!listaItens.isEmpty()) {
            System.out.println(getListaItens());
        } else {
            throw new RuntimeException("O carrinho está vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Lápis", 2.0, 2);
        carrinho.adicionarItem("Caneta", 3.5, 2);
        carrinho.adicionarItem("Lapiseira", 1.5, 1);
        carrinho.adicionarItem("Caderno", 14.75, 1);

        carrinho.exibirItens();

        System.out.println("O valor total é: R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("Lápis");

        System.out.println("O valor total é: R$" + carrinho.calcularValorTotal());


    }


}
