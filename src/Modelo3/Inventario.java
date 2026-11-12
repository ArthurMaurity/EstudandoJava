package Modelo3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventario {
    private String alquimista = "rezendeEvil";
    private ArrayList<Pocao> pocoes = new ArrayList<>();

    public Inventario(String alquimista) {
        if(!alquimista.equals("") && alquimista != null)this.alquimista = alquimista;
    }

    public boolean addPocao(Pocao pocao){
        if(pocao == null || pocoes.contains(pocao)||pocoes.size()>=4) return false;
        pocoes.add(pocao);
        return true;
    }

    public int calcularValorTotal(){
        int valor = 0;
        for (Pocao p : pocoes){
            valor += p.calcularPreco();
        } return valor;
    }

    public void exibirInv(){
        System.out.println( alquimista + pocoes.size());
        for (Pocao p : pocoes)p.exibirInfos();
        System.out.println(calcularValorTotal());
    }
}
