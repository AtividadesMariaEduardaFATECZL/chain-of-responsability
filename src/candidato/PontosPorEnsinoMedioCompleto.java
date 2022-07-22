package candidato;

public class PontosPorEnsinoMedioCompleto extends PontosCandidato {

    public PontosPorEnsinoMedioCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.isEnsinoMedioCompleto()) {
            candidato.setTotalPontos(candidato.getTotalPontos() + 5);
        }
        proximo.acrescentaPonto(candidato);
    }
}
