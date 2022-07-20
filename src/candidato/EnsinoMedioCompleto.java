package candidato;

public class EnsinoMedioCompleto implements CaculaPontosCandidato {

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            return candidato.getTotalPontos() + 5;
        }
        return new EnsinoSuperiorCompleto().acrescentaPonto(candidato);
    }
}
