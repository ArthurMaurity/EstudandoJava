package Modelo10;

import java.util.concurrent.RecursiveTask;

public abstract class Curso {
    protected String nome = "Curso";
    protected int horas  = 40;

    public Curso(String nome, int horas) {
        if(nome != null && !nome.equals(""))this.nome = nome;
        if(horas>=20 && horas<=200)this.horas = horas;
    }

    public abstract int calcularMensalidade();

    public final String classificarNivel(){
        if(horas < 60){
            return "Basico";
        } else if (horas <120) {
            return "Intermediario";
        }  return "Avançado";
    }

    public void exibirInfos(){
        System.out.println(nome + " | "+horas +" (" +classificarNivel()+ ") | " + "Mensalidade: R$"+calcularMensalidade());
    }
}
