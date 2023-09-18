package vacas;
import java.util.Scanner;
public class vaca {
    static Scanner scanner = new Scanner(System.in);

    public int id; 
    public String raça;
    public String cor;
    public int tamanho;
    public int idade;
    public double peso;
    public int registro;
    static int gerador = 0;
    

    
    public vaca(String raca, String cor, int tamanho, int idade, double peso) {
        this.raça = raça;
        this.cor = cor;
        this.tamanho = tamanho;
        this.idade = idade;
        this.peso = peso;
        gerador ++;
        this.registro = gerador;
    }

    public String adicionarInfos() {
       
        System.out.println("Qual é a raça da vaca?");
        String raca = scanner.nextLine();

        System.out.println("Qual é o tamanho da vaca?");
        double tamanho = scanner.nextDouble();
        scanner.nextLine(); // Consuma a nova linha pendente

        System.out.println("Qual a idade da vaca?");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consuma a nova linha pendente

        System.out.println("Qual é o peso da vaca?");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consuma a nova linha pendente

        // Usar String.format para formatar a saída (estudar stringBuilder)
        String informacoes = String.format
        ("O id da vaca é %d, a raça da vaca é %s, o tamanho da vaca é %.2f, a idade da vaca é %d e o seu peso é %.2f", id, raca, tamanho, idade, peso);
        System.out.println(informacoes);
        return informacoes;
    }

    
    public void comer (String alimento, int quantidade) {
        System.out.println("Qual a quantidade?");
        quantidade = scanner.nextInt();
        peso = peso + quantidade * 0.05;
        System.out.println("Depois que comeu, a vaca passou a pesar" + peso);
    }
    

    public void ruminar () {
        System.out.println("A Vaca" + registro + "está ruminando");
    }

    public double produzirleite () {
        return peso * 0.05;
    }

  
    public void caminhando(Double distancia) {
       System.out.println("A vaca caminhou " + distancia);
    }


   
 }
