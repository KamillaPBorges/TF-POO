
import java.util.List;

public class Turma extends Disciplina {
    private List<Aluno> alunos;
    private Professor professor;

    public Turma(Disciplina disciplina, List<Aluno> alunos) {
        super(disciplina.getId(), disciplina.getNome(), disciplina.getDescricao(), disciplina.getMaxAlunos(),
                disciplina.getCargaHoraria(), disciplina.getMateriaReq());
        this.alunos = alunos;
        this.professor = null;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override // nao fiz essa parte - rever
    public synchronized String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nProfessor: ").append(professor.getNome());
        sb.append("\nAlunos:");

        alunos.stream()
                .map(Aluno::getNome) // Extrai IDs dos alunos
                .forEach(nome -> sb.append("\n- ").append(nome));

        return sb.toString();
    }
}