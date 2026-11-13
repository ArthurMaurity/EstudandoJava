package Modelo4;

public class Sobremesa extends Prato{
    private boolean comCalda;
    private int valorCalda = 20;
    private int valorSemCalda = 15;

    public Sobremesa(String nome, int tempoPreparo, boolean comCalda) {
        super(nome, tempoPreparo);
        this.comCalda = comCalda;
    }

    @Override
    public int calcularPreco() {
        if (comCalda) {
            return valorCalda;
        } return valorSemCalda;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(comCalda ? "sim" : "nao");
    }
}
