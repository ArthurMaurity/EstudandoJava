package Modelo4;

import java.util.ArrayList;

public class Pedido implements Pontuavel{
    private int mesa = 1;
    private ArrayList<Prato> pratos = new ArrayList<>();
    private int pontoPrato = 10;


    public Pedido(int mesa) {
        if(mesa >= 1 && mesa <= 20) this.mesa = mesa;
    }

    @Override
    public int calcularPontos() {
        int totalPontos = 0;
        for(Prato p : pratos){
            if (p.ehRapido()){
                totalPontos += pontoPrato+ 5;
            } totalPontos += pontoPrato;

        }return totalPontos;
    }

    public boolean addPrato(Prato prato){
        if (prato == null || pratos.contains(prato) || pratos.size() > 5) return false;

        pratos.add(prato);
        return true;

    }

    public int calcularTotal(){
        int total = 0;
        for (Prato p : pratos){
            total += p.calcularPreco();
        } return total;
    }

    public void exibirPedido(){
        System.out.println(mesa + pratos.size() + calcularPontos()+ calcularTotal());
        for (Prato p : pratos){
            p.exibirInfos();
            }
        }

}
