package controller;

import model.Candidato;

public class EnsinoSuperiorCompleto implements ICandidato {
    @Override
    public int acrescentaPonto(Candidato candidato) {
        if(candidato.isEnsinoSuperiorcompleto()) return 10;
        else return 0;
    }

    @Override
    public void proximaAdicao(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + acrescentaPonto(candidato));
        RegistroEmEntidadeDeClasse registroEmEntidadeDeClasse = new RegistroEmEntidadeDeClasse();
        registroEmEntidadeDeClasse.proximaAdicao(candidato);
    }
}
