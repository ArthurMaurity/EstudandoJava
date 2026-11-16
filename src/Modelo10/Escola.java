package Modelo10;

import java.util.ArrayList;

public class Escola {
    private String nome = "escola";
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Escola(String nome) {
        if(nome != null && !nome.equals(""))this.nome = nome;
    }

    public boolean addCurso(Curso curso){
        if(curso != null && !cursos.contains(curso) && cursos.size() < 6){
            cursos.add(curso);
            return true;
        }return false;
    }

    public int calcularMensalidadeTotal(){
        int total = 0;
        for (Curso c : cursos){
            total += c.calcularMensalidade();
        }return total;
    }

    public void exibirEscola(){
        System.out.println(nome + " | " + "Cursos" + cursos.size() + "/6" + " | " + "Mensalidade total: R$" +calcularMensalidadeTotal());
        for (Curso c : cursos){
            c.exibirInfos();
        }
    }

}
