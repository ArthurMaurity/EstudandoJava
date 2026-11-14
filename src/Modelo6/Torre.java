package Modelo6;

public abstract class Torre {
    protected String nome = "torre";
    protected int nivel = 1;

    public Torre(String nome, int nivel) {
        if(nome != null && nome.equals("")) this.nome = nome;
        if( nivel>=1 && nivel<=5) this.nivel = nivel;
    }

    public final void melhorar(){
        if (nivel < 5) nivel++;
    }

    public abstract int calcularDano();

    public void exibirInfos(){
        System.out.println(nome + nivel + calcularDano());
    }
}
