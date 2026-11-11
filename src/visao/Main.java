package visao;
import modelo.*;

public class Main {
    public static void main(String[] args) {
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

    }
}