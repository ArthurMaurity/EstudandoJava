package Modelo5;

public class Galinha extends Animal{
    private int qtdOvo = 5;

    public Galinha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int produzir() {
        return qtdOvo;
    }
}
