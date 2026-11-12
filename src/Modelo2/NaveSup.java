package Modelo2;

public class NaveSup extends Nave implements Reparavel {
    private int kitReparo = 3;
    private int valorDano = 10;
    private int fatorCura = 30;

    public NaveSup(String nome,int canhoes) {
        super(nome,canhoes);
        if(kitReparo >= 0 && kitReparo <= 3) this.kitReparo = kitReparo;
    }

    @Override
    public int calcularPoderDeFogo() {
        return valorDano;
    }

    public boolean reparar(){
        if (kitReparo == 0) return false;
        escudo += fatorCura;
        if (escudo > vidaMaxima) {
            escudo = vidaMaxima;
            return true;
        }
        kitReparo--;
        return true;
    }

    public void exibirInfo() {
        System.out.println( "NaveSup{" +
                "nome='" + nome + '\'' +
                ", escudo=" + escudo +
                ", kitReparo=" + kitReparo +
                '}');
    }
}
