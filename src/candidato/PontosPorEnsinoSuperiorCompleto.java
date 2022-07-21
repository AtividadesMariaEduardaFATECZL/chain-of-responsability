package candidato;

public class PontosPorEnsinoSuperiorCompleto extends PontosCandidato {

    public PontosPorEnsinoSuperiorCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            return candidato.getTotalPontos() + 10;
        }
        return proximo.acrescentaPonto(candidato);
    }
}
