package visao;
import Modelo10.CursoOnline;
import Modelo10.CursoPresencial;
import Modelo10.Escola;
import Modelo8.*;
import modelo.*;
import Modelo2.*;

public class Main {
    public static void main(String[] args) {
        CursoOnline cO = new CursoOnline("Ingles", 80);
        CursoPresencial cP = new CursoPresencial("Espanhol", 100 , 0);
        CursoPresencial cP2 = new CursoPresencial("Alemão" , 30 , 5);
        CursoPresencial cP3 = new CursoPresencial("Alemão1" , 130 , 50);
        CursoOnline c1 = new CursoOnline("Ingles2", 180);
        CursoOnline c2 = new CursoOnline("Espanhol2", 20);
        CursoOnline c3 = new CursoOnline("Ingles3", 150);
        Escola e1 = new Escola("INSP");

        e1.addCurso(cO);
        System.out.println(e1.addCurso(cO));
        e1.addCurso(cP);
        e1.addCurso(cP2);
        System.out.println(e1.calcularMensalidadeTotal());
        e1.addCurso(cP3);
        e1.addCurso(c1);
        e1.addCurso(c2);
        System.out.println(e1.addCurso(c3));
        System.out.println(e1.calcularMensalidadeTotal());
        System.out.println(cO.emitirCertificado());
        System.out.println(cO.emitirCertificado());
        System.out.println(c2.emitirCertificado());

        e1.exibirEscola();
        e1.calcularMensalidadeTotal();








        /*Cachorro c1 = new Cachorro("rex",3 ,2);
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