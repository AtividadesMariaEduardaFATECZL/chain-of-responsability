package controller;

import model.Candidato;

public class EnsinoMedioCompleto implements ICandidato {

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.isEnsinoMedioCompleto()) return 5;
        else return 0;
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + acrescentaPonto(candidato));
        EnsinoSuperiorCompleto ensinoSuperiorCompleto = new EnsinoSuperiorCompleto();
        ensinoSuperiorCompleto.proximaAdicao(candidato);
    }
}
