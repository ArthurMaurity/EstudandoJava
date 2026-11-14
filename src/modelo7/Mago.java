package modelo7;

public class Mago extends Heroi{
    private int poderMagico=1;

    public Mago(String nome, int vida, int poderMagico) {
        super(nome, vida);
        if(poderMagico>=1 && poderMagico<=10)this.poderMagico = poderMagico;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(poderMagico);
    }

    @Override
    public int calcularForca() {
        return poderMagico * 12;
    }
}
