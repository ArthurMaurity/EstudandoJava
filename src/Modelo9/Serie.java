package Modelo9;

public class Serie extends Midia implements Baixavel{
    private int temporadas = 1;
    private boolean baixada;

    public Serie(String titulo, int ano, int temporadas) {
        super(titulo, ano);
        if(temporadas >= 1 && temporadas<=20)this.temporadas = temporadas;
    }

    @Override
    public boolean baixar() {
        if(baixada && temporadas > 10)return false;
        baixada = true;
        return true;
    }

    @Override
    public int calcularPreco() {
        return 15 + temporadas * 5;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("temporadas: "+temporadas+" | "+"baixado: "+ (baixada ));
    }
}
