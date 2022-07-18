package model.hookClasses;

import model.*;

public class EnsinoSuperiorCompleto implements CaculaPontosCandidato {

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            candidato.setTotalPontos(candidato.getTotalPontos() + 10);
        }
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        RegistroEmEntidadeDeClasse registroEmEntidadeDeClasse = new RegistroEmEntidadeDeClasse();
        registroEmEntidadeDeClasse.proximaAdicao(candidato);
    }
}
