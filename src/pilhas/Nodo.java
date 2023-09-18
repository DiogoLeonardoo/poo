package pilhas;
public class Nodo {
   
    public int dado;
    public Nodo anterior;
    
    public Nodo(int dado, Nodo nodoAnterior){
        this.dado = dado;
        this.anterior = nodoAnterior;
    }

    public int getDado() {
        return dado;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dado=" + dado + ", anterior=" + anterior + '}';
    }

    



}