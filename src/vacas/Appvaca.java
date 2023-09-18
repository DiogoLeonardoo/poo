package vacas;
import java.util.Scanner;
public class Appvaca {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        vaca mimosa = new vaca(null, null, 0, 0, 0);
        mimosa.adicionarInfos();
        System.out.println(mimosa.registro); //Gerador código único

       

       ///////////////////////////////////////////////////////////////////////////////////


        vaca laranjinha = new vaca(null, null, 0, 0, 0);
        System.out.println(laranjinha.registro); //Gerador de um código único. 
        laranjinha.adicionarInfos();
        System.out.println(laranjinha.registro);

        
        
        
        
    }
}
