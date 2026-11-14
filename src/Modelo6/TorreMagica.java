package Modelo6;

public class TorreMagica extends Torre implements Recarregavel{
    private int mana = 60;
    private int taxaMagia = 5;

    public TorreMagica(String nome, int nivel, int mana) {
        super(nome, nivel);
        if(mana>=0 && mana <= 100)this.mana = mana;
    }

    @Override
    public int calcularDano() {
        return (mana/taxaMagia) * nivel;
    }

    public boolean recarregar() {
        if(mana >=100) return false;

        if (mana + 25 > 100) {
            mana = 25;
        } mana += 25;
        return true;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(mana);
    }
}
