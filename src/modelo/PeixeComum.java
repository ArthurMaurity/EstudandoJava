package modelo;

public final class  PeixeComum extends Peixe {
    private int valorPeixeComum = 10;

    public PeixeComum(String nome, float peso) {
        super(nome, peso);
    }

    @Override
    public int calcularPreco() {
        return (int) (peso * valorPeixeComum);
    }
}
