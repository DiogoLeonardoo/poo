package academico;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alunos {

    public String matricula;
    public String nome;
    public String CPF;
    public String email;
    public ArrayList<Cursos> cursos = new ArrayList<>();

    public class Cursos {
        private String nome;

        public Cursos(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public Alunos(String matricula, String nome, String CPF) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
    }

    public Alunos(String matricula, String nome, String CPF, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public void matricular(String nomeDoCurso) {
        // Verifica se o curso já está na lista de cursos do aluno
        for (Cursos curso : cursos) {
            if (curso.getNome().equals(nomeDoCurso)) {
                System.out.println("O aluno já está matriculado neste curso.");
                return;
            }
        }

        // Se o curso não estiver na lista, cria um novo objeto Cursos e adiciona à lista
        Cursos novoCurso = new Cursos(nomeDoCurso);
        cursos.add(novoCurso);
        System.out.println("Matrícula realizada com sucesso.");
    }

    public boolean containsCurso(String nomeDoCurso) {
        for (Cursos curso : cursos) {
            if (curso.getNome().equals(nomeDoCurso)) {
                return true;
            }
        }
        return false;
    }

    public void imprimirCursos() {
        System.out.println("Cursos matriculados por " + nome + ":");
        for (Cursos curso : cursos) {
            System.out.println("Curso: " + curso.getNome());
        }
    }

    public void imprimirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("E-mail: " + email);
        imprimirCursos();
    }
}

    
    

