package Modelo3;

public abstract class Pocao implements Vendavel{
    protected String nome = "poção";
    protected int volumeMl = 100;

    public Pocao(String nome, int volumeMl) {
        if(!nome.equals("") || nome != null)this.nome = nome;
        if(volumeMl > 0 )this.volumeMl = volumeMl;
    }

    public abstract int calcularPreco();

    public final String classificarTamanho(){
        if(volumeMl <= 150){
            return "pequena";
        } else if (volumeMl <= 300) {
            return "media";
        } else return "grande";
    }

    public void exibirInfos(){
        System.out.println( nome + volumeMl + classificarTamanho() + calcularPreco());
    }

}
