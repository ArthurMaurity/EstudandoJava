package visao;
import Modelo8.*;
import modelo.*;
import Modelo2.*;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("rex",3 ,2);
        Cachorro c2 = new Cachorro("thor",9 ,3);
        Gato g1 = new Gato("mimi", 1 ,3);
        Hotel h1 = new Hotel("Hotelzada");

        h1.hospedarPet(g1);
        h1.hospedarPet(c1);
        System.out.println(h1.hospedarPet(c1));
        h1.hospedarPet(c2);
        System.out.println(c2.calcularDiaria());
        System.out.println(g1.calcularDiaria());
        System.out.println(c1.calcularDiaria());
        System.out.println(h1.calcularDiariaTotal());

        System.out.println(c1.tomarBanho());
        System.out.println(c1.tomarBanho());

        h1.exibirHotel();

       /*
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

    Balde b1 = new Balde("");
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