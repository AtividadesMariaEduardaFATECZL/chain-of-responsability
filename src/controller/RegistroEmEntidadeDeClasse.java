package controller;

import model.Candidato;

public class RegistroEmEntidadeDeClasse implements ICandidato {
    @Override
    public int acrescentaPonto(Candidato candidato) {
        return candidato.getAnosEmEntidadeDeClasse();
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + acrescentaPonto(candidato));
        ExperienciaNaArea experienciaNaArea = new ExperienciaNaArea();
        experienciaNaArea.proximaAdicao(candidato);
    }
}
