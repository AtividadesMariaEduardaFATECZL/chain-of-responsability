package candidato;

public class Candidato {
    private boolean ensinoMedioCompleto;
    private boolean ensinoSuperiorcompleto;
    private int anosEmEntidadeDeClasse;
    private int anosDeExperiencia;
    private int totalPontos = 0;

    public Candidato(boolean ensinoMedioCompleto, boolean ensinoSuperiorcompleto, int anosEmEntidadeDeClasse,
                     int anosDeExperiencia) {
        this.ensinoMedioCompleto = ensinoMedioCompleto;
        this.ensinoSuperiorcompleto = ensinoSuperiorcompleto;
        this.anosEmEntidadeDeClasse = anosEmEntidadeDeClasse;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public boolean temEnsinoMedioCompleto() {
        return ensinoMedioCompleto;
    }

    public int getAnosEmEntidadeDeClasse() {
        return anosEmEntidadeDeClasse;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "ensinoMedioCompleto=" + ensinoMedioCompleto +
                ", ensinoSuperiorcompleto=" + ensinoSuperiorcompleto +
                ", anosEmEntidadeDeClasse=" + anosEmEntidadeDeClasse +
                ", anosDeExperiencia=" + anosDeExperiencia +
                ", totalPontos=" + totalPontos +
                '}';
    }
}
