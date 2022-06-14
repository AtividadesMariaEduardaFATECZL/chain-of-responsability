package controller;

import model.Candidato;

public class ExperienciaNaArea implements ICandidato {
    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.getAnosDeExperiencia() > 0)
            return candidato.getAnosDeExperiencia() * 2;
        else return 0;
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + acrescentaPonto(candidato));
        candidato.setTotalPontos(candidato.getAnosDeExperiencia() * 2);
    }
}
