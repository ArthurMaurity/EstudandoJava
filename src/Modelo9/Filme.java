package Modelo9;

public class Filme extends Midia implements Baixavel {
    private int duracao = 90;
    private boolean baixado;

    public Filme(String titulo, int ano, int duracao) {
        super(titulo, ano);
        if(duracao>=60 && duracao <= 240)this.duracao = duracao;
    }

    @Override
    public boolean baixar() {
        if(baixado)return false;
        baixado = true;
        return true;
    }

    @Override
    public int calcularPreco() {
        return 10 + duracao / 30;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(duracao+" minutos" + "|" + baixado);
    }
}
