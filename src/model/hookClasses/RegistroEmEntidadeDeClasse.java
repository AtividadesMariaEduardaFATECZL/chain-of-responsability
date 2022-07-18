package model.hookClasses;

import model.Candidato;

public class RegistroEmEntidadeDeClasse implements CaculaPontosCandidato {

    @Override
    public void acrescentaPonto(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosEmEntidadeDeClasse());
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        ExperienciaNaArea experienciaNaArea = new ExperienciaNaArea();
        experienciaNaArea.proximaAdicao(candidato);
    }
}
