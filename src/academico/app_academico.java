package academico;

import java.util.ArrayList;

public class app_academico {
    
        public static void main(String[] args) {
            ArrayList<Cursos> cursosDoAluno = new ArrayList<>(); //Cria um ArrayList de Cursos (dinâmica)
            ArrayList<Professores> professoresDoCurso = new ArrayList<>(); //Cria um ArrayList de Professores (dinâmica)


            //Instância de professores

            Professores professor1 = new Professores("123", "PROFESSOR1", "123456789-00", "01/01/2010", "professor1@gmail.com");
            
            System.out.println("=====================================");

            Professores professor2 = new Professores("456", "PROFESSOR2", "123456789-00", "01/01/2010", "professor2@gmail.com");
            

            //Fim instância de professores

            System.out.println("=====================================");

            //Instância de cursos

            Cursos curso1 = new Cursos("123"); 
            curso1.nome = "Java";
            cursosDoAluno.add(curso1);  
            curso1.addDocente(professor1);
            curso1.definirCoordenador(professor1);

            System.out.println("=====================================");

            Cursos curso2 = new Cursos("456"); 
            curso2.nome = "C++";
            cursosDoAluno.add(curso2);
            curso2.addDocente(professor2);
            curso2.definirCoordenador(professor2);

            //Fim instância de cursos
            
            System.out.println("=====================================");

            professor1.alterarLotacao(curso1);
            professor2.alterarLotacao(curso2); // ==> Dúvida (se eu adiciono o docente na instanciação do curso, preciso alterar a lotação do professor?)

            //Instância de alunos
            Alunos aluno1 = new Alunos("123", "João", "123456789-00");
            aluno1.matricular("Java");
            aluno1.matricular("Java"); //Como o aluno já está matriculado, não deve ser possível matriculá-lo novamente
            aluno1.matricular("C++");
            aluno1.matricular("C++"); //Como o aluno já está matriculado, não deve ser possível matriculá-lo novamente
            aluno1.imprimirDados();
            //Fim instânciação de alunos

            System.out.println("=====================================");

            professor1.imprimirDados();

            System.out.println("====================================="); // ==> Nenhum campo de professores está sendo impresso. Por quê?

            professor2.imprimirDados();

           
        }
}
