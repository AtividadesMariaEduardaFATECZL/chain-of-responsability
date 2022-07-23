package candidato;

public class PontosPorEnsinoMedioCompleto extends PontosCandidato {

    public PontosPorEnsinoMedioCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + 5);
    }

    @Override
    public boolean deveAplicarPara(Candidato candidato) {
        return candidato.isEnsinoMedioCompleto();
    }
}
