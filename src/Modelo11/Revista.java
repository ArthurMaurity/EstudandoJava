package Modelo11;

public class Revista extends Item{
    private boolean emprestada;

    public Revista(String titulo, int paginas) {
        super(titulo, paginas);
    }

    @Override
    public int calcularMulta(int diasAtraso) {
        return diasAtraso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Emprestada: " + (emprestada? "sim" : "não"));
    }

    @Override
    public boolean emprestar() {
        if(!emprestada){
            emprestada = true;
            return true;
        }return false;
    }
}
