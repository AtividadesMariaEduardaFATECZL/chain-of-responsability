package candidato;

public class PontosPorExperienciaNaArea extends PontosCandidato {

    public PontosPorExperienciaNaArea(PontosCandidato proximo) {
        super(proximo);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosDeExperiencia() * 2);
    }

    @Override
    public boolean deveAplicarPara(Candidato candidato) {
        return candidato.getAnosDeExperiencia() > 0;
    }
}
