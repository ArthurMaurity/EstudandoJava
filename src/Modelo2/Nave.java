package Modelo2;

public abstract class Nave {
    protected String nome = "Nave";
    protected int escudo = 100;
    protected int vidaMaxima = 100;

    public Nave(String nome, int canhoes) {
        if(nome.equals("") || nome != null) this.nome = nome;
        if (escudo >=0 && escudo <= 100) this.escudo = escudo;
    }

    public abstract int calcularPoderDeFogo();

    public final void receberDano(int dano){
        if (dano < 0 || dano > escudo) return;
        escudo -= dano;
    }

    public void exibirInfos() {
        System.out.println( "Nave{" +
                "nome='" + nome + '\'' +
                ", escudo=" + escudo +
                '}'+ calcularPoderDeFogo());
    }


}
