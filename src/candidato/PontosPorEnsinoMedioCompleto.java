package candidato;

public class PontosPorEnsinoMedioCompleto extends PontosCandidato {

    public PontosPorEnsinoMedioCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.temEnsinoMedioCompleto()) {
            return candidato.getTotalPontos() + 5;
        }
        return proximo.acrescentaPonto(candidato);
    }
}
