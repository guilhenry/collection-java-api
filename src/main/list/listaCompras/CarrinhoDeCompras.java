package main.list.listaCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quant){
        Item item= new Item(nome, preco, quant);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item>remomerItem = new ArrayList<>();

        if (!itemList.isEmpty()){
            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    remomerItem.add(i);
                }
            }
            itemList.removeAll(remomerItem);
        }
    }
    public void calcularValorTotal(){
        double valorTotal = 0d;

        if (!itemList.isEmpty()){
            for (Item i : itemList){
                valorTotal += i.getPreco() * i.getQuant();
            }
        }
        System.out.println("O valor total de produtos são R$ "+ valorTotal);
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras =new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("cenora",5.0, 3);
        carrinhoDeCompras.adicionarItem("acerola",3.0, 5);
        carrinhoDeCompras.adicionarItem("doritos",10.0,1);
        carrinhoDeCompras.adicionarItem("milho",10,2);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("milho");
        carrinhoDeCompras.exibirItens();
    }
}
