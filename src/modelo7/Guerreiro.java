package modelo7;

public final class Guerreiro extends Heroi{
    private int armadura = 10;

    public Guerreiro(String nome, int vida, int armadura) {
        super(nome, vida);
        if(armadura>=0 && armadura<=50)this.armadura = armadura;
    }

    @Override
    public int calcularForca() {
        return armadura * 3 + 20;
    }
}
