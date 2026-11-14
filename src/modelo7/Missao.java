package modelo7;

import java.util.ArrayList;

public class Missao implements Recompensavel{
    private int dificuldade = 1;
    private ArrayList<Heroi> herois = new ArrayList<>();

    public Missao(int dificuldade) {
        if(dificuldade>=1 && dificuldade<=5)this.dificuldade = dificuldade;
    }

    public boolean addHero(Heroi heroi){
        if(heroi == null && herois.contains(heroi)&& herois.size() >=3) return false;

        herois.add(heroi);
        return true;
    }

    public int calcularForca(){
        int total =0;

        for(Heroi h : herois){
            total+=h.calcularForca();
        } return total;
    }

    @Override
    public int calcularRecompensa() {
        int totalMoedas=0;
        for (Heroi h : herois ){
            totalMoedas+=20;
            if (h.ehForte()){
                totalMoedas+= 10;
            }
        }return totalMoedas * dificuldade;
    }

    public void exibirMissao(){
        System.out.println(dificuldade+ herois.size());
        for(Heroi h :herois){
            h.exibirInfos();
        }
    }
}
