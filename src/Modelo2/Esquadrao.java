package Modelo2;

import java.util.ArrayList;

public class Esquadrao {
    private String nome = "esquadrão";
    private ArrayList<Nave> naves = new ArrayList<>();

    public Esquadrao(String nome) {
        if(nome.equals("") || nome != null) this.nome = nome;
    }

    public boolean addNave(Nave nave){
        if (nave == null || naves.contains(nave) ||naves.size() >= 4) return false;
        naves.add(nave);
        return true;
    }

    public int calcularPoderTotal(){
        int total = 0;
        for (Nave n : naves){
            total += n.calcularPoderDeFogo();
        } return total;
    }

    public void sofrerAtaque(int dano){
        for (Nave n : naves){
            n.receberDano(dano);
        }
    }

    public void exibirSquad(){
        System.out.println("nome "+ nome + " qtd naves " + naves.size() + " poder " + calcularPoderTotal());
                for(Nave n :naves){
                    n.exibirInfos();
                }
    }
}
