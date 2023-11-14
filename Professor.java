public class Professor extends Pessoa {
    private int horasAula;

    public Professor(String nome, int matricula, int maxHrs) {
        super(nome, matricula, maxHrs);
        this.horasAula = 0;

    }

    public int getHorasAula() {
        return horasAula;
    }

    public void adicionarHorasAula(int horas) { // adiciona horas de aulas
        this.horasAula += horas;
    } /// da pra lancar uma excecao se passar o numero de horas possiveis para cada
      /// professor

}
