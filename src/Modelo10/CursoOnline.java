package Modelo10;

public class CursoOnline extends Curso implements Certificavel {
    private boolean certificadoEmitido;
    private int valorBaseOnline = 60; //vai que tem uma alteração

    public CursoOnline(String nome, int horas) {
        super(nome, horas);
    }

    @Override
    public boolean emitirCertificado() {
        if(!certificadoEmitido && horas >= 40){
            certificadoEmitido = true;
            return true;
        }return false;
    }

    @Override
    public int calcularMensalidade() {
        return valorBaseOnline + horas;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Certificado: " + (certificadoEmitido ? "emitido" : "pendente"));
    }

}
