package academico;

public class Curso {

    public String codigo;
    public String nome;
    public String descricao;
    public Professores coordenador;
    public Professores[] docentes = new Professores[10]; 
    private int numDocentes = 0; // Contador de docentes

    public Curso(String codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public  void addDocente(Professores docente) {
        if (numDocentes < 10) {
            docentes[numDocentes] = docente;
            numDocentes++;
        } else {
            System.out.println("Não é possível adicionar mais docentes.");
        }
        
    
    }

    public void definirCoordenador(Professores professor) {
        this.coordenador = professor;
    }

    public void imprimirDados(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Coordenador: " + this.coordenador.nome);
        System.out.println("Docentes: ");
        for (int i = 0; i < numDocentes; i++) {
            System.out.println(docentes[i].nome);
        }
    }
    
}
