package model.hookClasses;

import model.Candidato;

public class ExperienciaNaArea implements CaculaPontosCandidato {

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.getAnosDeExperiencia() > 0) {
            candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosDeExperiencia() * 2);
        }
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        candidato.setTotalPontos(candidato.getAnosDeExperiencia() * 2);
    }
}
