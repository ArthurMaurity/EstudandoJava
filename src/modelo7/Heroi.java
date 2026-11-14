package modelo7;

public abstract class Heroi {
    protected String nome = "heroi";
    protected int vida = 100;

    public Heroi(String nome, int vida) {
        if(nome != null && !nome.equals("")) this.nome = nome;
        if(vida >= 1 && vida <= 200)this.vida = vida;
    }

    public abstract int calcularForca();

    public final boolean ehForte(){
        if(calcularForca() >= 80 ) {
            return true;
        }return false;
    }

    public void exibirInfos(){
        System.out.println(nome + vida + calcularForca() + ehForte());
    }
}
