package candidato;

public class PontosPorEnsinoSuperiorCompleto extends PontosCandidato {

    public PontosPorEnsinoSuperiorCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + 10);
    }

    @Override
    public boolean deveAplicarPara(Candidato candidato) {
        return candidato.isEnsinoSuperiorcompleto();
    }
}
