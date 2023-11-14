
import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Disciplina disciplina; // uma turma so pode ter uma disciplina
    private int numAlunos;
    private List<Professor> professores;

    public Turma(Disciplina disciplina, int numAlunos) {
        this.disciplina = disciplina;
        this.numAlunos = numAlunos;
        this.professores = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    // public addAlunos - metodo para adicionar alunos a uma turma

}
