public class Pessoa {
    // pessoa pode ser aluno ou professor
    protected String nome;
    protected int matricula;
    protected int maxHrs; // limite de horas semana

    public Pessoa(String nome, int matricula, int maxHrs) {
        this.nome = nome;
        this.matricula = matricula;
        this.maxHrs = maxHrs;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getMaxHrs() {
        return maxHrs;
    }

    public String getNome() {
        return nome;
    }

}
