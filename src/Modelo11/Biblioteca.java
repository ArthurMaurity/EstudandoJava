package Modelo11;

import java.util.ArrayList;

public class Biblioteca {
    private String nome = "Biblioteca";
    private ArrayList<Item> itens = new ArrayList<>();

    public Biblioteca(String nome) {
        if(nome != null && !nome.equals(""))this.nome = nome;
    }

    public boolean addItem(Item item){
        if(item!= null && !itens.contains(item) && itens.size()<8){
            itens.add(item);
            return true;
        }return false;
    }

    public int calcularMultaTotal(int diasDeAtraso){
        int total = 0;
        for(Item i : itens){
            total += i.calcularMulta(diasDeAtraso);
        } return total;
    }

    public void exibirBiblioteca(){
        System.out.println(nome + " | Itens:" + itens.size() + "/8");
        for (Item i : itens){
            i.exibirInformacoes();
        }
    }

}
