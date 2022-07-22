package candidato;

public class PontosPorExperienciaNaArea extends PontosCandidato {

    public PontosPorExperienciaNaArea(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        if (candidato.getAnosDeExperiencia() > 0) {
            candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosDeExperiencia() * 2);
        }
        proximo.acrescentaPonto(candidato);
    }
}
