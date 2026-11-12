package Modelo3;

public class PocaoMagia extends Pocao{
    private int cargasEncantadas= 1;

    public PocaoMagia(String nome, int volumeMl, int cargasEncantadas) {
        super(nome, volumeMl);
        if(cargasEncantadas >=0 && cargasEncantadas <=3)this.cargasEncantadas = cargasEncantadas;
    }

    @Override
    public int calcularPreco() {
        return cargasEncantadas * 20 + volumeMl * 3;
    }

    @Override
    public void exibirInfos(){
        super.exibirInfos();
        System.out.print(cargasEncantadas);
    }
}
