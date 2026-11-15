package Modelo8;

public final class Gato extends Pet{
    private int brinquedo;

    public Gato(String nome, int idade, int brinquedo) {
        super(nome, idade);
        if(brinquedo >=0 && brinquedo <= 5)this.brinquedo = brinquedo;
    }

    @Override
    public int calcularDiaria() {
        return 35 + (brinquedo * 5);
    }
}
