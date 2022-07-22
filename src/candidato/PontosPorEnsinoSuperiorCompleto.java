package candidato;

public class PontosPorEnsinoSuperiorCompleto extends PontosCandidato {

    public PontosPorEnsinoSuperiorCompleto(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.isEnsinoSuperiorcompleto()) {
            candidato.setTotalPontos(candidato.getTotalPontos() + 10);
        }
        proximo.acrescentaPonto(candidato);
    }
}
