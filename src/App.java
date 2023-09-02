public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        vacas mimosa = new vacas (1, "preta", 1.5, 200.0);
        
        mimosa.comer("capim", 10.0);
        mimosa.ruminar();
        mimosa.produzirLeite(0.0);
        mimosa.caminhar(100.0);
    }
}
