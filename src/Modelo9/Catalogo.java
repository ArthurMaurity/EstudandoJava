package Modelo9;

import java.util.ArrayList;

public class Catalogo {
    private String nome = "catalogo";
    private ArrayList<Midia> midias= new ArrayList<>();

    public Catalogo(String nome) {
        if(nome != null && !nome.equals("")) this.nome = nome;
    }

    public boolean addMidia(Midia midia){
        if(midia == null || midias.contains(midia)||midias.size() >= 5)return false;

        midias.add(midia);
        return true;
    }

    public int calcularValorTotal(){
        int total = 0;

        for (Midia m : midias){
            total += m.calcularPreco();
        } return total;
    }

    public void exibirCatalogo(){
        System.out.println(nome + midias.size() + calcularValorTotal());
        for (Midia m : midias){
            m.exibirInfos();
        }
    }
}
