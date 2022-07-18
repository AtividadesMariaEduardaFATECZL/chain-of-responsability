package model.hookClasses;

import model.Candidato;

public class EnsinoMedioCompleto implements CaculaPontosCandidato {

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            candidato.setTotalPontos(candidato.getTotalPontos() + 5);
        }
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        EnsinoSuperiorCompleto ensinoSuperiorCompleto = new EnsinoSuperiorCompleto();
        ensinoSuperiorCompleto.proximaAdicao(candidato);
    }
}
