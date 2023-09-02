public class vacas {
    
    public int id;
    public String cor;
    public Double tamanho;
    public Double peso;
    
    // Constructor method without parameters (default) 
    public vacas(int id, String cor, Double tamanho, Double peso) {
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
    }
    
    public void comer(String alimento, Double quantidade) {
        peso = peso + (quantidade*0.05);
        System.out.println("A vaca " + id + " comeu " + quantidade + "kg de " + alimento + " e agora pesa " + peso + "kg");
    }

    public void ruminar() {
        System.out.println("A vaca " + id + " está ruminando");
    }

    public Double produzirLeite(Double producao){
        producao = peso*0.02;
        System.out.println("A vaca " + id + " produziu " + producao + " litros de leite");
        return producao;
    }

    public void caminhar(Double distancia){
        System.out.println("A vaca " + id + " caminhou " + distancia + " metros");
    }
}
