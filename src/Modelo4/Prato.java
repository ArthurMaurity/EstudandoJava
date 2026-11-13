package Modelo4;

public abstract class Prato {
    protected String nome = "Prato";
    protected int tempoPreparo = 15;

    public Prato(String nome, int tempoPreparo) {
        if(nome.equals("") && nome != null)this.nome = nome;
        if(tempoPreparo>=1 && tempoPreparo <=60)this.tempoPreparo = tempoPreparo;
    }

    public abstract int calcularPreco();

    public final boolean ehRapido(){
        if (tempoPreparo <= 15 ) return true;
        return false;
    }

    public void exibirInfos(){
        System.out.println(nome + tempoPreparo + calcularPreco() + ehRapido());
    }
}
