package Modelo6;

public class TorreArco extends Torre{
    private int flechas = 1;
    private int taxaDano = 10;

    public TorreArco(String nome, int nivel, int flechas) {
        super(nome, nivel);
        if(flechas >= 1 && flechas <= 5)this.flechas = flechas;
    }

    @Override
    public int calcularDano() {
        return flechas * taxaDano * nivel;
    }
}
