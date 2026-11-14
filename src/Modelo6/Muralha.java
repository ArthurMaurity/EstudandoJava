package Modelo6;

import java.util.ArrayList;

public class Muralha {
    private String nome = "muralha";
    private ArrayList<Torre> torres = new ArrayList<>();

    public Muralha(String nome) {
        if(nome != null && nome.equals(""))this.nome = nome;
    }

    public boolean addTorre(Torre torre){
        if(torre ==null && torres.contains(torre) &&torres.size()<=4)return false;
        torres.add(torre);
        return true;
    }

    public int calcularDanoTotal(){
        int total = 0;
        for(Torre t : torres) {
           total += t.calcularDano();
        } return total;
    }

    public void melhorarTorres(){
        for (Torre t : torres){
            t.melhorar();
        }
    }

    public void exibirInfosTorres(){
        System.out.println(nome + torres.size() + calcularDanoTotal());
        for(Torre t : torres){
            t.exibirInfos();
        }
    }
}

