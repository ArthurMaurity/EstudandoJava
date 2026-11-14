package Modelo5;

public abstract class Animal implements Produtor {
    protected String nome ="animal";
    protected int idade = 1;

    public Animal(String nome, int idade) {
        if (nome != null && nome.equals(""))this.nome = nome;
        if (idade > 0)this.idade = idade;
    }

    public abstract int produzir();

    public final String classificarFase(){
        if (idade<=6){
            return "filhote";
        } else if (idade<= 36) {
            return "adulto";
        }else return "idoso";
    }

    public void exibirInfos() {
        System.out.println( "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + classificarFase()+
                '}');
    }
}
