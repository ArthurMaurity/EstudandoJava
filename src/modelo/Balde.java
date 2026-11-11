package modelo;

import java.util.ArrayList;

public class Balde {
    private String dono = "Pescador";
    private ArrayList<Peixe> peixes = new ArrayList<>();

    public Balde(String dono) {
       if (dono != null && !dono.equals("")) this.dono = dono;
    }

    public boolean guardarPeixe(Peixe peixe){
        if(peixe == null|| peixes.contains(peixe)||peixes.size()>5) return false;
        peixes.add(peixe);
        return true;
    }

    public int calcularValorTotal(){
        int total = 0;
        for(Peixe p : peixes){
            total += p.calcularPreco();
        }
        return total;
    }

    public void exibirPeixes(){
        System.out.println("O balde de: "+dono+" Tem: "+peixes.size()+" peixes");
        for (Peixe p : peixes){
            p.exibirInfos();
        }
        System.out.println("seu balde vale "+calcularValorTotal());
    }
}
