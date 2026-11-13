package Modelo4;

public class Pizza extends Prato{
    private int fatias = 8;
    private int valorFatia = 5;

    public Pizza(String nome, int tempoPreparo, int fatias) {
        super(nome, tempoPreparo);
        if(fatias>=4 && fatias<= 12) this.fatias = fatias;
    }

    @Override
    public int calcularPreco() {
        return fatias * valorFatia;
    }
}
