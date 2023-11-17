public class Pessoa {
    // pessoa pode ser aluno ou professor
    protected String nome;
    protected int matricula;
    protected int maxHrs; // limite de horas semanal
    protected double horasUsadas; // horas usadas semanalmente

    public Pessoa(String nome, int matricula, int maxHrs) {
        this.nome = nome;
        this.matricula = matricula;
        this.maxHrs = maxHrs;
        horasUsadas = 0.0;
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

    public double getHorasUsadas() {
        return horasUsadas;
    }

    public void addHoras(double horas) { // addicionar horas de aula
        horasUsadas = horasUsadas += horas;
    }

    @Override
    public String toString() {
        String s = "Nome: " + nome;
        s += "\nMatrícula: " + matricula;
        s += "\nCarga-horária máxima: " + maxHrs;
        s += "\nCarga-horária atual: " + horasUsadas;
        return s;
    }

}
