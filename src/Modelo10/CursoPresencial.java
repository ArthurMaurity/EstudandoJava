package Modelo10;

public final class CursoPresencial extends Curso {
    private int vagas = 10;
    private int matriculados;
    private int valorBasePresencial = 100; //vai que tem uma alteração

    public CursoPresencial(String nome, int horas, int vagas) {
        super(nome, horas);
        if(vagas>=5 && vagas <=30)this.vagas = vagas;
    }

    public boolean matricularAluno(){
        if (vagas > matriculados){
            matriculados++;
            return true;
        }return false;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Vagas: " + vagas + "|" + "Matriculados" + matriculados);
    }

    @Override
    public int calcularMensalidade() {
        return valorBasePresencial + horas * 2;
    }
}
