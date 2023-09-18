package academico;

public class Professores {

        public String matricula;
        public String nome;
        public String CPF;
        public String email;
        public String admissao;
        public Cursos lotacao;

    public Professores(String matricula,String nome,String CPF, String admissao){
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.admissao = admissao;
        }

    public Professores(String matricula,String nome,String CPF, String admissao, String email){
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.admissao = admissao;
        this.email = email;
        }

    public void alterarLotacao(Cursos lotacao){
        this.lotacao = lotacao;
    }

        public void imprimirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("CPF: " + CPF);
            System.out.println("Admissão: " + admissao);
            System.out.println("Email: " + email);
           
            if (lotacao != null) {
                System.out.println("Lotação: " + lotacao.getNome()); // Método getNome para retornar o nome do curso
            } else {
                System.out.println("Lotação: Não definida");
            }
        } 
    }

        
    

