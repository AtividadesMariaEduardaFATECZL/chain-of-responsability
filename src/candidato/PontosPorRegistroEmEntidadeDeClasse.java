package candidato;

public class PontosPorRegistroEmEntidadeDeClasse extends PontosCandidato {

    public PontosPorRegistroEmEntidadeDeClasse() {
        super(null);
    }

    @Override
    public int acrescentaPonto(Candidato candidato) {
        return candidato.getTotalPontos() + candidato.getAnosEmEntidadeDeClasse();
    }
}
