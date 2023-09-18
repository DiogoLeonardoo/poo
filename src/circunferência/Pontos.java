package circunferência;
public class Pontos {
    
    public double x;
    public double y;
    public String cor;

    public  Pontos (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  Pontos (double x, double y, String cor) {
        this.x = x;
        this.y = y; 
        this.cor = cor;  
    }

    public void alterarCor (String cor) {
        this.cor = cor; 
    }

    public void imprimirDados() {
        System.out.println(cor);
        System.out.println(x);
        System.out.println(y);
    }
}
