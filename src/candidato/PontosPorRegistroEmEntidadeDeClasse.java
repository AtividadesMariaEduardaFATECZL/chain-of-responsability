package candidato;

public class PontosPorRegistroEmEntidadeDeClasse extends PontosCandidato {

    public PontosPorRegistroEmEntidadeDeClasse() {
        super(null);
    }

    @Override
    public void acrescentaPonto(Candidato candidato) {
        candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosEmEntidadeDeClasse());
    }

    @Override
    public boolean deveAplicarPara(Candidato candidato) {
        return true;
    }
}
