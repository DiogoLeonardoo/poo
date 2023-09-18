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

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Admissão: " + this.admissao);
        System.out.println("E-mail: " + this.email);
        System.out.println("Lotação: " + this.lotacao.getNome());
    }
}
