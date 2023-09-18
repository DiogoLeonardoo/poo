package pilhas;
public class Pilha {
    private Nodo topo; // topo da pilha

    public Pilha() {
        this.topo = null;
    }

    // Verifica se a pilha está vazia
    public boolean vazia() {
        return topo == null;
    }

    // Insere um elemento no topo da pilha
    public void Insere(int novoDado) {
        Nodo novoNodo = new Nodo(novoDado, topo);
        topo = novoNodo;
    }


    
   
}