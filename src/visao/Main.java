package visao;
import modelo.*;
import Modelo2.*;

public class Main {
    public static void main(String[] args) {
        Esquadrao e1 = new Esquadrao("ADR");
        NaveCaca nc = new NaveCaca("Rezende",3);
        NaveCaca nc1 = new NaveCaca("Taspio",2);
        NaveSup ns = new NaveSup("virginia",0);
        Reparavel r = ns;

        e1.exibirSquad();

        e1.addNave(nc1);
        e1.addNave(nc);
        e1.addNave(ns);

        e1.exibirSquad();
        e1.sofrerAtaque(70);
        e1.exibirSquad();
        ns.reparar();
        r.reparar();
        r.reparar();
        e1.exibirSquad();
        r.reparar();
        e1.exibirSquad();


   /* Balde b1 = new Balde("");
    PeixeComum pc = new PeixeComum("Tilapia",1.5f);
    PeixeRaro pr = new PeixeRaro("Dourado", 12,3);
    PeixeComum pc2 = new PeixeComum("Tucunare",4);
    Vendavel v =pc2;

    v.calcularPreco();
    b1.exibirPeixes();
    b1.guardarPeixe(pc);
    b1.guardarPeixe(pc2);
    b1.guardarPeixe(pr);
    b1.exibirPeixes();
    b1.calcularValorTotal();
    b1.exibirPeixes();
    v.calcularPreco();
*/
    }
}