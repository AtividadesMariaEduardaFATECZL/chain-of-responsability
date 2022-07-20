package candidato;

public class EnsinoSuperiorCompleto implements CaculaPontosCandidato {

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            return candidato.getTotalPontos() + 10;
        }
        return new ExperienciaNaArea().acrescentaPonto(candidato);
    }
}
