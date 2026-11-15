package Modelo8;

public class Cachorro extends Pet implements Banhavel{
    private int porte = 1;
    private boolean banhoTomado;


    public Cachorro(String nome, int idade, int porte) {
        super(nome, idade);
        if(porte >= 1 && porte <= 3)this.porte = porte;
    }

    @Override
    public int calcularDiaria() {
        return 40 + (porte*20);
    }

    public boolean tomarBanho(){
        if(banhoTomado) return false;

        banhoTomado = true;
        return true;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("porte " + porte + "tomou banho? " + banhoTomado);
    }
}
