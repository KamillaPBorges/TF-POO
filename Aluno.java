import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<Disciplina> disciplinas; // lista de disciplinas cursadas por cada aluno

    public Aluno(String nome, int matricula) {
        super(nome, matricula, 28); // 28 horas eh o numero maximo de aulas por aluno
        disciplinas = null; // comeca sem materias

    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public boolean addDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            return false;
        }
        if (disciplinas == null) { // se n tiver nenhuma disciplina
            disciplinas = new ArrayList<>();
        }
        return disciplinas.add(disciplina);
    }

    public int contarDisciplinas() {
        if (disciplinas != null) {
            return disciplinas.size();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nTurmas:";
        for (Disciplina disciplina : disciplinas) { // percorrre a lista
            s += "\n- " + disciplina.getNome();
        }
        return s;
    }

}
