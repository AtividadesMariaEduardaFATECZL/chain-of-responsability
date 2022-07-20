package candidato;

public class ExperienciaNaArea implements CaculaPontosCandidato {

    @Override
    public int acrescentaPonto(Candidato candidato) {
        if (candidato.getAnosDeExperiencia() > 0) {
            candidato.setTotalPontos(candidato.getTotalPontos() + candidato.getAnosDeExperiencia() * 2);
        }
        return new RegistroEmEntidadeDeClasse().acrescentaPonto(candidato);
    }
}
