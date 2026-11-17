package Modelo11;

public abstract class Item implements Emprestavel {
    protected String titulo = "Item";
    protected int paginas = 100;

    public Item(String titulo, int paginas) {
        if(titulo != null && !titulo.equals(""))this.titulo = titulo;
        if(paginas>=10 && paginas <=2000)this.paginas = paginas;
    }

    public abstract int calcularMulta(int diasAtraso);

    public final String classificarTamanho(){
        if (paginas<100){
            return "Curto";
        } else if (paginas<500) {
            return "Medio";
        } return "Longo";
    }

    public void exibirInformacoes(){
        System.out.println(titulo + " | " + paginas + " págs (" + classificarTamanho() +")");
    }
}
