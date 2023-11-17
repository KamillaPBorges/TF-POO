import java.util.ArrayList;

public class Professor extends Pessoa {
    private Materias materia;
    private ArrayList<Turma> turmas;

    public Professor(String nome, int matricula, Materias materia) {
        super(nome, matricula, 12);
        this.materia = materia;
        turmas = null;
    }

    // qual materia que ele leciona
    public Materias getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nMatéria: " + materia;
        return s;
    }
}