import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<Disciplina> disciplinas; // lista de disciplinas cursadas por cada aluno

    public Aluno(String nome, int matricula) {
        super(nome, matricula, 28); // 28 horas eh o numero maximo de aulas por aluno
        this.disciplinas = new ArrayList<>();
        this.horasUsadas = 0;
    }

    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public boolean addDisciplina(Disciplina disciplina) { //
        // Adicione lógica para verificar a carga horária do aluno e se a disciplina já
        // foi adicionada
        if (horasUsadas + disciplina.getCargaHoraria() <= 28 && !disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            horasUsadas += disciplina.getCargaHoraria();
            return true;
        }
        return false;
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
