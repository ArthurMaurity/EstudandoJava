package Modelo11;

public final class Livro extends Item{
    private int exemplares = 1;

    public Livro(String titulo, int paginas, int exemplares) {
        super(titulo, paginas);
        if(exemplares>=1 && exemplares<=50)this.exemplares = exemplares;
    }

    @Override
    public int calcularMulta(int diasAtraso) {
        return diasAtraso * 2;
    }

    @Override
    public boolean emprestar() {
        if(exemplares >0 ) {
            exemplares--;
            return true;
        }return false;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Exemplares: "+exemplares);
    }
}
