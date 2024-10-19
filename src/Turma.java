import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private String nome;
    private String codigo;

    public Turma(String nome, String codigo) {
        this.alunos = new ArrayList<>();
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        int anoAtual = java.time.Year.now().getValue();
        String novoRga = nome + "/" + anoAtual + "-" + aluno.getCpf();
        aluno.matricular(novoRga);
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void removerTodosAlunos() {
        alunos.clear();
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Posição do ArrayList [" + i + "] " + aluno.getNome() + "/" + aluno.getRga());
        }
    }
}
