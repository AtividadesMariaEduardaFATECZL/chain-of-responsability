package candidato;

public class RegistroEmEntidadeDeClasse implements CaculaPontosCandidato {

    @Override
    public int acrescentaPonto(Candidato candidato) {
        return candidato.getTotalPontos() + candidato.getAnosEmEntidadeDeClasse();
    }
}
