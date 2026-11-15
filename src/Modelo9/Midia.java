package Modelo9;

public abstract class Midia {
    protected String titulo = "midia";
    protected int ano = 2000;

    public Midia(String titulo, int ano) {
        if(titulo != null && !titulo.equals(""))this.titulo = titulo;
        if(ano >= 1900 && ano <= 2026)this.ano = ano;
    }

    public abstract int calcularPreco();

    public final String classificarEra(){
        if (ano<2000){
            return "Classico";
        } else if (ano < 2015) {
            return "moderno";
        }return "recente";
    }

    public void exibirInfos(){
        System.out.println(titulo + "|" +"ano: "+ ano  +  classificarEra()+"|" + "preço " + calcularPreco());
    }
}
