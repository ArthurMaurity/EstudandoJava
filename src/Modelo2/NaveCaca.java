package Modelo2;

public final class NaveCaca extends Nave{
    private int canhoes = 1;
    private int poderCanhao = 25;

    public NaveCaca(String nome, int canhoes) {
        super(nome, canhoes);
       if(canhoes >= 1 && canhoes <= 4) this.canhoes = canhoes;
    }

    @Override
    public int calcularPoderDeFogo() {
        return canhoes * poderCanhao;
    }
}
