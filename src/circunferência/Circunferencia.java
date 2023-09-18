package circunferência;
public class Circunferencia {

    public double raio;
    public String corDaLinha;
    public String corDoPreenchimento;
    public Pontos centro;

    public Circunferencia(double raio, String corDaLinha) {
        this.raio = raio;
        this.centro = centro;
    }

    public Circunferencia(double raio, String corDaLinha, Pontos centro) {
        this.raio = raio;
        this.centro = centro;
        this.corDaLinha = corDaLinha;
        this.centro = centro;
    }

    public Circunferencia(double raio, String corDaLinha, Pontos centro, String corDoPreenchimento) {
        this.raio = raio;
        this.centro = centro;
        this.corDaLinha = corDaLinha;
        this.centro = centro;
        this.corDoPreenchimento = corDoPreenchimento;
    }

    public double area (double raio) {
        double area = 3.14 * (raio * raio);
        return area;
    }

    public double perimetro (double raio) {
        double comprimento = (2*3.14*raio);
        return comprimento;
    }

    public void imprimirDados() {
        System.out.println(raio);
        System.out.println(corDaLinha);
        System.out.println(corDoPreenchimento);
        System.out.println(area(raio));
        System.out.println(perimetro(raio));
    }


}
