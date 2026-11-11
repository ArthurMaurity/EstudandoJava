package modelo;

public class PeixeRaro extends Peixe {
    private int raridade = 1;
    private int valorPeixeRaro = 50;

    public PeixeRaro(String nome, float peso, int raridade) {
        super(nome, peso);
        if (raridade >= 1 && raridade <= 5) this.raridade = raridade;
    }

    @Override
    public int calcularPreco() {
        return (int) (peso * valorPeixeRaro*raridade);
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.printf("Peixe raro! " + raridade +" estrelas!");
    }
}
