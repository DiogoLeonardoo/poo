package circunferência;
import java.util.Scanner;

public class Appponto {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        // Instanciando um objeto da classe Pontos
       Pontos ponto1 = new Pontos(0, 0, "azul");
            ponto1.imprimirDados(); // Imprimindo os dados do objeto

            System.out.println("Digite a cor atualizada do ponto: "); 
            ponto1.alterarCor(scanner.next()); // Alterando a cor do objeto
            
        // Imprimindo os dados do objeto
        ponto1.imprimirDados();

        System.out.println("=====================================");
        // Instanciando um objeto da classe Circunferencia (CONSTRUTOR 1 = RAIO E COR DA LINHA)
        Circunferencia c1 = new Circunferencia(4,"Azul");
        c1.area(5);
        c1.perimetro(5);
        c1.imprimirDados();



    }
}