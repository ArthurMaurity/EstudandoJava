package Modelo8;

public abstract class Pet {
    protected String nome = "pet";
    protected int idade = 1;

    public Pet(String nome, int idade) {
        if(nome != null && nome.equals(""))this.nome = nome;
        if(idade >= 0 && idade <=30)this.idade = idade;
    }

    public abstract int calcularDiaria();

    public final String classificarFase(){
        if (idade<=2) {
            return "Filhote";
        } else if (idade<=8) {
            return "adulto";
        } return "idoso";

    }

    public void exibirInformacoes(){
        System.out.println(nome + idade + "/" + calcularDiaria() + classificarFase() );
    }


}
