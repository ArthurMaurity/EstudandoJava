package Modelo3;

public final class PocaoCura extends Pocao{
    private int ervasRaras = 1;
    private int valorErvas = 2;

    public PocaoCura(String nome, int volumeMl, int ervasRaras) {
        super(nome, volumeMl);
        if(ervasRaras>=0 && ervasRaras<=5) this.ervasRaras = ervasRaras;
    }

    @Override
    public int calcularPreco() {
        return volumeMl * ervasRaras * valorErvas;
    }
}
