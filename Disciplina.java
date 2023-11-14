
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    ;
    private String nome;
    private int maxAlunos;
    private int horasAulaSemana;
    private List<Professor> professores;
    private List<Turma> turmas;

    public Disciplina(String nome, int maxAlunos, int horasAulaSemana) {
        this.nome = nome;
        this.maxAlunos = maxAlunos;
        this.horasAulaSemana = horasAulaSemana;
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public void cadastrarTurma(int numAlunos) {
        if (numAlunos < 0.2 * maxAlunos) { // se for menor que 20% da quantidade maxima de alunos
            throw new IllegalArgumentException("A quantidade de alunos eh insuficiente para criar uma turma.");
        }

        Turma turma = new Turma(this, numAlunos);
        turmas.add(turma);
    }

    public void alocarProfessores() {
        for (Turma turma : turmas) {
            if (turma.getProfessores().isEmpty()) { // se a turma nao tiver professsor
                contratarProfessor();
            }
        }
    }

    private void contratarProfessor() {
        // Lógica para contratar um novo professor e alocar na turma
    }
}
