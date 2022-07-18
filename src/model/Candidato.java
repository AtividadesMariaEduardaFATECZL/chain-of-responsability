package model;

public class Candidato {
    private boolean ensinoMedioCompleto;
    private boolean ensinoSuperiorcompleto;
    private int anosEmEntidadeDeClasse;
    private int anosDeExperiencia;
    private int totalPontos = 0;

    public boolean temEnsinoMedioCompleto() {
        return ensinoMedioCompleto;
    }

    public void setEnsinoSuperiorcompleto(boolean ensinoSuperiorcompleto) {
        this.ensinoSuperiorcompleto = ensinoSuperiorcompleto;
    }

    public int getAnosEmEntidadeDeClasse() {
        return anosEmEntidadeDeClasse;
    }

    public void setAnosEmEntidadeDeClasse(int anosEmEntidadeDeClasse) {
        this.anosEmEntidadeDeClasse = anosEmEntidadeDeClasse;
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
