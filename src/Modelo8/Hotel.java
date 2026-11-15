package Modelo8;

import java.util.ArrayList;

public class Hotel {
    private String nome = "hotel";
    private ArrayList<Pet> pets = new ArrayList<>();

    public Hotel(String nome) {
        if(nome != null && nome.equals(""))this.nome = nome;
    }

    public boolean hospedarPet(Pet pet){
        if(pet == null || pets.contains(pet) || pets.size()>=4) return false;

        pets.add(pet);
        return true;
    }

    public int calcularDiariaTotal(){
        int total = 0;
        for(Pet p : pets){
            total += p.calcularDiaria();
        }return total;
    }

    public void exibirHotel(){
        System.out.println(nome + pets.size() + "/4" + calcularDiariaTotal());
        for (Pet p : pets){
            p.exibirInformacoes();
        }
    }
}

