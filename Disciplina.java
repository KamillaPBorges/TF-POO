public class Disciplina {
    protected int id;
    protected String nome;
    protected String descricao;
    protected int maxAlunos;
    protected int cargaHoraria;
    protected Materias materiaReq; // materia requerida

    public Disciplina(int id, String nome, String descricao, int maxAlunos, int cargaHoraria, Materias materiaReq) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.maxAlunos = maxAlunos;
        this.cargaHoraria = cargaHoraria;
        this.materiaReq = materiaReq;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Materias getMateriaReq() {
        return materiaReq;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Nome: " + nome;
        s += "\nDescrição: " + descricao;
        s += "\nMatrícula: " + id;
        s += "\nCarga-horária: " + cargaHoraria;
        s += "\nQuantidade máxima de alunos: " + maxAlunos;
        return s;
    }
}