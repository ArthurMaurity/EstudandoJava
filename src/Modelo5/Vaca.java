package Modelo5;

public class Vaca extends Animal{
    private int litros = 1;
    private int taxaLitro = 3;

    public Vaca(String nome, int idade, int litros) {
        super(nome, idade);
        if(litros >=1 && litros <= 30)this.litros = litros;
    }

    @Override
    public int produzir() {
        return litros * taxaLitro;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println(litros);
    }
}
