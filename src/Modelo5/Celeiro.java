package Modelo5;

import java.util.ArrayList;

public class Celeiro {
    private String dono = "fazendeiro";
    private ArrayList<Animal> animais = new ArrayList<>();

    public Celeiro(String dono) {
        if (dono != null && dono.equals("")) this.dono = dono;
    }

    public boolean guardarAnimal(Animal animal){
        if(animal != null && animais.contains(animal) && animais.size()<= 5){
            animais.add(animal);
            return true;
        }return false;
    }

    public int calcularProduçaoTotal(){
        int total = 0;
        for (Animal a : animais) {
            total += a.produzir();
        } return total;
    }

    public void exibirAnimais(){
        System.out.println(dono + animais.size());
        for(Animal a : animais){
            a.exibirInfos();
        }
    }

}
