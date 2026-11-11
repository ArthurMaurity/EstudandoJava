package modelo;

public abstract class Peixe implements Vendavel{
    protected String nome = "Peixe";
    protected float peso = 1;

    public Peixe(String nome, float peso) {
       if(nome != null && !nome.equals("")) this.nome = nome;
       if(peso > 0) this.peso = peso;
    }

    public abstract int calcularPreco();

    public final String classificarTamanho(){
        if (peso > 0 && peso < 2 ) return "pequeno";
        if (peso > 2 && peso < 10) return "medio";
        if (peso >= 10) return "grande";
        else return "invalido";
    }

    public void exibirInfos() {
        System.out.println( "Peixe{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}' + "tamanho = "+ classificarTamanho() + "preço=  " +calcularPreco());
    }
}
